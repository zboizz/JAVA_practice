package ch0501;

interface MyInterface{
	public static final int T = 100; //T�� ���, ����̱⿡ �� �ο�
	//static final ����
	public abstract void prn();
	//abstract ����
	
	//jdk8.0���� �����Ǵ� ���
	public default void prn1() {
	System.out.println(T);
	
	}
	public static void prn2() {
	System.out.println(T);
	}
}




public class InterfaceEx05 {
	public static void main(String[] args) {
		
	}
}
