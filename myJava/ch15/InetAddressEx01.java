package ch15;

import java.net.InetAddress;

public class InetAddressEx01 {
	public static void main(String[] args) {
		try {
			InetAddress add = InetAddress.getLocalHost();
			//getLocalHost(): ����ȣ��Ʈ�� InetAddress ��ü�� ��ȯ
			System.out.println("������ǻ�� �̸� : " +add.getHostName());
			System.out.println("������ǻ�� IP : " +add.getHostAddress());
			add = InetAddress.getByName("auction.co.kr");
			System.out.println("���� IP : " +add.getHostAddress());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}