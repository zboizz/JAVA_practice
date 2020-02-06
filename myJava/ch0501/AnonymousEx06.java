package ch0501;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ch05.MColor;


//�͸�Ŭ������ ������� �ʰ� �̺�Ʈ ����� �۵�

class MyAction implements ActionListener{
	NaFrame na;
	public MyAction(NaFrame na) {
		this.na=na;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {		
	na.setBackground(MColor.rColor());			
	Color c[] = MColor.rColor2();	
	na.btn.setBackground(c[0]);
	na.btn.setForeground(c[1]);
 }
}

class NaFrame extends MFrame{
	
	Button btn;
	public NaFrame() {
		btn = new Button("Button");
		add(btn,"South"); //��ư�� ��ġ�� ����
		
		//MyAction Ŭ������ NaFrame�� �ִ� �ʵ忡 ������ �� �ֵ��� ��ġ
		MyAction ma = new MyAction(this); //MyAction ����
		//this�� NaFrame ��ü�� �������� �� ��ü�� �ּҰ�
		btn.addActionListener(ma); //������ ���� �׼Ǹ����� �̺�Ʈ ȣ��
	}
}


public class AnonymousEx06 {
	public static void main(String[] args) {
		NaFrame ma = new NaFrame();
	}
}
