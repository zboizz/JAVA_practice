package Try4th;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class scheduleAdd extends JFrame implements ActionListener{
		
		JLabel label, l1, l2, l3, l4;
		JButton save_btn, getback_btn;
		JPanel p1, p2, p3, p4, p5, p6, p7;
		JTextField tf1, tf2, tf3, tf4;
		Font titleFont = new Font("����",Font.BOLD,30);
		Font btnFont = new Font("����",Font.BOLD,15);
		Font cateFont = new Font("����",Font.BOLD,20);
		Vector<ScheduleBean> vtable;	
		ScheduleMgr mgr;
		JScrollPane sp;
		JFrame frame;
		private boolean continueInput = false;
		boolean selectCheck = true;
		int idx;
		
	public scheduleAdd() {
		setTitle("�����߰�");		
		setSize(450,500);
		mgr=new ScheduleMgr();
		getContentPane().setLayout(null);
		
		label= new JLabel("�����߰�");	
		label.setBounds(171, 0, 144, 35);
		label.setFont(titleFont);		
		getContentPane().add(label);
		
		
		continueInput = false;
		
		l1=new JLabel("Ÿ��Ʋ:  ");
		l1.setFont(cateFont);		
		tf1 = new JTextField(20);
		tf1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==10) {					
					tf2.requestFocus();
				}
			}
		});		
		l2=new JLabel("��¥:  ");
		l2.setFont(cateFont);		
		tf2 = new JTextField(20);
	
		
		tf2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {				
				if(e.getKeyCode()==10) {tf3.requestFocus();}
			}
		});
		l3=new JLabel("���γ���:  ");
		l3.setFont(cateFont);		
		tf3 = new JTextField(20);		
		tf3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) 
			{if(e.getKeyCode()==10) {tf4.requestFocus();}
			}
		});		
		l4=new JLabel("#�ؽ��±�  :");
		l4.setFont(cateFont);		
		tf4 = new JTextField(20);		
		tf4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==10) {
					ScheduleBean bean = new ScheduleBean();
					System.out.println("�Է½���");
					bean.setpidx(idx);
					bean.setptitle(tf1.getText());
					bean.setpdate(tf2.getText());
					bean.setpdetail(tf3.getText());
					bean.setphashTag(tf4.getText());
					
					mgr.insertPlan(bean);
					if(continueInput==true) {
						tf1.setText("");
						tf2.setText("");		
						tf3.setText("");
						tf4.setText("");
						tf1.requestFocus();
					}else {	
						showMessage("����Ǿ����ϴ�");
						new scheduleAct();
						dispose();
						selectCheck = true;
					}					
				}
			}
		});
		
		l1.setBounds(32,67,102,40);	l2.setBounds(32,105,102,40); l3.setBounds(182,151,154,35); l4.setBounds(171,266,144,35);		
		tf1.setBounds(126, 77, 210, 26); tf2.setBounds(126, 115, 210, 26); 
		tf3.setBounds(126, 186, 210, 70); tf4.setBounds(126, 298, 210, 60);		
		getContentPane().add(l1); getContentPane().add(l2);	getContentPane().add(l3); getContentPane().add(l4);
		getContentPane().add(tf1); getContentPane().add(tf2); getContentPane().add(tf3); getContentPane().add(tf4);		
		
		save_btn = new JButton("����");
		getback_btn = new JButton("���");
		save_btn.addActionListener(this);
		getback_btn.addActionListener(this);
		
		save_btn.setBounds(144, 411, 80, 40); getback_btn.setBounds(235, 411, 80, 40);		
		getContentPane().add(save_btn); getContentPane().add(getback_btn);	
		
		setVisible(true);
	
	}		
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==save_btn) {
			ScheduleBean bean = new ScheduleBean();
			if(tf1.getText().equals(tf1.getText().trim())) {
				System.out.println("�Է½���");
			bean.setpidx(idx);
			bean.setptitle(tf1.getText());
			bean.setpdate(tf2.getText());
			bean.setpdetail(tf3.getText());
			bean.setphashTag(tf4.getText());
			
			mgr.insertPlan(bean);
			if(continueInput==true) {
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				tf4.setText("");
				tf1.requestFocus();
			}else {					
				showMessage("����Ǿ����ϴ�");
				new scheduleAct();
				dispose();
				
				selectCheck = true;	
			}
			}
		}
		else if(obj==getback_btn) new ScheduleMain(); dispose();
	}
	
	
	public void showMessage(String message) {
		JOptionPane.showMessageDialog(frame, message, "�޼���", JOptionPane.INFORMATION_MESSAGE);		
	}
	
	public static void main(String[] args) {
		new scheduleAdd();
	}


	
}
