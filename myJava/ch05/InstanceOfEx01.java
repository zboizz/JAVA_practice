package ch05;

	class Person01{}

	class Student01 extends Person01{}
	class Professor01 extends Person01{}

public class InstanceOfEx01 {

		public static void main(String[] args) {
			//��� ��ü�� obj�� ���۷��� ����
			Object obj = new Person01(); //��ü �Һ��� ��Ģ
			Person01 p1 = new Student01();
			Person01 p2 = new Professor01();
			//���۷��� ������ instanceOf Ŭ������ => boolean ��
			if(p1 instanceof Person01)
				System.out.println("p1�� Person01�̴�");
			if(p1 instanceof Object)
				System.out.println("p1�� Object�̴�");
			if(p1 instanceof Professor01)
				System.out.println("p1�� Professor01�̴�");
			
		}
}
