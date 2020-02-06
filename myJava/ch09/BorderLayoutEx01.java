package ch09;

import java.awt.BorderLayout;
import java.awt.Button;


public class BorderLayoutEx01 extends MFrame{
	
	Button btn[];
	String str[] = {"ù��°","�ι�°","����°","�׹�°","�ټ���°"};
	String layout[] = {BorderLayout.NORTH,
					   BorderLayout.EAST,
					   BorderLayout.SOUTH,
					   BorderLayout.WEST,
					   BorderLayout.CENTER};	
	
	public BorderLayoutEx01() {
		setTitle("BorderLayout ����1");		
		setResizable(true);
		setLayout(new BorderLayout());
		btn = new Button[5];
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button(str[i]);
			btn[i].setBackground(MColor.rColor());			
			add(btn[i], layout[i]);
		}
		validate();
	}
	
	public static void main(String[] args) {
		new BorderLayoutEx01();
	}
}
