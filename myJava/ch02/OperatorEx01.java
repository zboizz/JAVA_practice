package ch02;

import java.util.Scanner;

public class OperatorEx01 {
	public static void main(String[] args) {
		//SUN 에서 제공되는 변수명이 정수는 a와 b가 주를 이룬다.
		int a = 10;
		int b = 3;
		//Math.max(a, b);
		//System.out.println(Math.max(a,b));
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//입력한 값이 짝수인지 홀수인지 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int c = sc.nextInt();
		if(c%2==0) {
			System.out.println(c+ "는(은) 짝수");
		}else {
			System.out.println(c+ "는(은) 홀수");
		}
		sc.close();
	}
}
