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
	Vector<ClientThread> vc; //������ Ŭ���̾�Ʈ�� ����ϴ� ��ü�� �ϳ��� ���� ����
	String id;
	
	public ChatServer01() {
	try {
		server = new ServerSocket(8001); //�������� �����
		vc = new Vector<ClientThread>(); //���ͼ���
		
	} catch (Exception e) {
		System.err.println("���� ����");
		e.printStackTrace();
		System.exit(1); //���������� ����
		}
	System.out.println("************************************");
	System.out.println("Ŭ���̾�Ʈ ������ ��ٸ��� �ֽ��ϴ�.");
	System.out.println("************************************");
	
	try {
		while(true) {
			Socket sock = server.accept();
			ClientThread ct = new ClientThread(sock);
			ct.start(); //Thread �����ٷ����� ��� ->run ȣ��
			vc.addElement(ct); //���ӵ� Client���� Vector ����
		}//----->while		
		//�ϳ��� �������� ���� Ŭ���̾�Ʈ���� �޽����� ���ÿ� �ִ� ���� �Ұ����ϱ⶧����
		//�ٸ� �������� �޽����� �佺�Ͽ� Ŭ���̾�Ʈ���� �����ؾ��Ѵ�.
		//�̸� �����ϱ� ���ؼ� Vector�� ����Ѵ�.
		
		
	} catch (Exception e) {
		System.err.println("���� ����");
		e.printStackTrace();
		}		
	}
	
	//���ӵ� ��� Ŭ���̾�Ʈ���� �޼��� ���� 
	public void sendAllMessage(String msg) {
		//Vector���� ���ӵ� ��� Client�� �����´�.
		for (int i = 0; i < vc.size(); i++) { //vector�̱⿡ vc.size()
 			ClientThread ct = vc.get(i);
 			ct.sendMessage(msg);  //Vector�� �ִ� ��� �޽����� �����´�.
 			
			
		}
	}
	
	
	class ClientThread extends Thread{
		
		//�ʵ� 4��
		Socket sock;
		BufferedReader in;
		PrintWriter out;
		String id;
		
		
		//������ 1�� : socket���� in�� out�� ���Ϲް� �ֿܼ� socket�� ������ ���
		public ClientThread(Socket sock) {
			
			try {
				this.sock = sock;
				in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				out = new PrintWriter(sock.getOutputStream(), true); //auto flush
				System.out.println(sock + "���ӵ�");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
		
		@Override
		public void run() {	
			try {
			//Client�� ���ʿ� �����ϸ� �޴� �޽���
				out.println("����Ͻ� ���̵� �Է��ϼ���.");
				
			//Client�� ���̵� �Է��ϰ� ������ ����
				id = in.readLine();
				
			//������ ��� ������� ���� �޽����� ������.
				sendAllMessage("["+id+"]�� �����ϼ̽��ϴ�.");
				
			//ä�� ����
				String data = "";
				while(true) {
					data = in.readLine();
					if(data==null) //Client�� ������ ������
						break;
					sendAllMessage("["+id+"]"+data);					
				}//---while
				in.close();
				out.close();
			} catch (Exception e) {
				//������ �������� Vector���� Client ����
				
				vc.remove(this);
				System.err.println(sock + "������...");
				e.printStackTrace();
			}
		}
				
		//Ŭ���̾�Ʈ���� �޽����� ������ ���
		public void sendMessage(String msg) {
			out.print(msg); //�������� Ŭ���̾�Ʈ���� msg
		}
	}
	
	public static void main(String[] args) {
		new ChatServer01();
	}

}
