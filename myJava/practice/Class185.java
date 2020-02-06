package practice;

import java.util.Scanner;

class Rectangle {
	int width;
	int height;
	public int getArea() {
		return width*height;
	}
}



public class Class185 {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Scanner s=new Scanner(System.in);
		System.out.print(">>");
		rect.width = s.nextInt();
		rect.height = s.nextInt();
		System.out.println("사각형의 면적은" + rect.getArea());
		s.close();
	}
}
