package ch10;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class EventEx02 extends MFrame
implements ItemListener{

	Checkbox cb;

	public EventEx02() {
		add(cb = new Checkbox("����"), BorderLayout.SOUTH);
		//�̺�Ʈ �ҽ��� �̺�Ʈ�ڵ鷯 ���� - addXXXListener
		cb.addItemListener(this);
		validate();
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		//�̺�Ʈ ��� ����
		//Checkbox c = (Checkbox)e.getSource();
		System.exit(0);
	}
	
	
	public static void main(String[] args) {
		new EventEx02();
	}

	
}
