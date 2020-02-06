package ch10;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EventEx07 extends MFrame{
	
	Button red, blue;
	
	public EventEx07() {
		setTitle("Event ¿¹Á¦7");
		Panel p = new Panel();
		p.add(red = new Button("red"));
		p.add(blue = new Button("blue"));
		

	red.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
		setBackground(Color.red);
		}
	});
	
	blue.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
		setBackground(Color.blue);
		}
	});
	add(p,BorderLayout.SOUTH);
	validate();
	}


	public static void main(String[] args) {
		new EventEx07();
	}
}
