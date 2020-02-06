package ch15;

import java.net.InetAddress;

public class InetAddressEx01 {
	public static void main(String[] args) {
		try {
			InetAddress add = InetAddress.getLocalHost();
			//getLocalHost(): 로컬호소트의 InetAddress 객체를 반환
			System.out.println("로컬컴퓨터 이름 : " +add.getHostName());
			System.out.println("로컬컴퓨터 IP : " +add.getHostAddress());
			add = InetAddress.getByName("auction.co.kr");
			System.out.println("옥션 IP : " +add.getHostAddress());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}