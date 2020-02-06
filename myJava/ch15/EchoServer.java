package ch15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public EchoServer() {
		try {
			int cnt = 0; //Client에 몇명이 접속했는지 알아보기 위하여
			ServerSocket server = new ServerSocket(8000);
			
			System.out.println("ServerSocket Start****");
			
			while(true) {//24시간 365일 항상 실행을 위해서 무한반복
				Socket sock = server.accept(); //Client가 접속할때까지 wait.
				EchoThread et = new EchoThread(sock);
				et.start();
				cnt++;
				System.out.println("Client" + cnt + "Scocket");
				
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//클라이언트를 각각 반응하기위한 내부클래스를 선언. Thread 상속
	
	class EchoThread extends Thread{
		
		Socket sock;
		BufferedReader in; //Client가 보내는 메세지를 받는 스트림
		PrintWriter out; //Client에게 메세지를 보내는 스트림
		
		
		public EchoThread(Socket sock) {
			try {
				this.sock = sock;
				in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				out = new PrintWriter(sock.getOutputStream(), true); //auto flush
						
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		@Override //Client와 Echo 기능 구현
		public void run() {
			try {
				//최초 클라이언트에게 보내는 메세지
				out.println("Hello Enter BYB to exit");
				while(true) {
					String line = in.readLine();
					if(line==null)
						break;//Client가 연결을 끊을때
					else {
						out.println("Echo : " + line);//반사
						if(line.equals("BYB"))
							break;
					}
				}
				out.close();
				in.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		new EchoServer();
	}

}
