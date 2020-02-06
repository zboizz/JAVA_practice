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
			System.exit(1);//비정상적인 종료
		}
		System.out.println("****************************");
		System.out.println("Chat2.0 클라이언트의 접속을 기다리고 있습니다.");
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
	
	//접속된 모든 클라이언트에게 메세지 전송
	public void sendAllMessage(String msg){
		for (int i = 0; i < vc.size(); i++) {
			ClientThread ct = vc.get(i);
			ct.sendMessage(msg);
		}
	}
	
	//Vector에 Client를 제거
	public void removeClient(ClientThread ct){
		vc.remove(ct);
	}
	
	class ClientThread extends Thread{
		
		Socket sock;
		BufferedReader in;
		PrintWriter out;
		String id = "익명";
		
		public ClientThread(Socket sock) {
			try {
				this.sock = sock;
				in = new BufferedReader(
						new InputStreamReader(
								sock.getInputStream()));
				out = new PrintWriter(
						sock.getOutputStream(),true);
				System.out.println(sock+" 접속됨....");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			try {
				out.println("사용하실 아이디를 입력하세요.");
				while(true) {
					String line = in.readLine();
					if(line==null)
						break;
					else
						routine(line);
				}
			} catch (Exception e) {
				removeClient(this);
				System.err.println(sock +"["+id+"] 끊어짐.");
			}
		}
		
		//Client부터 전송된 Protocol을 분석하는 메소드
		public void routine(String line){
			System.out.println("line :" + line);
			//CHATALL: 오늘은 금요일입니다. 뭐하실?
			int idx = line.indexOf(':');
			String cmd = line.substring(0, idx); //CHATALL
			String data = line.substring(idx+1); //오늘은 금요일
			
			//ID:홍길동
			if(cmd.equals(ChatProtocol02.ID)) {
				if(data!=null&&data.length()>0) {
					id = data;
				//새로운 접속자가 추가되었기 때문에 리스트 재전송
					sendAllMessage(ChatProtocol02.CHATLIST+":"+getIds());
					sendAllMessage(ChatProtocol02.CHATALL+":"+"["+id+"]님이 입장하였습니다.");
			}
			}else if(cmd.equals(ChatProtocol02.CHAT)) {
				//CHAT:bbb;뭐해 -> aaa접속자가 bbb에게 '머해?'라는 귓속말 채팅
				idx = data.indexOf(';');
				cmd = data.substring(0,idx); //bbb
				data = data.substring(idx+1);
				
				ClientThread ct = findClient(cmd); //bbb
				if(ct != null) { //정상적인 접속자가 들어왔다면
					ct.sendMessage(ChatProtocol02.CHAT+":"+"["+id+"(S)]"+data); //
					sendMessage(ChatProtocol02.CHAT+":"+"["+id+"(S)]"+data);
			}else {
				sendMessage(ChatProtocol02.CHAT + ":" + "["+cmd+"]접속자가 아닙니다.");
			}
			
			}else if(cmd.equals(ChatProtocol02.MESSAGE)) {
				//MESSAGE: bbb;밥 먹자
				idx = data.indexOf(';');
				cmd = data.substring(0,idx); //bbb
				data = data.substring(idx+1);
				
				ClientThread ct = findClient(cmd);
				if(ct!=null) {
					//bbb에게 전송
					ct.sendMessage(ChatProtocol02.MESSAGE + ":"+ id/*aaa*/+";"+data);
				}else {
					//내 자신에게 전송
					sendMessage(ChatProtocol02.CHAT + ":" + "["+cmd+"]접속자가 아닙니다.");
				}
				
			}else if(cmd.equals(ChatProtocol02.CHATALL)) {
				sendAllMessage(ChatProtocol02.CHATALL+":"+"["+id+"]"+data);
			}
			
		}//routine
		
		//매개변수로 받은 id값으로 ClientThread2을 찾는다.
		public ClientThread findClient(String id){
			ClientThread ct = null;
			for (int i = 0; i < vc.size(); i++) {
				ct = vc.get(i);
				if(ct.id.equals(id))
					break;				
			}
			return ct;
		}
		
		//접속된 모든 id를 리턴(; 구분 - ex)aaa;bbb;홍길동;)
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