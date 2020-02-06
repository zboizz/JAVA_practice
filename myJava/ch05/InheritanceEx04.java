package ch05;

import java.awt.Dialog;
import java.awt.Frame;

class A04{
	public A04() {
		//default->super(),this()
		System.out.println("A04() 생성자");
	}
}

class B04 extends A04{
	public B04() {
		super();
		System.out.println("B04() 생성자");
	}
}

class C04{
	public C04(int a) {
	}
}

class D04 extends C04{
	// 1. super 클래스에 디폴트 생성자를 추가한다.(SUN 제공 코드 변경 불가)
	// 2. super 클래스의 명시적인 생성자를 호출
	
	public D04() {
	super(0); //0의 값을 넣는다.
	}
}

class MyDialog extends Dialog{
	public MyDialog() {
	super(new Frame());
	}
}


public class InheritanceEx04 {

	
	public static void main(String[] args) {
		
	}
}
