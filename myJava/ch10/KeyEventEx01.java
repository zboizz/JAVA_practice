package ch10;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventEx01 extends MFrame 
implements ActionListener, KeyListener { //상속은 하나뿐이지만 인플레먼트는 여러개 가능
	
	TextField tf;
	TextArea ta;
	
	public KeyEventEx01() {
		super(300,500);
		setTitle("KeyEvent 에제1");		
		add(tf=new TextField(), BorderLayout.SOUTH);
		tf.addKeyListener(this);
		
		add(ta=new TextArea());
		
		ta.setEditable(false);
		Button btn = new Button("REMOVE");
		add(btn, BorderLayout.NORTH);
		btn.setBackground(new Color(100,100,100));
		btn.addActionListener(this);
		validate();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		ta.setText("");
		tf.setText("");
		tf.requestFocus();
	}
	
	@Override 
	//F1~F12, shift, ctrl, 방향키 입력일 때 인식 못함.
	// 1~10, A~z 인식
	public void keyTyped(KeyEvent e) {
		ta.append("##keyTyped : " + tf.getText() +"\n");
	}
	@Override
	public void keyPressed(KeyEvent e) {
		ta.append("##keyPressed : " + tf.getText() +"\n");
	}
	@Override
	public void keyReleased(KeyEvent e) {
		ta.append("##keyReleased : " + tf.getText() +"\n");
	}

	
	public static void main(String[] args) {
		new KeyEventEx01();
	}

	
}
