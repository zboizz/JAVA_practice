package ch02;

import java.util.Scanner;

public class IfEx031 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸��� �г� ������ �Է��ϼ���");
		String name = sc.next();
		int grade = sc.nextInt();
		int score = sc.nextInt();
		
		String msg="";
		if(score>=60) {
			if(grade!=4) {
				msg = "�հ�";
		}else if(score>=70) {
				msg="�հ�";
		}else {
			msg = "���հ�";
			}
		}else {
		msg = "���հ�";
		}
		System.out.println(name+"��(��) "+ grade + "�г��̰� "+ score +"������ " + msg +  "�Դϴ�" );
	}
}
