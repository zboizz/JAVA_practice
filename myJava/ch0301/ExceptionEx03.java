package ch0301;

import java.util.Scanner;

public class ExceptionEx03 {
	public static void main(String[] args) {
			Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println("나눌 두 숫자를 입력하세요.");
			System.out.print("나뉨수 : " );
			int a = sc.nextInt();
			System.out.print("나눗수 : " );
			int b = sc.nextInt();
			System.out.println("result : " + a/b);
		
		}catch(ArithmeticException e) {	 //0으로 나눌때 실행
			System.out.println("계산예외");
	
			//다중캐치 
			//조건 a. 캐치의 순서는 하위캐치 먼저, 상위캐치는 그 이후 (상위 캐치를 먼저하면 위에서 다 처리해버림)
			
		}catch(Exception e) { //a로 나눌 때 실행 (java.util.InputMismatchException)
			e.printStackTrace();
		}finally {
			System.out.println("무조건 실행");
			sc.close();
		}
	}
}