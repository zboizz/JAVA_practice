package ch03;

import java.util.Scanner;

public class ExceptionEx01 {
	public static void main(String[] args) {
		//Exception: �������� ���� ��Ȳ
		//����ó�� : ���ܰ� �߻����� �� �����ϰ� ��ó
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("�Է¹��� �� ���ڸ� �����ô�.");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a/b;
			System.out.println("��� : " + c);
		}catch(Exception e) {                          //����ó��
			System.out.println("0�Է� �ȵ˴ϴ�.");
		}
	}
}
