package ch09;

import java.awt.Color;
import java.awt.Label;

public class LabelEx01 extends MFrame{
	
	Label label1, label2, label3, label4;
	
	
	public LabelEx01() {
		super(300, 300);
		setTitle("Label Example");
		String s = "������ ��� ���� �߼����� ����";
		label1 = new Label(s);
		label2 = new Label(s, Label.CENTER);
		label3 = new Label(s, Label.RIGHT);
		label4 = new Label(s, Label.LEFT);
		
		//Label�� ���� ����
		label1.setBackground(Color.RED);				
		//Label�� ����� ����
		label1.setForeground(Color.YELLOW);	
		
		Color c[] = MColor.rColor2();
		label2.setBackground(c[0]);				
		label2.setForeground(c[1]);		
		
		//������Ʈ�� �����̳�(Frame)�� add
		add(label1);
		add(label2);
		add(label3);
		add(label4);
		validate();
	}
	
	
	public static void main(String[] args) {
		new LabelEx01();
	}
}
