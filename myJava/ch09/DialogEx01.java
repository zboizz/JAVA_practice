package ch09;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogEx01 extends MFrame 
implements ActionListener{

	Button btn;
	String title = "�޼��� ��ȭ����";
	
	
	public DialogEx01() {
		super(300, 300);
		setLayout(null);
		setTitle("Dialog ����1");
		btn = new Button("���̱�");
		btn.setBounds(100, 135, 100, 30);
		btn.setBackground(Color.CYAN);
		btn.addActionListener(this);
		add(btn);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		MyDialog md = new MyDialog(this, title, true);
		int w = 150;
		int h = 100;
		//md.setSize(w, h);
		
		//seyBounds, getWidth, getHeight, getX, getY�� �̿��ؼ� â�� �߰��� ����
		int x = getX() + getWidth()/2 - w/2;
		int y = getY() + getHeight()/2 - h/2;
		md.setBounds(x, y, w, h);
		
		//md.setBounds(getX()+75,getY()+90,w,h);		
		md.setVisible(true);
	}
	
	//Dialog Ŭ���� ����� ���� Ŭ���� ����
	class MyDialog extends Dialog implements ActionListener{
		Button b;
		public MyDialog(Frame opener, String title, boolean modal) {
			super(opener, title, modal);
			//Dialog  ��ġ�����ڴ� FlowLayout
			setLayout(null);
			b = new Button("Ȯ��");
			b.addActionListener(this);
			b.setBounds(60, 50, 30, 20);
			add(b);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();//�������.
		}
	}
	
	public static void main(String[] args) {
		new DialogEx01();
	}
}