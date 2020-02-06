package ch0501;

interface Inter00{}

interface Inter02{
	void prn();
}
//인터페이스끼리 상속이 가능하다.

interface Inter03 extends Inter02{
	void prn1();
}

//인터페이스끼리 다중상속이 가능하다.
interface Inter04 extends Inter00, Inter02 {}

class InterClass02 implements Inter03{

	@Override
	public void prn() {
	}

	@Override
	public void prn1() {
	}
	
	
	
}

public class IntefaceEx02 {

		public static void main(String[] args) {
	//인터페이스는 추상클래스 같은 개념으로 객체생성은 불가능, 타입으로 존재
	InterClass02 ic = new InterClass02();
	Inter02 it = ic;
	ic.prn(); //동적 바인딩
		}
}
