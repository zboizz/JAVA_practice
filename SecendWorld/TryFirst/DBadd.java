package TryFirst;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class DBadd extends JFrame implements ActionListener {

	JButton addbtn_1, addbtn_2; 
	JLabel label; 
	JPanel p1,p2,p3,p4,p5,p6;
	JTextField tf1, tf2, tf3, tf4;
	JCheckBox ck1;
	DBMgr mgr;
	List list;
	
	int idx;
	private boolean continueInput = false;
	boolean selectCheck = true;
	int updateIdx;
	
	public DBadd() {
	//타이틀, 날짜, 내용 추가
		setSize(300,400);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		mgr = new DBMgr();
		setTitle("추가");
		label = new JLabel();
		label.setOpaque(true);
		label.setText("추가화면");
		label.setBackground(Color.GRAY);
		p2 = new JPanel();
		p2.setLayout(new GridLayout(4, 1));
		continueInput = false;
		p3 = new JPanel();
		p3.add(new JLabel("title  :"));
		tf1 = new JTextField(20);
		tf1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==10) {
					tf2.requestFocus();
				}
			}
		});
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		p3.add(tf1);
		p2.add(p3);
		
		p4 = new JPanel();
		p4.add(new JLabel("date  :"));
		tf2 = new JTextField(20);
		p4.add(tf2);
		p2.add(p4);
		tf2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==10) {
					tf3.requestFocus();
				}
			}
		});
		p5 = new JPanel();
		p5.add(new JLabel("hashtag  :"));
		tf3 = new JTextField(20);
		tf3.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==10) {
					planBean bean = new planBean();
					System.out.println("입력 시작");
					bean.setpostIdx(idx);
					bean.settitle(tf1.getText());
					bean.setplanningDate(tf2.getText());
					bean.sethashTag(tf3.getText());

					mgr.insertplan(bean);
					if(continueInput==true) {
					tf1.setText("");
					tf2.setText("");
					tf3.setText("");
					tf1.requestFocus();
					}
					else {
						p2.removeAll();
						remove(p2);
						list.removeAll();
						remove(list);
						//setDeleteIdx(1);
						//viewList();
						//b1.setEnabled(true);
						//b2.setEnabled(true);
						//setEnabled(true);
						selectCheck = true;
					}
				}
			}
		});
		p5.add(tf3);
		p2.add(p5);
		
		p6 = new JPanel();
		ck1 = new JCheckBox("연속 입력");
		ck1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
			System.out.println(e.getStateChange());
			if(e.getStateChange()==1) 
				continueInput=true;
			else
				continueInput=false;
			}
		});	
		p6.add(ck1);
		addbtn_1 = new JButton("저장");
		addbtn_1.addActionListener(this);
		p6.add(addbtn_1);
		p2.add(p6);

		add(p2, BorderLayout.CENTER);
		setVisible(true);
	}
		
	
	@Override
	public void actionPerformed(ActionEvent e) {
	//추가, 취소버튼만들기
		Object obj = e.getSource();
		
		if(obj==addbtn_1/*저장*/) {
			
			planBean bean = new planBean();
			if(tf1.getText().equals(tf1.getText().trim())) {
				System.out.println("입력 시작");
			bean.setpostIdx(idx);
			bean.settitle(tf1.getText());
			bean.setplanningDate(tf2.getText());
			bean.sethashTag(tf3.getText());

			mgr.insertplan(bean);
			if(continueInput==true) {
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			tf1.requestFocus();
			}
		}else if(obj==addbtn_2){
				System.exit(0);
				}
			}
		}
	
	
	
	public static void main(String[] args) {
		new DBadd();
	}

	
}
