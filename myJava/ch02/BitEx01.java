package ch02;

public class BitEx01 {
	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		int c = a&b;
		int d = a|b;
		int e = a^b;
		int f = ~a;
		System.out.println("a&b = " + c);
		System.out.println("a|b = " + d);
		System.out.println("a^b = " + e);
		System.out.println("~a = " + f);
	}
}
