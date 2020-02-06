package ch15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ChatServer01 {

	ServerSocket server;
	BufferedReader in;
	Vector<ClientThread> vc; //접속한 클라이언트를 담당하는 객체를 하나로 묶는 역할
	String id;
	
	public ChatServer01() {
	try {
		server = new ServerSocket(8001); //서버소켓 만들기
		vc = new Vector<ClientThread>(); //벡터선언
		
	} catch (Exception e) {
		System.err.println("서버 에러");
		e.printStackTrace();
		System.exit(1); //비정상적인 종료
		}
	System.out.println("************************************");
	System.out.println("클라이언트 접속을 기다리고 있습니다.");
	System.out.println("************************************");
	
	try {
		while(true) {
			Socket sock = server.accept();
			ClientThread ct = new ClientThread(sock);
			ct.start(); //Thread 스케줄러에게 등록 ->run 호출
			vc.addElement(ct); //접속된 Client에게 Vector 저장
		}//----->while		
		//하나의 서버에서 여러 클라이언트에게 메시지를 동시에 주는 것은 불가능하기때문에
		//다른 서버에게 메시지를 토스하여 클라이언트에게 전달해야한다.
		//이를 실현하기 위해서 Vector를 사용한다.
		
		
	} catch (Exception e) {
		System.err.println("소켓 에러");
		e.printStackTrace();
		}		
	}
	
	//접속된 모든 클라이언트에게 메세지 전송 
	public void sendAllMessage(String msg) {
		//Vector에서 접속된 모든 Client를 가져온다.
		for (int i = 0; i < vc.size(); i++) { //vector이기에 vc.size()
 			ClientThread ct = vc.get(i);
 			ct.sendMessage(msg);  //Vector에 있는 모든 메시지를 가져온다.
 			
			
		}
	}
	
	
	class ClientThread extends Thread{
		
		//필드 4개
		Socket sock;
		BufferedReader in;
		PrintWriter out;
		String id;
		
		
		//생성자 1개 : socket에서 in과 out을 리턴받고 콘솔에 socket의 정보를 출력
		public ClientThread(Socket sock) {
			
			try {
				this.sock = sock;
				in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				out = new PrintWriter(sock.getOutputStream(), true); //auto flush
				System.out.println(sock + "접속됨");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
		
		@Override
		public void run() {	
			try {
			//Client가 최초에 접속하면 받는 메시지
				out.println("사용하실 아이디를 입력하세요.");
				
			//Client는 아이디를 입력하고 서버로 전송
				id = in.readLine();
				
			//접속한 모든 사람에게 입장 메시지를 보낸다.
				sendAllMessage("["+id+"]님 입장하셨습니다.");
				
			//채팅 시작
				String data = "";
				while(true) {
					data = in.readLine();
					if(data==null) //Client의 접속이 끊어짐
						break;
					sendAllMessage("["+id+"]"+data);					
				}//---while
				in.close();
				out.close();
			} catch (Exception e) {
				//접속이 끊어지면 Vector에서 Client 제거
				
				vc.remove(this);
				System.err.println(sock + "끊어짐...");
				e.printStackTrace();
			}
		}
				
		//클라이언트에게 메시지를 보내는 기능
		public void sendMessage(String msg) {
			out.print(msg); //서버에서 클라이언트에게 msg
		}
	}
	
	public static void main(String[] args) {
		new ChatServer01();
	}

}
