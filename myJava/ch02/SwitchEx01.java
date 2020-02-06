package ch02;

import java.util.Scanner;

public class SwitchEx01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//1~3까지 번호를 입력하세요.
		System.out.println("숫자를 입력하세요");
		int a = sc.nextInt();
		switch (a) {
		case 1: System.out.println("하나");
			break;
		case 2: System.out.println("둘");
			break;
        case 3: System.out.println("셋");
			break;

		default: System.out.println("범위초과");
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
