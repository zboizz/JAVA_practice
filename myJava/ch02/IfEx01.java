package ch02;

import java.util.Scanner;

public class IfEx01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// �Է��� ���ڰ� 3�� ������� �ƴ��� ����ϼ���.
		System.out.println("���ڸ� �Է��ϼ���");
		int a = sc.nextInt();
		/*System.out.println("�Է��� ���ڴ� " + a + "��(��) 3��");
		if(a%3==0) {
			System.out.println("����Դϴ�.");
		}else {
			System.out.println("����� �ƴմϴ�.");
		}*/
		
		
		//���� �����ڷ� �Ȱ��� ����� ����
		String s = (a%3==0)?"��(��) 3�� ����Դϴ�.":"��(��) 3�� ����� �ƴմϴ�.";
		System.out.println(s);
		sc.close();
	}
}
