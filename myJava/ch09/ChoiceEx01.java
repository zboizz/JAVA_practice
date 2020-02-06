package ch09;

import java.awt.Choice;
import java.awt.Color;

public class ChoiceEx01 extends MFrame {

	String city[] = {"도시를 선택하세요.","베를린","파 리",
			"하와이","런 던","평 양","뉴 욕"};
	
	Choice ch;
	
	public ChoiceEx01() {
		super(300, 300, new Color(100,200,100));
		ch = new Choice();
		for (int i = 0; i < city.length; i++) {
			ch.add(city[i]); //i값을 넣겠다. (addItem)
		}
		
		
		add(ch);
		validate();
		
	}
	public static void main(String[] args) {
		new ChoiceEx01();
	}
}
