package ch09;

import java.awt.Button;
import java.awt.Label;

public class ButtonEx01 extends MFrame{

	Label label1, label2;
	Button btn1, btn2;
	
	public ButtonEx01() {
		super(250,250);
		setTitle("Button 예제");
		
		add(label1 = new Label("제목이 있는 버튼"));          //같은 결과1
		add(btn1 = new Button("버튼"));	
		
		add(label1 = new Label("제목이 없는 버튼"));     //같은 결과2
		add(btn2 = new Button("버튼"));
		validate();
	}
	
	public static void main(String[] args) {
		new ButtonEx01();
	}
}
