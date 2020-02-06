package ch10;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class MyItem implements ItemListener{
	Frame f;
	public MyItem(Frame f) {
		this.f = f;
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		f.setBackground(MColor.rColor());
	}
}

public class EventEx04 extends MFrame{

	Checkbox cb;
	
	public EventEx04() {
		setTitle("Event 예제4");
		add(cb = new Checkbox("랜덤배경색"), BorderLayout.SOUTH);
		MyItem mi = new MyItem(this);
		cb.addItemListener(mi);
	}

	public static void main(String[] args) {
		new EventEx04();
	}

}

