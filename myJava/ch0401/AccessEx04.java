package ch0401;

import ch04.ProtectedEx01; //�ٸ� ��Ű���̱⶧���� import ���

import java.awt.Frame;

//protected�� ����϶��� public, �׷������� ��쿡�� private�� �ȴ�.
//�ʵ�� �޼ҵ忡 ��밡��

//���� �ٸ� ��Ű���� ��쿡�� �ݵ�� import �ؾ���.
//�׷��� ���ܰ� ����. java.lang ��Ű���� ����

import java.lang.*;


class Access04 extends ProtectedEx01{
	public Access04() {
	//protected������ ����� �߱� ������ ��밡��
	a=10;
	prn();
	}
}

class MyFrame extends Frame{
	public void prn() {
		String s = paramString();
		System.out.println(s);
	}
}


public class AccessEx04 {
	public static void main(String[] args) {
		Access04 b = new Access04();
		// b. protected �ʵ� �� �޼ҵ� �Ⱥ���, protected�� ��ӹ��� Ŭ������������ ��밡��
		MyFrame m = new MyFrame();
		m.prn();
	}
}
