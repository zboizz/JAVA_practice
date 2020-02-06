package ch17;


import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JColorChooserEx01 extends JFrame 
implements ChangeListener{

	JColorChooser color; 	//swing �߰�
	JButton btn;		 	//swing �߰�
	
	
	
	public JColorChooserEx01() {
		setTitle("ColorChooser ����1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		color = new JColorChooser();
		color.getSelectionModel().addChangeListener(this);
		color.setBorder(BorderFactory.createTitledBorder("������"));
		
		JPanel p = new JPanel();
		
		p.add(color);
		
		btn = new JButton("��ư");
		add(btn,BorderLayout.PAGE_START);
		
		
		
		add(p);
		
		pack(); //setsize�� �ƴ϶� pack();�� �ϸ� �ּ����� �ʿ��� ������ ����
		setVisible(true);
	}
	
	
	
	
	@Override
	public void stateChanged(ChangeEvent e) {
	Color c = color.getColor();
	btn.setBackground(c);
	}
	
	
	
	
	public static void main(String[] args) {
		new JColorChooserEx01();
	}


	
}
