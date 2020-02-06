package ch02;

import java.util.Scanner;

public class IfEx021 {

		public static void main(String[] args) {
			
			// 양수 or 음수
			// 짝수 or 홀수
			// 3의 배수 여부
			// ex) 입력한 값이 -10 -> 음수 짝수 3의 배수 아님
			// ex) 입력한 값이  15 -> 양수 홀수 3의 배수.
			
			Scanner sc=new Scanner(System.in);
			System.out.println("숫자를 입력하세요");
			
						
			int a = sc.nextInt();
			if(a>=0) {
				System.out.println("양수");
			}else{
				System.out.println("음수");
			}if(a%2==0) {
				System.out.println("짝수");
			}else{
				System.out.println("홀수");
			}if(a%3==0) {
				System.out.println("3의 배수");
			}else{
				System.out.println("3의 배수가 아님");
			}sc.close();
		}
}