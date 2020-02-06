package TrySec;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class planMain extends JFrame implements ActionListener{	

	JButton btn_1, btn_2;
	planList  plan;
	planAdd planAdd;
	
	public planMain() {
	setTitle("메인창");
	setSize(250,200);
	setResizable(false);
	
	
	JPanel p = new JPanel();
	btn_1 = new JButton("리스트");
	btn_2 = new JButton("추가");
	
	btn_1.addActionListener(this);
	btn_2.addActionListener(this);
	p.add(btn_1);
	p.add(btn_2);

	add(p, BorderLayout.PAGE_END);
	setVisible(true);
	
	}
	
				@Override
				public void actionPerformed(ActionEvent e) {
				Object obj = e.getSource();
				
				if(obj==btn_1) {					
					new planList();
					
				}else if(obj==btn_2) {				
					planAdd = new planAdd();
				}		
				
				}
				
				

	
	public static void main(String[] args) {
		new planMain();
	}
	}
