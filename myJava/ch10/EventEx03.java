package ch10;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//�ܺο� �����ʸ� ������ Ŭ���� ����
class MyAction implements ActionListener{
	
	EventEx03 f;
	
	public MyAction(EventEx03 f) {
	this.f = f;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//System.exit(0);
		f.setBackground(MColor.rColor());
		f.btn.setBackground(MColor.rColor());
	}	
}

public class EventEx03 extends MFrame {
	
		Button btn;
		
		public EventEx03() {
			setTitle("Event ����3");
			add(btn = new Button("��ư"), BorderLayout.SOUTH);			
			
			MyAction ma = new MyAction(this);
			btn.addActionListener(ma);			
			
			validate();
		}

	public static void main(String[] args) {
		new EventEx03();
	}
}
