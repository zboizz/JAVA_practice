package ch02;

public class Ex04 {

	public static void main(String[] args) {
		//변수 선언
		int price = 20;   //최초에 price의 값을 20으로 설정
		price = 30;       //두번째 줄에 price 값을 30으로 변경, 중간에 값 필요시 변경 가능
		System.out.println(price);
		
		
		char c1, c2, c3;
		c1 = 'a';
		c2 = '가';
		c3 = '1';
		
		//리터럴:변수의 값을 표현한 용어
		
		int n, m, k, g; //정수의 기본값 타입은 int
		n=15;
		m=015;//8진수
		k=0x1A;//16진수
		g=0b0101;//2진수
		System.out.println(n+"+"+m+"+"+k+"+"+g);
	
		long I = 24L; //l or L
		//실수의 기본형 타입은 double
		float f = 3.14f; //float보다 큰 타입의 리터럴 값이 할당이 되면 에러 발생
		//f or F 
		double d = 3.0;
		System.out.println(d*3); //정수*실수는 정수가 실수로 형변환 발생 이후에 계산=9.0
		System.out.println(10/3); //정수/정수는 정수로 계산=3 소수점은 버림
		
		//문자 리터럴
		char a1 = 'A';
		char a2 = '\u0041';
		//System.out.println(a1+":"+a2);
		char a3='\uac00';
		System.out.println(a1+":"+a2+":"+a3);
		char a4 = '꼹';
		System.out.println(a1+":"+a2+":"+a3+":"+a4);
		
	}

}
