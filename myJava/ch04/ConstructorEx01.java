package ch04;

//생성자: 객체를 생성하는 아주 특별한 메소드
//생성자가 하나라도 선언이 되어 있지 않으면 JVM이 컴파일 시점에 디폴트 생성자를 제공(Ctrl+space 활용)


class constructor01{
	public constructor01() {
		System.out.println("생성자 호출");
	}
}

public class ConstructorEx01 {
	public static void main(String[] args) {
		constructor01 c = new constructor01();
		//메소드 오버로딩(Overloading)
		System.out.println(1);
		System.out.println("문자열");
		System.out.println(true);
		System.out.println(3.14);
		System.out.println('가');
		
		//메소드 오버로딩(Overloading)
		int a =  Math.max(10,20);
		double d = Math.max(3.14, 5.56);
	}
}
