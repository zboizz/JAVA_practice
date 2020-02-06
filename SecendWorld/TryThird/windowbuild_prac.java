package TryThird;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTextPane;

public class windowbuild_prac extends JFrame {

	JTextField tf1, tf2, tf3;
	JLabel l1, l2, l3, l4;
	private JLabel lblNewLabel;
	private JTextPane textPane;
	private JTextField textField;
	
	public windowbuild_prac() {
		setSize(500,500);
		
		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JTextField();
						
		l1 = new JLabel("첫번째");
		l2 = new JLabel("두번째");
		l3 = new JLabel("세번째");
		
		tf1.setBounds(22, 348, 87, 103);
		tf2.setBounds(117, 348, 103, 103);
		tf3.setBounds(334, 52, 120, 209);
		getContentPane().setLayout(null);
		
		l1.setBounds(154,52, 56,36);
		l2.setBounds(100,222, 50,50);
		l3.setBounds(251,115, 50,50);
		
		
		getContentPane().add(l1);
		getContentPane().add(l2);
		getContentPane().add(l3);
	
		
		
		
		getContentPane().add(tf1);
		getContentPane().add(tf2);
		getContentPane().add(tf3);
		
		
 		
		
		setVisible(true);
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		new windowbuild_prac();
	}
}
