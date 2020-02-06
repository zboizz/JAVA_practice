package ch09;

import java.awt.Button;

public class NullLayoutEx01 extends MFrame {
	
	
	Button btn1, btn2;
	
	public NullLayoutEx01() {
		setTitle("NullLayout 예제1");
		setLayout(null);
		btn1 = new Button("버튼1");
		btn2 = new Button("버튼2");
		btn1.setBounds(10,50,50,50);
		btn2.setBounds(100,50,50,50);
		
		//setBounds(x좌표, y좌표, 넓이, 높이)
		
		add(btn1);
		add(btn2);
		validate();
	}
		
	public static void main(String[] args) {
		new NullLayoutEx01();
	}
}
