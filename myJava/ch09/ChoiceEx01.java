package ch09;

import java.awt.Choice;
import java.awt.Color;

public class ChoiceEx01 extends MFrame {

	String city[] = {"���ø� �����ϼ���.","������","�� ��",
			"�Ͽ���","�� ��","�� ��","�� ��"};
	
	Choice ch;
	
	public ChoiceEx01() {
		super(300, 300, new Color(100,200,100));
		ch = new Choice();
		for (int i = 0; i < city.length; i++) {
			ch.add(city[i]); //i���� �ְڴ�. (addItem)
		}
		
		
		add(ch);
		validate();
		
	}
	public static void main(String[] args) {
		new ChoiceEx01();
	}
}
