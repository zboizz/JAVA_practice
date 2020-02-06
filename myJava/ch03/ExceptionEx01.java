package ch03;

import java.util.Scanner;

public class ExceptionEx01 {
	public static void main(String[] args) {
		//Exception: 예상하지 못한 상황
		//예외처리 : 예외가 발생했을 때 적절하게 대처
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("입력받은 두 숫자를 나눕시다.");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a/b;
			System.out.println("결과 : " + c);
		}catch(Exception e) {                          //예외처리
			System.out.println("0입력 안됩니다.");
		}
	}
}
