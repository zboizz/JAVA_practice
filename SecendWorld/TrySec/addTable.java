package TrySec;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class addTable extends JFrame implements ActionListener {

	JPanel p1, p2, p3, p4, p5;
	JTextField tf1, tf2, tf3, tf4;
	
	
	public addTable() {
	setTitle("추가하는 페이지");
	setSize(300, 200);
		
	p1 = new JPanel();
	tf1 = new JTextField();
	
	add(p1);
	
	setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	}
	
	public static void main(String[] args) {
		new addTable();
	}

	
}
