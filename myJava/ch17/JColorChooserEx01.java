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

	JColorChooser color; 	//swing 추가
	JButton btn;		 	//swing 추가
	
	
	
	public JColorChooserEx01() {
		setTitle("ColorChooser 예제1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		color = new JColorChooser();
		color.getSelectionModel().addChangeListener(this);
		color.setBorder(BorderFactory.createTitledBorder("색상선택"));
		
		JPanel p = new JPanel();
		
		p.add(color);
		
		btn = new JButton("버튼");
		add(btn,BorderLayout.PAGE_START);
		
		
		
		add(p);
		
		pack(); //setsize가 아니라 pack();을 하면 최소한의 필요한 공간을 제공
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
