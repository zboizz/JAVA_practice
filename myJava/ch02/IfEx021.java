package ch02;

import java.util.Scanner;

public class IfEx021 {

		public static void main(String[] args) {
			
			// ��� or ����
			// ¦�� or Ȧ��
			// 3�� ��� ����
			// ex) �Է��� ���� -10 -> ���� ¦�� 3�� ��� �ƴ�
			// ex) �Է��� ����  15 -> ��� Ȧ�� 3�� ���.
			
			Scanner sc=new Scanner(System.in);
			System.out.println("���ڸ� �Է��ϼ���");
			
						
			int a = sc.nextInt();
			if(a>=0) {
				System.out.println("���");
			}else{
				System.out.println("����");
			}if(a%2==0) {
				System.out.println("¦��");
			}else{
				System.out.println("Ȧ��");
			}if(a%3==0) {
				System.out.println("3�� ���");
			}else{
				System.out.println("3�� ����� �ƴ�");
			}sc.close();
		}
}