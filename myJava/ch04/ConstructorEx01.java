package ch04;

//������: ��ü�� �����ϴ� ���� Ư���� �޼ҵ�
//�����ڰ� �ϳ��� ������ �Ǿ� ���� ������ JVM�� ������ ������ ����Ʈ �����ڸ� ����(Ctrl+space Ȱ��)


class constructor01{
	public constructor01() {
		System.out.println("������ ȣ��");
	}
}

public class ConstructorEx01 {
	public static void main(String[] args) {
		constructor01 c = new constructor01();
		//�޼ҵ� �����ε�(Overloading)
		System.out.println(1);
		System.out.println("���ڿ�");
		System.out.println(true);
		System.out.println(3.14);
		System.out.println('��');
		
		//�޼ҵ� �����ε�(Overloading)
		int a =  Math.max(10,20);
		double d = Math.max(3.14, 5.56);
	}
}
