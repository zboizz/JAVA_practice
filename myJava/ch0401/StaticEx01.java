package ch0401;

//static: '������' �̶�� �ǹ̸� ������ ����.
//         �ʵ� �� �޼ҵ� �տ� ����� �Ѵ�.

// 1. �ʵ�: ��ü�� ���������ʰ� ��ٷ� ��� ����

class Static01{
	//static������ ��ü �������� Ŭ���������� ��� ����
	static int a = 10;
	int b = 20;
}

// 2. �޼ҵ�:




public class StaticEx01 {
	public static void main(String[] args) {
		Static01 s = new Static01();
		//s.�ʵ� �� ����ϴ� ���� �Ϲ���
		s.a=20;
		s.b=30;
		System.out.println(s.a+s.b);
		
		Static01.a=50; //*****************��ü �������� Ŭ���������� ��� ����
		System.out.println(Static01.a);
		System.out.println(5*5*Math.PI);
		//////////////////////////
		//static vs non static
		
		Static01 n1 = new Static01();
		Static01 n2 = new Static01();
		Static01 n3 = new Static01();
		n1.a=100;
		n2.a=200;
		n3.a=300; //static ���� ����� ��� ���������� ������ 300���� ��µ�
		System.out.println(n1.a);
		System.out.println(n2.a);
		System.out.println(n3.a);
	}
}
