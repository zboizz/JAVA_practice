package ch0501;

//추상클래스
// 1. 클래스 앞에 abstract가 온다
// 2. 추상클래스는 추상메소드를 가질 수 있다.
// 3. 반드시 추상클래스는 추상메소드를 가질 필요는 없다.
// 4. 추상메소드는 반드시 추상클래스에 안에 선언이 되어야 한다.
// 5. 추상메소드는 메소드 선언부만 있고 구현부는 없다.
// 6. 추상클래스는 일반필드 및 일반 메소드 선언이 가능하다.

abstract class Abstract01{
	int a =0;
	abstract void prn();
	void mrn() {}
}

//추상 클래스를 상속받는 일반 클래스
// 1. 강제적으로 추상메소드는 오버라이딩을 해야한다.
// 2. 나머지는 일반 상속이랑 똑같다.

class Normal01 extends Abstract01{
   	@Override
   	void prn() {
   		
   	}
}
public class AbstractEx01 {
	public static void main(String[] args) {
		Normal01 n = new Normal01();
		Abstract01 a;
	//	a = new Abstract01(); //추상클래스는 객체 생성 불가능
		a = n; //하위 클래스 객체를 레퍼런스는 가능하다.
	}
}
			
