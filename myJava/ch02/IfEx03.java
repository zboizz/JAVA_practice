package ch02;

import java.util.Scanner;

public class IfEx03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�̸��� �г�, ������ �Է��ϼ���");
		
		String na = sc.next();
		int gr = sc.nextInt();
		int s = sc.nextInt();
			if((gr<4)&&(s>=60)){
				System.out.println(na+"��(��) "+ gr + "�г��̰� "+ s +"������ �հ��Դϴ�." );
			}else if((gr>=4)&&(s>=70)) {
				System.out.println(na+"��(��) "+ gr + "�г��̰� "+ s +"������ �հ��Դϴ�." );
			}else {
				System.out.println(na+"��(��) "+ gr + "�г��̰� "+ s +"������ ���հ��Դϴ�." );
			}
	}
}
	
	
	
	
	
	
	