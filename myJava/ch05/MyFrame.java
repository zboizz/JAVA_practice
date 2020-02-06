package ch05;

import java.awt.Color;
import java.awt.Frame;

public class MyFrame/*6대 클래스*/ extends Frame /*5대클래스*/{ 

	public MyFrame() {
		setSize(300,300);
		setBackground(Color.CYAN);
		setVisible(true);
		setResizable(false);
		a();		
		}
	
	public void a() {}
}
