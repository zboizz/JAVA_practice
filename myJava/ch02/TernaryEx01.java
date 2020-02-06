package ch02;

import java.util.Scanner;

//Ternary : 세개의
public class TernaryEx01 {
	public static void main(String[] args) {
		//조건 연산자 or 삼항연산자
		int a = 10;
		int b = 3;
		int c = a>b ? a:b;
		int d = Math.max(a, b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		
		//입력한 값이 양수인지 음수인지 출력하시오
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int e = sc.nextInt(); //입력하는 형식
		String msg = (e>0)? "양수" : "음수"; //형식을 계산하는 틀
		System.out.println(e+ "는(은) " + msg); //종합하여 출력
		}
}
