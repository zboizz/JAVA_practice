package ch0401;

	class A01{
		int n = 0;
	}

class CallPass01{
	
	void pass(A01 a) {			
//call by reference 를 사용하기 위하여 클래스의 형태가 메소드로 들어가야함
		System.out.println("A01 n = " + a.n);
	}
	
	void plus(int a, int b) {
		System.out.println("a+b = " + (a+b));
	}
}


public class CallPassEx01 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		A01 k = new A01(); //A01이라는 객체가 만들어지고 n값은 30
		k.n = 30;
		
		CallPass01 cp = new CallPass01();
		//call by value
		cp.plus(a, b); // a + b = 10 + 20 = 30
		cp.pass(k); // call by reference cp.pass(메모리주소값)
		System.out.println(k);
		k.n = 100;
		cp.pass(k);
		
	}
}






