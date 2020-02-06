package practice;

import java.awt.Color;
import java.awt.Frame;

	
class A02 extends Frame{
	public A02() {
		setSize(200,200);
		setBackground(Color.DARK_GRAY);
		setVisible(true);                   //보이지않지만 기능이 있는
	}
	void prn(String s) {                    //보이는
		System.out.println(s);
	}
}
class B02 extends A02{
	public B02() {
		prn("비빔 칼국수");
	}
}


public class Ex01 {
	public static void main(String[] args) {
				A02 a = new A02();
				B02 b = new B02();
	}
}
