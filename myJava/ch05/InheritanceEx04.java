package ch05;

import java.awt.Dialog;
import java.awt.Frame;

class A04{
	public A04() {
		//default->super(),this()
		System.out.println("A04() ������");
	}
}

class B04 extends A04{
	public B04() {
		super();
		System.out.println("B04() ������");
	}
}

class C04{
	public C04(int a) {
	}
}

class D04 extends C04{
	// 1. super Ŭ������ ����Ʈ �����ڸ� �߰��Ѵ�.(SUN ���� �ڵ� ���� �Ұ�)
	// 2. super Ŭ������ ������� �����ڸ� ȣ��
	
	public D04() {
	super(0); //0�� ���� �ִ´�.
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
