package ch09;

import java.awt.Button;
import java.awt.Label;

public class ButtonEx01 extends MFrame{

	Label label1, label2;
	Button btn1, btn2;
	
	public ButtonEx01() {
		super(250,250);
		setTitle("Button ����");
		
		add(label1 = new Label("������ �ִ� ��ư"));          //���� ���1
		add(btn1 = new Button("��ư"));	
		
		add(label1 = new Label("������ ���� ��ư"));     //���� ���2
		add(btn2 = new Button("��ư"));
		validate();
	}
	
	public static void main(String[] args) {
		new ButtonEx01();
	}
}
