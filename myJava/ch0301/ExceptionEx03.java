package ch0301;

import java.util.Scanner;

public class ExceptionEx03 {
	public static void main(String[] args) {
			Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println("���� �� ���ڸ� �Է��ϼ���.");
			System.out.print("������ : " );
			int a = sc.nextInt();
			System.out.print("������ : " );
			int b = sc.nextInt();
			System.out.println("result : " + a/b);
		
		}catch(ArithmeticException e) {	 //0���� ������ ����
			System.out.println("��꿹��");
	
			//����ĳġ 
			//���� a. ĳġ�� ������ ����ĳġ ����, ����ĳġ�� �� ���� (���� ĳġ�� �����ϸ� ������ �� ó���ع���)
			
		}catch(Exception e) { //a�� ���� �� ���� (java.util.InputMismatchException)
			e.printStackTrace();
		}finally {
			System.out.println("������ ����");
			sc.close();
		}
	}
}