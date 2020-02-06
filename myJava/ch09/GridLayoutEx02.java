package ch09;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

public class GridLayoutEx02 extends MFrame {
	
	String s[] = {"add","remove","removeall","exit"};
	Button btn[];
	
	
	public GridLayoutEx02() {
		setTitle("GridLayout ¿¹Á¦2");		
		setLayout(new BorderLayout());
		Panel p = new Panel();
		p.setLayout(new GridLayout(4,1));
		btn = new Button[4];
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button(s[i]);
			p.add(btn[i]);
		}
		add(p,BorderLayout.EAST);		
		validate();
	}

	public static void main(String[] args) {
		new GridLayoutEx02();
	}
}
