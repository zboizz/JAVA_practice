package ch05;

//�������ε�: ��ü�� �����ϰ� �޼ҵ带 ȣ�� -> ���� ���ε�
//��Ӱ��� �޼ҵ� �������̵��϶� ����Ŭ���� ���۷��� �������� ȣ��� ����Ŭ���� �޼ҵ带 ȣ��

class A01{
	void prn() {
		System.out.println("A01 prn");
	}
}	
class B01 extends A01{
	@Override
	void prn() {
		System.out.println("B01 prn");
		}
	}

public class CastingEx02 {
	public static void main(String[] args) {
		A01 a = new A01();
		a.prn();
		B01 b = new B01();
		b.prn();
		
	//////////////////////////
	/////////���� ���ε�: ���� ������ ����
		
		B01 b1 = new B01();
		A01 a1 = b1;
		a1.prn(); //A01 prn �޼ҵ尡 ȣ��Ǵ� ���� �ƴ϶� B01 prn ȣ��
	 	}
	}

