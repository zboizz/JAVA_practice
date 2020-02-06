package ch09;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;


public class DesignEx01 extends MFrame {
	
	Label label;
	Checkbox cb1, cb2, cb3;
	CheckboxGroup cbg;
	Button btn1, btn2;
	
	public DesignEx01() {
		super(250,150);
		setTitle("������ ����1");
		setLayout(new BorderLayout());
		
		
		Panel p1 = new Panel();
		p1.setBackground(MColor.rColor());
		p1.add(label = new Label("�����߿� ����", Label.CENTER));
		add(p1, BorderLayout.NORTH);
		
		Panel p3 = new Panel();
		cbg = new CheckboxGroup();
		p3.add(cb1 = new Checkbox("���", cbg, true));
		p3.add(cb2 = new Checkbox("����", cbg, false));
		p3.add(cb3 = new Checkbox("�޵�", cbg, false));
		add(p3);
		
		Panel p2 = new Panel();
		p2.add(btn1 = new Button("Start"));
		p2.add(btn2 = new Button("End"));
		
		add(p2, BorderLayout.SOUTH);
		validate();
	}	

	public static void main(String[] args) {
		new DesignEx01();
	}
}