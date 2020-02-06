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
implements ActionListener, KeyListener { //����� �ϳ��������� ���÷���Ʈ�� ������ ����
	
	TextField tf;
	TextArea ta;
	
	public KeyEventEx01() {
		super(300,500);
		setTitle("KeyEvent ����1");		
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
	//F1~F12, shift, ctrl, ����Ű �Է��� �� �ν� ����.
	// 1~10, A~z �ν�
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
