package ch15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ChatServer02 {

	Vector<ClientThread> vc;
	ServerSocket server;
	
	public ChatServer02() {
		try {
			server = new ServerSocket(8002);
			vc = new Vector<ClientThread>();
		} catch (Exception e) {
			System.err.println("Error in Server");
			e.printStackTrace();
			System.exit(1);//���������� ����
		}
		System.out.println("****************************");
		System.out.println("Chat2.0 Ŭ���̾�Ʈ�� ������ ��ٸ��� �ֽ��ϴ�.");
		System.out.println("****************************");
		try {
			while(true){
				Socket sock = server.accept();
				ClientThread ct = new ClientThread(sock);
				ct.start();
				vc.add(ct);
			}
		} catch (Exception e) {
			System.err.println("Error in Socket");
			e.printStackTrace();
		}
	}
	
	//���ӵ� ��� Ŭ���̾�Ʈ���� �޼��� ����
	public void sendAllMessage(String msg){
		for (int i = 0; i < vc.size(); i++) {
			ClientThread ct = vc.get(i);
			ct.sendMessage(msg);
		}
	}
	
	//Vector�� Client�� ����
	public void removeClient(ClientThread ct){
		vc.remove(ct);
	}
	
	class ClientThread extends Thread{
		
		Socket sock;
		BufferedReader in;
		PrintWriter out;
		String id = "�͸�";
		
		public ClientThread(Socket sock) {
			try {
				this.sock = sock;
				in = new BufferedReader(
						new InputStreamReader(
								sock.getInputStream()));
				out = new PrintWriter(
						sock.getOutputStream(),true);
				System.out.println(sock+" ���ӵ�....");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			try {
				out.println("����Ͻ� ���̵� �Է��ϼ���.");
				while(true) {
					String line = in.readLine();
					if(line==null)
						break;
					else
						routine(line);
				}
			} catch (Exception e) {
				removeClient(this);
				System.err.println(sock +"["+id+"] ������.");
			}
		}
		
		//Client���� ���۵� Protocol�� �м��ϴ� �޼ҵ�
		public void routine(String line){
			System.out.println("line :" + line);
			//CHATALL: ������ �ݿ����Դϴ�. ���Ͻ�?
			int idx = line.indexOf(':');
			String cmd = line.substring(0, idx); //CHATALL
			String data = line.substring(idx+1); //������ �ݿ���
			
			//ID:ȫ�浿
			if(cmd.equals(ChatProtocol02.ID)) {
				if(data!=null&&data.length()>0) {
					id = data;
				//���ο� �����ڰ� �߰��Ǿ��� ������ ����Ʈ ������
					sendAllMessage(ChatProtocol02.CHATLIST+":"+getIds());
					sendAllMessage(ChatProtocol02.CHATALL+":"+"["+id+"]���� �����Ͽ����ϴ�.");
			}
			}else if(cmd.equals(ChatProtocol02.CHAT)) {
				//CHAT:bbb;���� -> aaa�����ڰ� bbb���� '����?'��� �ӼӸ� ä��
				idx = data.indexOf(';');
				cmd = data.substring(0,idx); //bbb
				data = data.substring(idx+1);
				
				ClientThread ct = findClient(cmd); //bbb
				if(ct != null) { //�������� �����ڰ� ���Դٸ�
					ct.sendMessage(ChatProtocol02.CHAT+":"+"["+id+"(S)]"+data); //
					sendMessage(ChatProtocol02.CHAT+":"+"["+id+"(S)]"+data);
			}else {
				sendMessage(ChatProtocol02.CHAT + ":" + "["+cmd+"]�����ڰ� �ƴմϴ�.");
			}
			
			}else if(cmd.equals(ChatProtocol02.MESSAGE)) {
				//MESSAGE: bbb;�� ����
				idx = data.indexOf(';');
				cmd = data.substring(0,idx); //bbb
				data = data.substring(idx+1);
				
				ClientThread ct = findClient(cmd);
				if(ct!=null) {
					//bbb���� ����
					ct.sendMessage(ChatProtocol02.MESSAGE + ":"+ id/*aaa*/+";"+data);
				}else {
					//�� �ڽſ��� ����
					sendMessage(ChatProtocol02.CHAT + ":" + "["+cmd+"]�����ڰ� �ƴմϴ�.");
				}
				
			}else if(cmd.equals(ChatProtocol02.CHATALL)) {
				sendAllMessage(ChatProtocol02.CHATALL+":"+"["+id+"]"+data);
			}
			
		}//routine
		
		//�Ű������� ���� id������ ClientThread2�� ã�´�.
		public ClientThread findClient(String id){
			ClientThread ct = null;
			for (int i = 0; i < vc.size(); i++) {
				ct = vc.get(i);
				if(ct.id.equals(id))
					break;				
			}
			return ct;
		}
		
		//���ӵ� ��� id�� ����(; ���� - ex)aaa;bbb;ȫ�浿;)
		public String getIds() {
			String ids = "";
			for (int i = 0; i < vc.size(); i++) {
				ClientThread ct = vc.get(i);
				ids += ct.id +";";
			}
			return ids;
			
		}
	
		public void sendMessage(String msg){
			out.println(msg);
		}
	}
	
	public static void main(String[] args) {
		new ChatServer02();
	}
}