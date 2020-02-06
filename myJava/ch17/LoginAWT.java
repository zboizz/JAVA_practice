package ch17;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginAWT extends JFrame {

	JButton button;
	JLabel l1, l2;
	JTextField t1, t2;
	JPanel p;
	
	
	
	 public LoginAWT() {
	    	setTitle("로그인 예제");
	    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    setSize(400, 300);
	    	setLayout(null);
	        button = new JButton("log in");
	        l1=new JLabel("id");
	        t1=new JTextField(15);
	        l1.setBounds(50, 20, 50, 25);
	        t1.setBounds(70, 20, 70, 25);
	        button.setBounds(50, 80, 90, 25);
	       
	        l2=new JLabel("pw");
	        t2=new JTextField(15);
	        l2.setBounds(50, 50, 50, 25);
	        t2.setBounds(70, 50, 70, 25);

	        add(l1);
	        add(t1);
	        add(l2);
	        add(t2);
	        add(button);
	
	 }
	
	
	public static void main(String[] args) {
	LoginAWT frame = new LoginAWT();
	frame.setVisible(true);
	}
}
