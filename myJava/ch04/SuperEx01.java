package ch04;


//super: ����Ŭ������ ��Ī�ϴ� �����

class Super01{
	int a=1;
	void prn(){
		System.out.println("����Ŭ���� prn");
	}
}

class Sub01 extends Super01{
	int a=2;
	//�������̵�: ����Ŭ�������� ������ �޼ҵ带 ����Ŭ�������� ������
	void prn() {
		System.out.println(a);
		//����Ŭ������ ������ �ʵ��� ��쿡�� �ʵ�տ� super
		System.out.println(super.a);
		//�������̵� ���ؼ� ������ �޼ҵ���� ��쿡 ���� �޼ҵ� ȣ��
		super.prn();		
		System.out.println("���� Ŭ���� prn");
	}
}

public class SuperEx01 {

	public static void main(String[] args) {
			Sub01 s = new Sub01();
			s.prn(); //ȣ�����--->16 ���� ���ʴ�� �������鼭 �۾� ����--->21 super.prn---->9�� ���� "����Ŭ���� prn'���--->22 ����Ŭ���� prn ���
				
		
		}
}
