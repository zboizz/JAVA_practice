package ch10;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventEx05 extends MFrame{
	
	Button btn;
	
	public EventEx05() {
		setTitle("Event ����1");
		add(btn = new Button("��ư"), BorderLayout.SOUTH);
	
		
		//�͸�Ŭ������ Ȱ��
		btn.addActionListener(new ActionListener() {	//�͸�Ŭ���� ������� ()�� ��ü����	
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
