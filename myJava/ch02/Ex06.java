package ch02;

public class Ex06 {

	public static void main(String[] args) {
		//자바 타입: 기본형(8가지) vs 참조형(클래스 타입: SUN + 개발자)
		String s = new String();//String 클래스로 객체를 하나 생성
		// String.java -> String.class 제공
		Ex06 e = new Ex06();
		
		//null 개념
		String s1 = null; // 아직 객체가 없는 상태
		int i;
		
		//JDK 7 개념
		int j = 10_10;
		int n = 12_34_56;
		System.out.println(j+":"+n);
		
		//var 키워드:유동적인 변수 타입, 반드시 값을 할당하여야 한다.
		var price = 20;
		var name = "홍길동";
		var pi = 3.14;
		var s2 = new String();
		//var s3;
		int i3;
		
	}

}
