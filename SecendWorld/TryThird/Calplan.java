package TryThird;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;



public class Calplan extends JFrame{

	JLabel label;
	
	public Calplan() {
	setTitle("캘린더");
	setSize(200,200);
	setBackground(Color.ORANGE);
	
	label = new JLabel("공사중");
	add(label, BorderLayout.CENTER);
		
	setVisible(true);
	}
	
	public static void main(String[] args) {
		new Calplan();
	}
}
