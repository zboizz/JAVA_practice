package ch10;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class EventEx06 extends MFrame{
	
	Checkbox cb;
	
	public EventEx06() {
		setTitle("Event ����6");
		add(cb = new Checkbox("����"), BorderLayout.SOUTH);
		
		cb.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				dispose(); //ȭ�鿡 �����.
				
				System.exit(0); //���α׷� ����
			}
		});
	}

	public static void main(String[] args) {
		new EventEx06();
	}

}
