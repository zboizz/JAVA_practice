package ch0401;

//오버로딩을 하지않고 만든 클래스
class Overload01{
	//인수로 받은 값을 더해서 출력하세요 plus
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
	//인수로 받은 값을 더해서 출력하세요 plus
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
