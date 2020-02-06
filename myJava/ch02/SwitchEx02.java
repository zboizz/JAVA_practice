package ch02;

import java.util.Scanner;

public class SwitchEx02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//1~12까지 번호를 입력하세요. 입력한 번호에 따라 계절을 출력하세요.
		System.out.println("달(month)를 입력하세요");
		int a = sc.nextInt();
		switch (a) {
		case 12: case 1: case 2: System.out.println(a+ "월은 겨울");
			break;
        case 3: case 4: case 5: System.out.println(a+ "월은 봄");
        	break;
        case 6: case 7: case 8: System.out.println(a+ "월은 여름");
			break;
	    case 9: case 10: case 11: System.out.println(a+ "월은 겨울");
	    	break;
	     	
		default: System.out.println("범위초과");
			break;
		}
		/////////////////////
		if((a==1)||(a==2)||(a==12)) {
			System.out.println(a+ "월은 겨울입니다.");
		}else if((a==3)||(a==4)||(a==5)){
			System.out.println(a+ "월은 봄입니다.");
		}else if((a==6)||(a==7)||(a==8)){
			System.out.println(a+ "월은 여름입니다.");
		}else if((a==9)||(a==10)||(a==11)){
			System.out.println(a+ "월은 가을입니다.");
		}else {
			System.out.println("범위초과");
		}
		sc.close();
	}
}
