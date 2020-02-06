package ch17;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JComboBoxEx01 extends JFrame implements ActionListener {

	String ani[] = {"dog","tiger","lion","aaa"};
	JLabel label;
	JComboBox<String> com;
	
	
	public JComboBoxEx01() {
		setTitle("JComboBox 예제1");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		com = new JComboBox(ani);
		label = new JLabel();
		
		com.addActionListener(this);		
		
		add(com, BorderLayout.PAGE_START);
		add(label, BorderLayout.PAGE_END);
		setVisible(true);	
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String name = (String)com.getSelectedItem();		
		ImageIcon icon = new ImageIcon("ch17/"+name+".gif");
		//System.out.println(icon.getImageLoadStatus());
		
		int status = icon.getImageLoadStatus();
		if(status==8) {
			label.setText(null);
			label.setIcon(icon);
		}else if(status==4)	{
			label.setIcon(null);
			label.setText("이미지가 없습니다");			
		}	
	}

	
	
	public static void main(String[] args) {
		new JComboBoxEx01();
	}
}
