package ch09;

import java.awt.Button;
import java.awt.FlowLayout;

public class FlowLayoutEx01 extends MFrame{
	
	Button btn[];
	String str[] = {"첫번째","두번째","세번째","네번째","다섯번째"};
	
	public FlowLayoutEx01() {
		setTitle("FlowLayout 예제1");		
		setResizable(true); //------------------------크기조절가능 setResizable
		//현재 프레임의 배치관리자 세팅
		setLayout(new FlowLayout());
		btn = new Button[5];
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button(str[i]);
			add(btn[i]);
		}validate();
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx01();
	}
}
