package ch0401;

class C{}



public class GCEx01 {

	public static void main(String[] args) {
		String s = new String();
		String s1 = new String();
		s = s1;
		System.gc(); //5���ο��� ���� String ��ü �޸𸮿��� ����
		C c1 = new C(); //10����
		C c2 = new C(); //11����
		C c3 = new C(); //12����
		c1 = c2;
		c2 = c3;
		System.gc();
	}
}
