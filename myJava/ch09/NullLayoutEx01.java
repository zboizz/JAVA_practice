package ch09;

import java.awt.Button;

public class NullLayoutEx01 extends MFrame {
	
	
	Button btn1, btn2;
	
	public NullLayoutEx01() {
		setTitle("NullLayout ����1");
		setLayout(null);
		btn1 = new Button("��ư1");
		btn2 = new Button("��ư2");
		btn1.setBounds(10,50,50,50);
		btn2.setBounds(100,50,50,50);
		
		//setBounds(x��ǥ, y��ǥ, ����, ����)
		
		add(btn1);
		add(btn2);
		validate();
	}
		
	public static void main(String[] args) {
		new NullLayoutEx01();
	}
}
