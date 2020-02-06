package ch0401;

//static: '정적인' 이라는 의미를 가지고 있음.
//         필드 및 메소드 앞에 사용을 한다.

// 1. 필드: 객체를 생성하지않고 곧바로 사용 가능

class Static01{
	//static변수는 객체 생성없이 클래스명으로 사용 가능
	static int a = 10;
	int b = 20;
}

// 2. 메소드:




public class StaticEx01 {
	public static void main(String[] args) {
		Static01 s = new Static01();
		//s.필드 를 사용하는 것이 일반적
		s.a=20;
		s.b=30;
		System.out.println(s.a+s.b);
		
		Static01.a=50; //*****************객체 생성없이 클래스명으로 사용 가능
		System.out.println(Static01.a);
		System.out.println(5*5*Math.PI);
		//////////////////////////
		//static vs non static
		
		Static01 n1 = new Static01();
		Static01 n2 = new Static01();
		Static01 n3 = new Static01();
		n1.a=100;
		n2.a=200;
		n3.a=300; //static 값을 출력할 경우 마지막으로 선언한 300값만 출력됨
		System.out.println(n1.a);
		System.out.println(n2.a);
		System.out.println(n3.a);
	}
}
