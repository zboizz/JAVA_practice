package ch09;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;


public class DesignEx02 extends MFrame{

	TextField tf;
	TextArea ta;
	Button btn1, btn2;
	Panel p1, p2;
	
	
	public DesignEx02() {
		super(500, 400);
		setTitle("디자인 예제2");
		setLayout(new BorderLayout());
		
		Panel p1 = new Panel();
		p1.add(tf = new TextField("HELLO",20));
		add(p1,BorderLayout.NORTH);
		
		
		add(ta = new TextArea());
		ta.setEditable(false);
		//ta.append("HOUSE");;

		Panel p2 = new Panel();
		p2.add(btn1 = new Button("마우스 시범용"));
		p2.add(btn2 = new Button("종료"));
		add(p2,BorderLayout.SOUTH);
		
		validate();
	}
	
	public static void main(String[] args) {
		new DesignEx02();
	}
}
