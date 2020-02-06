package ch09;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;


public class DesignEx0101 extends MFrame {
	
	//ù°���� �󺧷� ���
	//üũ�ڽ��� �׷�ȭ
	//��ü���� ���̾ƿ��� BorderLayout()����
	//���� �ϴ��� ��ư����
	Label label;
	Checkbox cb1, cb2, cb3;
	CheckboxGroup cbg;
	Button btn1, btn2;
	
	public DesignEx0101() {
		super(250,150);
		setTitle("������ ����1");
		//Frame�� ����Ʈ ��ġ�����ڰ� BorderLayout ������ 
		//MFrame�� ���� �� �ʿ信 ���ؼ� Flowlayout ����
		setLayout(new BorderLayout());
		
		label = new Label("�����߿� ����", Label.CENTER);		
		label.setBackground(Color.DARK_GRAY);		
		add(label, BorderLayout.NORTH);
		
		
		cbg = new CheckboxGroup();
		Panel p1 = new Panel();
		p1.add(cb1 = new Checkbox("���", cbg, true));
		p1.add(cb2 = new Checkbox("����", cbg, false));
		p1.add(cb3 = new Checkbox("�޵�", cbg, false));
		
		add(label,BorderLayout.NORTH);
		add(p1);
		
		
		Panel p2 = new Panel();
		
		p2.add(btn1 = new Button("Start"));
		p2.add(btn2 = new Button("End"));
		
		add(p2, BorderLayout.SOUTH);
		validate();
	}	

	public static void main(String[] args) {
		new DesignEx0101();
	}
}