package ch09;

import java.awt.Button;
import java.awt.Color;

public class ButtonEx02 extends MFrame{
	
	
	
	//button�� ���� �� �ִ� �迭�� ���� ��
			Button btn[] = new Button[4];
			String str[] = {"�߰�", "����", "��ü����", "����"};
			
	
			
			
public ButtonEx02() {
		
		super(250,250);
		setTitle("Button ����2");
		for (int i = 0; i < btn.length; i++) {
			
			btn[i] = new Button(str[i]);
			
			Color c[] = MColor.rColor2();
			btn[i].setBackground(c[0]);
			btn[i].setBackground(c[1]);
			
			add(btn[i]);
		}
		validate();
	}
	
	public static void main(String[] args) {
		new ButtonEx02();
	}
}
