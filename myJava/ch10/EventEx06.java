package ch10;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class EventEx06 extends MFrame{
	
	Checkbox cb;
	
	public EventEx06() {
		setTitle("Event 예제6");
		add(cb = new Checkbox("종료"), BorderLayout.SOUTH);
		
		cb.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				dispose(); //화면에 사라짐.
				
				System.exit(0); //프로그램 종료
			}
		});
	}

	public static void main(String[] args) {
		new EventEx06();
	}

}
