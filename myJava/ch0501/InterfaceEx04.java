package ch0501;

//ActionListener 인터페이스
//ActionEvent 클래스
//actionPerformed() 메소드


import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ch05.MColor;
import ch05.MFrame;

class MyFrame extends ch05.MFrame implements ActionListener{
	Button btn;
	public MyFrame() {
		btn = new Button("버튼");
		add(btn,"South");
		validate();
		btn.addActionListener(this);
	}
	//인터페이스를 적었으니 오버라이딩이 필요함
	@Override
	public void actionPerformed(ActionEvent e) {
		setBackground(MColor.rColor());
	}
}

public class InterfaceEx04 {
	public static void main(String[] args) {
		
	new MyFrame();
	}
}
