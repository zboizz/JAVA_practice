package ch02;

import java.util.Scanner;

public class SwitchEx01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//1~3���� ��ȣ�� �Է��ϼ���.
		System.out.println("���ڸ� �Է��ϼ���");
		int a = sc.nextInt();
		switch (a) {
		case 1: System.out.println("�ϳ�");
			break;
		case 2: System.out.println("��");
			break;
        case 3: System.out.println("��");
			break;

		default: System.out.println("�����ʰ�");
			break;
		}
		////////////////
		if(a==1) {
			System.out.println("one");
		}else if(a==2){
			System.out.println("two");
		}else if(a==3){
			System.out.println("three");
		}else {
			System.out.println("etc");
		}
		sc.close();
	}
}
