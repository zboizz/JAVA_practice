package ch0401;

//�����ε��� �����ʰ� ���� Ŭ����
class Overload01{
	//�μ��� ���� ���� ���ؼ� ����ϼ��� plus
	void plusShort(short a, short b) {
		System.out.println(a+b);
	}
	void plusInt(int a, int b) {
		System.out.println(a+b);
	}
	void plusDouble(double a, double b) {
		System.out.println(a+b);
	}
}

class Overload02{
	//�μ��� ���� ���� ���ؼ� ����ϼ��� plus
	void plus(short a, short b) {
		System.out.println(a+b);
	}
	void plus(int a, int b) {
		System.out.println(a+b);
	}
	void plus(double a, double b) {
		System.out.println(a+b);
	}
}


public class OverloadingEx01 {
	public static void main(String[] args) {
		
	}
}
