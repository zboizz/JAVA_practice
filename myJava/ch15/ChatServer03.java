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
			System.exit(1);//비정상적인 종료
		}
		System.out.println("****************************");
		System.out.println("Welcome ChatServer03...");
		System.out.println("클라이언트의 접속을 기다리고 있습니다.");
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
				//e.printStackTrace();
			}
		}
		
		//Client부터 전송된 Protocol을 분석 메소드
		public void routine(String line){
			System.out.println("line : " + line);
			//CHATALL:오늘은 비가 옵니다. 머가 생각나나요?
			int idx = line.indexOf(':');
			String cmd/*CHATALL*/ = line.substring(0, idx);
			String data/*오늘은...*/ = line.substring(idx+1);
			if(cmd.equals(ChatProtocol03.ID)) { //ID : aaa;1234 이렇게 날라옴
				idx = data.indexOf(';');
				cmd = data.substring(0,idx); //aaa 로 날라옴
				data = data.substring(idx+1); //1234 로 날라옴
				
				if(dbMgr.loginChk(cmd, data)) { //로그인 성공했을 때
					id = cmd;
					sendMessage(ChatProtocol03.ID+ ":" +"T");
					sendMessage(ChatProtocol03.CHATLIST+ ":" + getIds());
					sendMessage(ChatProtocol03.CHATALL+ ":" +"["+id+"]님이 입장하셨습니다.");
					
				}else{ //로그인 실패했을 때
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
							"["+cmd+"] 접속자가 아닙니다.");
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
					//내자신에게 전송
					sendMessage(ChatProtocol03.CHAT+":"+
							"["+cmd+"] 접속자가 아닙니다.");
				}
			}else if(cmd.equals(ChatProtocol03.CHATALL)) {
				sendAllMessage(ChatProtocol03.CHATALL+
						":"+"["+id+"]"+ data);
			}
		}//routine
		
		//매개변수로 받은 id값으로 ClientThread을 찾는다.
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