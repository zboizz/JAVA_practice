package ch0501;


//인터페이스(8.0 추가) : 클래스명(인터페이스명)앞에 
//                       interface가 온다.
// 저장은 '인터페이스명.java'로 저장
// 필드는 자동 상수, 메소드는 자동 추상메소드가 된다.
// 일반필드 및 일반메소드 선언할 수 없었는데 8.0에 일반메소드 추가

interface Inter01{
	//int a; 
	//a가 누워있는 이유는 상수선언일때, 상수는 기본값을 주어야함
	int a = 10;  //기본값을 줌
	//abstract 키워드를 사용하지 않고 자동 추상메소드 선언
	void prn();
	
	//일반 메소드 선언 불가
	//void prn1() {}
}

class InterClass01 extends Object implements Inter01{
//인터페이스에서 선언한 메소드는 강제적으로 오버라이딩하여야 함
	
	@Override
	public void prn() {
	}
}

public class InterfaceEx01 {

	public static void main(String[] args) {
		
	}
}
