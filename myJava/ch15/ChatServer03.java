package ch15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ChatServer03 {

	Vector<ClientThread> vc;
	ServerSocket server;
	ChatMgr03 dbMgr;
	
	public ChatServer03() {
		try {
			server = new ServerSocket(8003);
			vc = new Vector<ClientThread>();
			dbMgr = new ChatMgr03();
		} catch (Exception e) {
			System.err.println("Error in Server");
			e.printStackTrace();
			System.exit(1);//���������� ����
		}
		System.out.println("****************************");
		System.out.println("Welcome ChatServer03...");
		System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��� �ֽ��ϴ�.");
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
				//e.printStackTrace();
			}
		}
		
		//Client���� ���۵� Protocol�� �м� �޼ҵ�
		public void routine(String line){
			System.out.println("line : " + line);
			//CHATALL:������ �� �ɴϴ�. �Ӱ� ����������?
			int idx = line.indexOf(':');
			String cmd/*CHATALL*/ = line.substring(0, idx);
			String data/*������...*/ = line.substring(idx+1);
			if(cmd.equals(ChatProtocol03.ID)) { //ID : aaa;1234 �̷��� �����
				idx = data.indexOf(';');
				cmd = data.substring(0,idx); //aaa �� �����
				data = data.substring(idx+1); //1234 �� �����
				
				if(dbMgr.loginChk(cmd, data)) { //�α��� �������� ��
					id = cmd;
					sendMessage(ChatProtocol03.ID+ ":" +"T");
					sendMessage(ChatProtocol03.CHATLIST+ ":" + getIds());
					sendMessage(ChatProtocol03.CHATALL+ ":" +"["+id+"]���� �����ϼ̽��ϴ�.");
					
				}else{ //�α��� �������� ��
					sendMessage(ChatProtocol03.ID+":"+"F");
				}
				
				
			}else if(cmd.equals(ChatProtocol03.CHAT)) {
				idx = data.indexOf(';');
				cmd = data.substring(0, idx);
				data = data.substring(idx+1);
				ClientThread ct = findClient(cmd);
				if(ct!=null) {
					ct.sendMessage(ChatProtocol03.CHAT+":"+
							"["+id+"(S)]"+data);
				}else {
					sendMessage(ChatProtocol03.CHAT+":"+
							"["+cmd+"] �����ڰ� �ƴմϴ�.");
				}
			}else if(cmd.equals(ChatProtocol03.MESSAGE)) {
				idx = data.indexOf(';');
				cmd = data.substring(0, idx);
				data = data.substring(idx+1);
				ClientThread ct = findClient(cmd);
				if(ct!=null) {
					ct.sendMessage(ChatProtocol03.MESSAGE+":"+
							 id +";"+data);
				}else {
					//���ڽſ��� ����
					sendMessage(ChatProtocol03.CHAT+":"+
							"["+cmd+"] �����ڰ� �ƴմϴ�.");
				}
			}else if(cmd.equals(ChatProtocol03.CHATALL)) {
				sendAllMessage(ChatProtocol03.CHATALL+
						":"+"["+id+"]"+ data);
			}
		}//routine
		
		//�Ű������� ���� id������ ClientThread�� ã�´�.
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
				ids+=ct.id+";";
			}
			return ids;
		}
	
		public void sendMessage(String msg){
			out.println(msg);
		}
	}
	
	public static void main(String[] args) {
		new ChatServer03();
	}
}