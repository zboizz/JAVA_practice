package ch0501;

interface MyInterface{
	public static final int T = 100; //T는 상수, 상수이기에 값 부여
	//static final 생략
	public abstract void prn();
	//abstract 생략
	
	//jdk8.0부터 지원되는 기능
	public default void prn1() {
	System.out.println(T);
	
	}
	public static void prn2() {
	System.out.println(T);
	}
}




public class InterfaceEx05 {
	public static void main(String[] args) {
		
	}
}
