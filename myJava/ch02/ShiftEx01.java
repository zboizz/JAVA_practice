package ch02;

public class ShiftEx01 {
	public static void main(String[] args) {
	byte a = 20;
	byte b = -8;
	int c = a<<2; //x만큼 곱하기
	int d = a>>2; //x만큼 나누기
	int e = a>>>2; // 
	System.out.println("a<<2 : "+ c); 
	System.out.println("a>>2 : "+ d);
	System.out.println("a>>>2 : "+ e);
	}
}
