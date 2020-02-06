package ch10;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventEx02 extends MFrame
implements ActionListener{

	List list;
	Button b[] = new Button[4];
	String lab[] = {"�߰�","�����","��ü�����","����"};
	TextField tf;
	
	public ActionEventEx02() {
		super(300,200);
		//////////////////////////////////////////////
		Panel p = new Panel();
		p.setLayout(new GridLayout(4,1));
		for (int i = 0; i < b.length; i++) {
			p.add(b[i]=new Button(lab[i]));
			b[i].addActionListener(this);//--------------for�� �ȿ� �����
		}	
		
		//////////////////////////////////////////////
		add(list=new  List());
		add(p,BorderLayout.EAST);
		add(tf=new TextField(), BorderLayout.SOUTH);		
		validate();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		//if(b[0]==e.getSource()||tf==e.getSource()) {
		if(cmd.equals(lab[0])||tf==e.getSource()) {
			String s = tf.getText();
			if(s.trim().length()==0) {
				tf.setText("");
				tf.requestFocus();
				setTitle("���ڿ��� �Է��ϼ���.");
				return;//�޼ҵ� ��ü ���� ����.
			}
			list.add(s);
			tf.setText("");
			tf.requestFocus();
			
		}else if(cmd.equals(lab[1])) {
			int idx = list.getSelectedIndex();
			//System.out.println(idx);
			if(idx==-1) {
				setTitle("������ �������� �����ϼ���.");
				return;
			}
			list.remove(idx);
		}else if(cmd.equals(lab[2])) {
			list.removeAll();
		}else if(cmd.equals(lab[3])) {
			System.exit(0);
		}
	}	
	
	public static void main(String[] args) {
		new ActionEventEx02();
	}
}

