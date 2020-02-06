package ch02;

import java.util.Scanner;

public class ScannerEx02 {
		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Scanner 클래스는 콘솔창에 사용자의 입력값을 받는 기능
		//문자, 정수, 실수, 논리값까지 값을 받아낼 수 있음
		//사용 후에는 반드시 close를 해야함
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
		String name = sc.next();//문자열
		String city = sc.next();
		int age = sc.nextInt(); //정수
		double weight = sc.nextDouble(); //실수
		boolean single = sc.hasNextBoolean(); //논리값
		System.out.println("name:"+ name);
		System.out.println("city:"+ city);
		System.out.println("age:"+ age);
		System.out.println("weight:"+ weight);
		System.out.println("single:"+ single+ "입니다");
		}
}
