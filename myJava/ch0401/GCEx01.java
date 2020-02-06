package ch0401;

class C{}



public class GCEx01 {

	public static void main(String[] args) {
		String s = new String();
		String s1 = new String();
		s = s1;
		System.gc(); //5라인에서 만든 String 객체 메모리에서 제거
		C c1 = new C(); //10번지
		C c2 = new C(); //11번지
		C c3 = new C(); //12번지
		c1 = c2;
		c2 = c3;
		System.gc();
	}
}
