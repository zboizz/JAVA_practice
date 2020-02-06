package TryFirst;

import java.awt.BorderLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DBMainFrame extends JFrame implements ActionListener{

	JButton mainbtn_1,mainbtn_2;
	List list;
	JLabel label;		
	JPanel p;
	
	
	public DBMainFrame() {
		setTitle("main");
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(200,200);
		
		
		p = new JPanel();
		label = new JLabel("                     HELLO");
		add(label, BorderLayout.CENTER);
		
		mainbtn_1 = new JButton("목록");
	    mainbtn_2 = new JButton("추가");
		
		mainbtn_1.addActionListener(this);
		mainbtn_2.addActionListener(this);
		
		p.add(mainbtn_1);
		p.add(mainbtn_2);
		add(p, BorderLayout.PAGE_END);
		setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		//두 개의 창 오픈하기
		//해쉬태그 리스트, 추가창
		if(obj==mainbtn_1) {
			new DBList();			
		}else if(obj==mainbtn_2) {
			new DBadd();
		}
				
	}		

	public static void main(String[] args) {
		new DBMainFrame();
	}
}
