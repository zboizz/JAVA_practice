package ch0301;

import java.util.Scanner;

public class ExceptionEx01 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("나눌 두 숫자를 입력하세요.");
			System.out.print("나뉨수 : " );
			int a = sc.nextInt();
			System.out.print("나눗수 : " );
			int b = sc.nextInt();
			System.out.println("result : " + a/b);
			sc.close();
		}catch(Exception e) {
			System.err.println("0으로 나눌 수 없습니다.");
			System.err.println("예외메세지 : " + e.getMessage());
		}
	}
}