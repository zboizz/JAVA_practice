package ch0501;

//���� Ŭ����: Ŭ���� �ȿ� Ŭ���� ����


class Out01{
	int i = 22;
	void prn() {
		System.out.println("i: " + i);
		//����Ŭ������ �Ϲ������� �ܺ�Ŭ���� �ȿ����� ����� �Ѵ�.
		//Inner01 in = new Inner01();
		//in.prn1();
	}
	//�ܺ�Ŭ���� ���忡���� ����Ŭ������ �޼ҵ�� �����Ѵ�.
	//�׷��� �ܺ�Ŭ���� �ʵ� �� �޼ҵ带 ����Ŭ�������� ����� �����Ѵ�.
	
	class Inner01{		    //����Ŭ����- �ϳ��� �޼ҵ�� �ٶ󺸰� �ִ�.
		int j = 23;			//���� �� ����Ŭ������ �������? 1. Ŭ������ ���� �������� ���
		void prn1() {		//								 2. �ܺ�Ŭ������ ������ ���踦 ����	
			prn();
			System.out.println(i+j);
		}		
	}   //-----> Inner01
}


public class InnerEx01 {
	
public static void main(String[] args) {
		//�� 3�� Ŭ�������� ����Ŭ���� ����
		//�ܺο����� inner01 Ŭ������ �ν��� �� ����.
		Out01 out = new Out01();
		//Inner01 in = new Inner01();
		Out01.Inner01 in = out.new Inner01();
		in.prn1();
	}
}
