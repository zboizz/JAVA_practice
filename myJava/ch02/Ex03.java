package ch02;

public class Ex03 {
	public static void main(String[] args) {
		//Date Type
		//1. 기본형 8가지
		// a. 문자: char
		// b. 정수: byte, short, int, long
		// c. 실수: float, double
		// d. 논리: boolean
		// -> 기본형 8가지는 예약어
		//2. 참조형은 무한대, 대표적인 Type: String
		
		char c = 'a';        //문자 한 개
		char c1 = '한';      // 문자 한 자
		//char c2 = 'ab'; 	 // 문자 한 개 초과하여 에러 발생 
		
		byte b = 1;
		short s = 10;
		//short s1 = 32768; // short의 범위를 벗어남, (-32768~32767)
		
		int i = 32768;
		long I =123456789;
		//실수의 기본 타입은 double이기 때문에 float으로 선언을 하기 위해서는 f, F를 뒤에 붙인다.
		float f = 3.14f; 
		float f1 = 3.14F;
		
		double d = 3.14;
		//기본형 타입은 범위가 존재
		
		//**short, Byte, Integer, Long의 범위를 구하시오.
		System.out.println(Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE+"~"+Short.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE+"~"+Long.MAX_VALUE);
		
		//참조형: String(예약어가 아님)
		String s1= "하하"; //문자열 타입
		String s2= "하"; //문자열 타입
		String s3= "하하"+22; //문자열+숫자는 자동으로 문자열 "하하22"으로 변형
		
	
				
	}
}
