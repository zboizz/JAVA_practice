package ch10;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventEx05 extends MFrame{
	
	Button btn;
	
	public EventEx05() {
		setTitle("Event 예제1");
		add(btn = new Button("버튼"), BorderLayout.SOUTH);
	
		
		//익명클래스를 활용
		btn.addActionListener(new ActionListener() {	//익명클래스 방법으로 ()에 객체생성	
			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(MColor.rColor());
			}
		}); 
		
		
		
		validate();
	}


	public static void main(String[] args) {
		new EventEx05();
	}

}
