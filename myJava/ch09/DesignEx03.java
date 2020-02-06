package ch09;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class DesignEx03 extends MFrame{

	List list;
	Button b[] = new Button[4];
	String lab[] = {"추가","지우기","전체지우기","종료"};
	TextField tf;
	Panel p1, p2, p3;
	
	
	public DesignEx03() {
		super(300,200);
		setTitle("디자인 예제3");
		setLayout(new BorderLayout());
		
		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(4,1));
		b = new Button[4];
		for (int i = 0; i < b.length; i++) {
			b[i] = new Button(lab[i]);
			p1.add(b[i]);
		}
		add(p1,BorderLayout.EAST);
		
		
		Panel p2 = new Panel();
		p2.add(tf = new TextField(36));
		//tf.setEditable(false);
		add(p2,BorderLayout.SOUTH);
		
		Panel p3 = new Panel();
		p3.add(list = new List());
		add(p3,BorderLayout.WEST);
		
		validate();
	}

	public static void main(String[] args) {
		new DesignEx03();
	}
}
