package ch0501;

//�͸� Ŭ����(Anonymous): ����Ŭ������ �� �����ν� �̸��� ���� Ŭ������ �ǹ�
//�Ϲ������� �߻�Ŭ���� �Ǵ� �������̽��� Ÿ������ Ŭ���� ����� ���ÿ� ��ü ������ ��.

interface MyInter{
	void prn();	
}

class Anonymous01{
	public Anonymous01() {
	new MyInter() {
		
		@Override
		public void prn() {
			System.out.println("prn()����");
		}
	}.prn();        // �������
	new String().length();
	}
}


public class AnonymousEx01 {
	public static void main(String[] args) {
		Anonymous01 a = new Anonymous01();
	}
}
