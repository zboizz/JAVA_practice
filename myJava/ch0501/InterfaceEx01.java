package ch0501;


//�������̽�(8.0 �߰�) : Ŭ������(�������̽���)�տ� 
//                       interface�� �´�.
// ������ '�������̽���.java'�� ����
// �ʵ�� �ڵ� ���, �޼ҵ�� �ڵ� �߻�޼ҵ尡 �ȴ�.
// �Ϲ��ʵ� �� �Ϲݸ޼ҵ� ������ �� �����µ� 8.0�� �Ϲݸ޼ҵ� �߰�

interface Inter01{
	//int a; 
	//a�� �����ִ� ������ ��������϶�, ����� �⺻���� �־����
	int a = 10;  //�⺻���� ��
	//abstract Ű���带 ������� �ʰ� �ڵ� �߻�޼ҵ� ����
	void prn();
	
	//�Ϲ� �޼ҵ� ���� �Ұ�
	//void prn1() {}
}

class InterClass01 extends Object implements Inter01{
//�������̽����� ������ �޼ҵ�� ���������� �������̵��Ͽ��� ��
	
	@Override
	public void prn() {
	}
}

public class InterfaceEx01 {

	public static void main(String[] args) {
		
	}
}
