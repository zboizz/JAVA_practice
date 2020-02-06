package ch04;

import java.awt.Color;
import java.awt.Frame;

public class Test02 {
	public static void main(String[] args) {
		//생성자의 본연의 기능은 객체가 생성될때 기본적인 속성이 초기화.
		//MFrame m = new MFrame();
		Frame f = new Frame();
		f.setSize(300,300);
		f.setBackground(Color.green);
		f.setVisible(true);
	}
}
