package ch0501;

interface Inter00{}

interface Inter02{
	void prn();
}
//�������̽����� ����� �����ϴ�.

interface Inter03 extends Inter02{
	void prn1();
}

//�������̽����� ���߻���� �����ϴ�.
interface Inter04 extends Inter00, Inter02 {}

class InterClass02 implements Inter03{

	@Override
	public void prn() {
	}

	@Override
	public void prn1() {
	}
	
	
	
}

public class IntefaceEx02 {

		public static void main(String[] args) {
	//�������̽��� �߻�Ŭ���� ���� �������� ��ü������ �Ұ���, Ÿ������ ����
	InterClass02 ic = new InterClass02();
	Inter02 it = ic;
	ic.prn(); //���� ���ε�
		}
}
