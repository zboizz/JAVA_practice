package ch0301;

import java.util.Scanner;

public class ExceptionEx01 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("���� �� ���ڸ� �Է��ϼ���.");
			System.out.print("������ : " );
			int a = sc.nextInt();
			System.out.print("������ : " );
			int b = sc.nextInt();
			System.out.println("result : " + a/b);
			sc.close();
		}catch(Exception e) {
			System.err.println("0���� ���� �� �����ϴ�.");
			System.err.println("���ܸ޼��� : " + e.getMessage());
		}
	}
}