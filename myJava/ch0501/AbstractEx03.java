package ch0501;

//�߻�Ŭ�����鳢�� ����� ����

abstract class Abstract03{
	abstract void prn();
}

//�߻� Ŭ���������� ����� �ݵ�� �߻�޼ҵ带 ����� �ʿ�� ����.
 abstract class Abstract04 extends Abstract03{
	 abstract void mrn();
}
 //�߻�Ŭ���� ��ӽ� �Ϲ�Ŭ���� �����߻�Ŭ�������� ����� �߻�޼ҵ������ �������̵�
 class Normal03 extends Abstract04{

	@Override
	void mrn() {
	}

	@Override
	void prn() {
	}
	 
 }
 
 
 
public class AbstractEx03 {

	public static void main(String[] args) {

	}

}
