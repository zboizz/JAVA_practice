package ch09;

import java.awt.Button;
import java.awt.Color;

public class ButtonEx02 extends MFrame{
	
	
	
	//button을 닫을 수 있는 배열을 만든 것
			Button btn[] = new Button[4];
			String str[] = {"추가", "삭제", "전체삭제", "종료"};
			
	
			
			
public ButtonEx02() {
		
		super(250,250);
		setTitle("Button 예제2");
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
