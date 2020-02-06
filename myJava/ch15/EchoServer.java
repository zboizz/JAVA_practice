package ch15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public EchoServer() {
		try {
			int cnt = 0; //Client�� ����� �����ߴ��� �˾ƺ��� ���Ͽ�
			ServerSocket server = new ServerSocket(8000);
			
			System.out.println("ServerSocket Start****");
			
			while(true) {//24�ð� 365�� �׻� ������ ���ؼ� ���ѹݺ�
				Socket sock = server.accept(); //Client�� �����Ҷ����� wait.
				EchoThread et = new EchoThread(sock);
				et.start();
				cnt++;
				System.out.println("Client" + cnt + "Scocket");
				
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Ŭ���̾�Ʈ�� ���� �����ϱ����� ����Ŭ������ ����. Thread ���
	
	class EchoThread extends Thread{
		
		Socket sock;
		BufferedReader in; //Client�� ������ �޼����� �޴� ��Ʈ��
		PrintWriter out; //Client���� �޼����� ������ ��Ʈ��
		
		
		public EchoThread(Socket sock) {
			try {
				this.sock = sock;
				in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				out = new PrintWriter(sock.getOutputStream(), true); //auto flush
						
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		@Override //Client�� Echo ��� ����
		public void run() {
			try {
				//���� Ŭ���̾�Ʈ���� ������ �޼���
				out.println("Hello Enter BYB to exit");
				while(true) {
					String line = in.readLine();
					if(line==null)
						break;//Client�� ������ ������
					else {
						out.println("Echo : " + line);//�ݻ�
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
