package ch09;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Label;
import java.awt.Panel;

public class PanelEx01 extends MFrame{
	
	Label label1, label2, label3;
	Button btn1, btn2, btn3;
	
	public PanelEx01() {
		setTitle("panel ����1");
		setLayout(new BorderLayout());
		Panel p1, p2;
		
		p1 = new Panel();
		p1.add(label1 = new Label("ù��°", Label.CENTER));
		p1.add(label2 = new Label("�ι�°", Label.CENTER));
		p1.add(label3 = new Label("�¹�°", Label.CENTER));
		
		p1.setBackground(MColor.rColor());
		add(p1, BorderLayout.NORTH);
		
	//////////////////////////////////////////////
		p2 = new Panel();
		p2.add(btn1 = new Button("Start"));
		p2.add(btn2 = new Button("Stop"));
		p2.add(btn3 = new Button("End"));
		
		p2.setBackground(MColor.rColor());
		add(p2, BorderLayout.SOUTH);
		
		validate();
		
		
	}
	
	
	
	public static void main(String[] args) {
		new PanelEx01();
	}

}
