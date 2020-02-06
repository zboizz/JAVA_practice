package practice;


// 추상 클래스: 우리가 선언해서 사용할 일은 아마 거의 없을 것.
// 추상 메소드 선언 가능, 그러나 반드시 추상 클래스가 추상메소드를 선언해야할 당위성은 없다.
// ex) abstract class Component 이지만 추상메소드가 없음
// 추상클래스는 일반필드 및 메소드 선언이 가능하다.
// 직접적인 객체 생성은 불가

abstract class A06{
	int a;
	void m() {}
	abstract void p();
}

public class Ex06 {
	public static void main(String[] args) {
		//A06 a = new A06(); //실질적인 객체 생성이 불가능함
		
		//굳이 만들고 싶다면 아래와 같은 방법으로 객체 생성
		A06 a;
		//a = new A06();
	}
}
