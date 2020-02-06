package ch0501;

//익명 클래스(Anonymous): 내부클래스의 한 종류로써 이름이 없는 클래스를 의미
//일반적으로 추상클래스 또는 인터페이스를 타입으로 클래스 선언과 동시에 객체 생성을 함.

interface MyInter{
	void prn();	
}

class Anonymous01{
	public Anonymous01() {
	new MyInter() {
		
		@Override
		public void prn() {
			System.out.println("prn()실행");
		}
	}.prn();        // 여기까지
	new String().length();
	}
}


public class AnonymousEx01 {
	public static void main(String[] args) {
		Anonymous01 a = new Anonymous01();
	}
}
