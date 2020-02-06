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
	String title = "메세지 대화상자";
	
	
	public DialogEx01() {
		super(300, 300);
		setLayout(null);
		setTitle("Dialog 예제1");
		btn = new Button("보이기");
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
		
		//seyBounds, getWidth, getHeight, getX, getY를 이용해서 창이 중간에 오픈
		int x = getX() + getWidth()/2 - w/2;
		int y = getY() + getHeight()/2 - h/2;
		md.setBounds(x, y, w, h);
		
		//md.setBounds(getX()+75,getY()+90,w,h);		
		md.setVisible(true);
	}
	
	//Dialog 클래스 상속한 내부 클래스 선언
	class MyDialog extends Dialog implements ActionListener{
		Button b;
		public MyDialog(Frame opener, String title, boolean modal) {
			super(opener, title, modal);
			//Dialog  배치관리자는 FlowLayout
			setLayout(null);
			b = new Button("확인");
			b.addActionListener(this);
			b.setBounds(60, 50, 30, 20);
			add(b);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();//사라진다.
		}
	}
	
	public static void main(String[] args) {
		new DialogEx01();
	}
}