package ch0501;

//ActionListener �������̽�
//ActionEvent Ŭ����
//actionPerformed() �޼ҵ�


import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ch05.MColor;
import ch05.MFrame;

class MyFrame extends ch05.MFrame implements ActionListener{
	Button btn;
	public MyFrame() {
		btn = new Button("��ư");
		add(btn,"South");
		validate();
		btn.addActionListener(this);
	}
	//�������̽��� �������� �������̵��� �ʿ���
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
