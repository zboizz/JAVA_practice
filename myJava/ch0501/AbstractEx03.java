package ch0501;

//추상클래스들끼리 상속이 가능

abstract class Abstract03{
	abstract void prn();
}

//추상 클래스끼리의 상속은 반드시 추상메소드를 상속할 필요는 없다.
 abstract class Abstract04 extends Abstract03{
	 abstract void mrn();
}
 //추상클래스 상속시 일반클래스 상위추상클래스에서 선언된 추상메소드까지도 오버라이딩
 class Normal03 extends Abstract04{

	@Override
	void mrn() {
	}

	@Override
	void prn() {
	}
	 
 }
 
 
 
public class AbstractEx03 {

	public static void main(String[] args) {

	}

}
