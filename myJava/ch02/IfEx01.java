package ch02;

import java.util.Scanner;

public class IfEx01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력한 숫자가 3의 배수인지 아닌지 출력하세요.
		System.out.println("숫자를 입력하세요");
		int a = sc.nextInt();
		/*System.out.println("입력한 숫자는 " + a + "는(은) 3의");
		if(a%3==0) {
			System.out.println("배수입니다.");
		}else {
			System.out.println("배수가 아닙니다.");
		}*/
		
		
		//조건 연산자로 똑같은 기능을 구현
		String s = (a%3==0)?"는(은) 3의 배수입니다.":"는(은) 3의 배수가 아닙니다.";
		System.out.println(s);
		sc.close();
	}
}
