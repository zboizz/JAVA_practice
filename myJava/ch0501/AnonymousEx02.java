package ch0501;

interface MyInter02 {
	void prn();
}

class MyClass02 implements MyInter02 { // �ٸ� �������� ����� �����ϴ�. Ŭ���������߱⿡
	@Override
	public void prn() {
		System.out.println("prn() ����");
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
