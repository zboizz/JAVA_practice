package TryThird;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class mainplan extends JFrame implements ActionListener{

	JButton btn_1, btn_2, btn_3;
	
	public mainplan() {
		setTitle("메인화면");
		setSize(300,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		btn_1 = new JButton("캘린더");	btn_2 = new JButton("리스트");	btn_3 = new JButton("추가");
		
		btn_1.addActionListener(this); btn_2.addActionListener(this); btn_3.addActionListener(this);
		
		p.add(btn_1); p.add(btn_2);	p.add(btn_3);
		
		add(p, BorderLayout.PAGE_END);		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==btn_1)	new Calplan();
		else if(obj==btn_2)	new Listplan();
		else if(obj==btn_3)	new addplan();
	}
	
	public static void main(String[] args) {
		new mainplan();
	}
}
