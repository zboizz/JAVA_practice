package ch09;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class DesignEx0301 extends MFrame{

//���� �޴����� GridLayout()����

	List list;
	Button b[] = new Button[4];
	String lab[] = {"�߰�","�����","��ü�����","����"};
	TextField tf;
	Panel p1, p2, p3;
	
	
	public DesignEx0301() {
		super(300,200);
		setTitle("������ ����3");
		setLayout(new BorderLayout()); //��ü���� ������ BorderLayout()
		
		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(4,1));
		b = new Button[4];
		for (int i = 0; i < b.length; i++) {
			b[i] = new Button(lab[i]);
			p1.add(b[i]);
			//p1.add(b[i] = new Button(lab[i]));
		}
		add(p1,BorderLayout.EAST);
			
		
		add(list = new List());
		list.add("«��");
		add(tf = new TextField(),BorderLayout.SOUTH);
		
		validate();
	}

	public static void main(String[] args) {
		new DesignEx0301();
	}
}
