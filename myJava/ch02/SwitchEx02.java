package ch02;

import java.util.Scanner;

public class SwitchEx02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//1~12���� ��ȣ�� �Է��ϼ���. �Է��� ��ȣ�� ���� ������ ����ϼ���.
		System.out.println("��(month)�� �Է��ϼ���");
		int a = sc.nextInt();
		switch (a) {
		case 12: case 1: case 2: System.out.println(a+ "���� �ܿ�");
			break;
        case 3: case 4: case 5: System.out.println(a+ "���� ��");
        	break;
        case 6: case 7: case 8: System.out.println(a+ "���� ����");
			break;
	    case 9: case 10: case 11: System.out.println(a+ "���� �ܿ�");
	    	break;
	     	
		default: System.out.println("�����ʰ�");
			break;
		}
		/////////////////////
		if((a==1)||(a==2)||(a==12)) {
			System.out.println(a+ "���� �ܿ��Դϴ�.");
		}else if((a==3)||(a==4)||(a==5)){
			System.out.println(a+ "���� ���Դϴ�.");
		}else if((a==6)||(a==7)||(a==8)){
			System.out.println(a+ "���� �����Դϴ�.");
		}else if((a==9)||(a==10)||(a==11)){
			System.out.println(a+ "���� �����Դϴ�.");
		}else {
			System.out.println("�����ʰ�");
		}
		sc.close();
	}
}
