package ch02;

import java.util.Scanner;

public class OperatorEx01 {
	public static void main(String[] args) {
		//SUN ���� �����Ǵ� �������� ������ a�� b�� �ָ� �̷��.
		int a = 10;
		int b = 3;
		//Math.max(a, b);
		//System.out.println(Math.max(a,b));
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//�Է��� ���� ¦������ Ȧ������ ����ϼ���
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		int c = sc.nextInt();
		if(c%2==0) {
			System.out.println(c+ "��(��) ¦��");
		}else {
			System.out.println(c+ "��(��) Ȧ��");
		}
		sc.close();
	}
}
