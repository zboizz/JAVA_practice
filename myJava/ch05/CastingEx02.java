package ch05;

//동적바인딩: 객체를 생성하고 메소드를 호출 -> 정적 바인딩
//상속간에 메소드 오버라이딩일때 상위클래스 레퍼런스 변수명을 호출시 하위클래스 메소드를 호출

class A01{
	void prn() {
		System.out.println("A01 prn");
	}
}	
class B01 extends A01{
	@Override
	void prn() {
		System.out.println("B01 prn");
		}
	}

public class CastingEx02 {
	public static void main(String[] args) {
		A01 a = new A01();
		a.prn();
		B01 b = new B01();
		b.prn();
		
	//////////////////////////
	/////////동적 바인딩: 실행 시점에 결정
		
		B01 b1 = new B01();
		A01 a1 = b1;
		a1.prn(); //A01 prn 메소드가 호출되는 것이 아니라 B01 prn 호출
	 	}
	}

