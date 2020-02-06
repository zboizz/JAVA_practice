package ch04;

import java.awt.Frame;


//�������� ���ظ� ���ؼ� ����� ����
//Ŭ���� �� �ڿ� extend�� ������ 'extends Object' �����̸� 2�� Ŭ�����̴�.


class SuperClass extends Object{
	//�ڽ�Ŭ���� �����ڿ��� �ݵ�� ù��° ���ο��� �θ�Ŭ����, ������ ��,
	//super(); ->����
	public SuperClass() {
		super();
		System.out.println("SuperClass ������");
	}	
}
//
class SubClass extends SuperClass{ //2������ extends+object �����Ͽ��� ���ԵǾ� �ڵ� ����, 3����ʹ� ���� �Է��ؾ���
	public SubClass() {
		super(); //super Ctrl+Ŭ���� SupperClass�� �̵�(�θ�Ŭ����)
		System.out.println("SubClass ������");
	}	
}
//
	class A /*extends Object�� �����Ǿ� ����*/{
		
		//�ʵ� ����
		int a; 
		
		//������
		A(){
			/*super();�� �����Ǿ�����, SUN���� �����Ǵ� �Ϲ����� �ڵ忡�� �����Ǿ�����*/
			//new Object(); --> super();�ʹ� �ٸ�, ���ο� ��ü�� ����� ������ superó�� ������ü�� ����� �������� �ٸ�
		System.out.println("AŬ������ ������");
		}
		//�޼ҵ�
		void prn() {}
	}
	
	
	class B extends A{
	int b;
	B(){
		super();
		System.out.println("BŬ������ ������");
	}
	void mrn() {}
	}


public class ConstructorEx04 {

	public static void main(String[] args) {
		Frame f;
		SubClass sc = new SubClass();		
	
		
		//Object(9���� �޼ҵ�)>A(1���� �ʵ�, 1���� �޼ҵ�)>B(1���� �ʵ�, 1���� �޼ҵ�)
		// >B(1���� �ʵ�, 1���� �޼ҵ�)
		B b = new B();
		// b. ---> 2���� �ʵ�� 11���� �޼ҵ带 ����� �� ����
		A a = new A();
		// a. --->1���� �ʵ�� 10���� �޼ҵ带 ����� �� ���� 
	
	
	
	}
}













