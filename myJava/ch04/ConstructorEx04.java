package ch04;

import java.awt.Frame;


//생성자의 이해를 위해서 상속을 설명
//클래스 몇 뒤에 extend가 없으면 'extends Object' 생략이며 2대 클래스이다.


class SuperClass extends Object{
	//자식클래스 생성자에서 반드시 첫번째 라인에는 부모클래스, 생성자 즉,
	//super(); ->생략
	public SuperClass() {
		super();
		System.out.println("SuperClass 생성자");
	}	
}
//
class SubClass extends SuperClass{ //2까지만 extends+object 생략하여도 포함되어 자동 적용, 3대부터는 필히 입력해야함
	public SubClass() {
		super(); //super Ctrl+클릭시 SupperClass로 이동(부모클래스)
		System.out.println("SubClass 생성자");
	}	
}
//
	class A /*extends Object가 생략되어 있음*/{
		
		//필드 선언
		int a; 
		
		//생성자
		A(){
			/*super();가 생략되어있음, SUN에서 제공되는 일반적인 코드에도 생략되어있음*/
			//new Object(); --> super();와는 다름, 새로운 객체를 만드는 것이지 super처럼 상위객체를 만드는 과정과는 다름
		System.out.println("A클래스의 생성자");
		}
		//메소드
		void prn() {}
	}
	
	
	class B extends A{
	int b;
	B(){
		super();
		System.out.println("B클래스의 생성자");
	}
	void mrn() {}
	}


public class ConstructorEx04 {

	public static void main(String[] args) {
		Frame f;
		SubClass sc = new SubClass();		
	
		
		//Object(9개의 메소드)>A(1개의 필드, 1개의 메소드)>B(1개의 필드, 1개의 메소드)
		// >B(1개의 필드, 1개의 메소드)
		B b = new B();
		// b. ---> 2개의 필드와 11개의 메소드를 사용할 수 있음
		A a = new A();
		// a. --->1개의 필드와 10개의 메소드를 사용할 수 있음 
	
	
	
	}
}













