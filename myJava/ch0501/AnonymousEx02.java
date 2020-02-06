package ch0501;

interface MyInter02 {
	void prn();
}

class MyClass02 implements MyInter02 { // 다른 곳에서도 사용이 가능하다. 클래스생성했기에
	@Override
	public void prn() {
		System.out.println("prn() 실행");
	}
}

class Anonymous02 {
	public Anonymous02() {
	 	new MyClass02().prn();
	}
}

public class AnonymousEx02 {
	public static void main(String[] args) {
		Anonymous02 a = new Anonymous02();

	}
}
