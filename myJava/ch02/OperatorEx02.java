package ch02;

public class OperatorEx02 {
	public static void main(String[] args) {
		//대입연산자 ++, --, +=, -=, *=, /=
		int a = 1;
		int b = 1;
		int a1 = a++;
		int b1 = ++b;
		System.out.println("a1 :" + a1);
		System.out.println("b1 :" + b1);
		a+=b; //a= a+b;
		System.out.println(a);
	}
}
