package ch10;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventEx03 extends MFrame
implements ActionListener, KeyListener{

	public KeyEventEx03() {
		super(500,500, new Color(100,200,100));
		setTitle("KeyEvent 예제3");
		addKeyListener(this);
	}
	
	
	@Override
	public void keyPressed(KeyEvent e) {
		//도화지에 그리는 붓을 리턴
		Graphics g = getGraphics(); //컴포넌트를 그리는 붓
		g.setFont(new Font("Dialog",Font.BOLD,20));
		
		
		//출력된 글씨 지우기
		g.clearRect(0,0,500,300);
		
		
		g.setColor(Color.RED);
		g.drawString("code 값 : "+e.getKeyCode(), 30, 80);
		g.drawString("문자값 : "+e.getKeyChar(), 30, 110);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		Graphics g = getGraphics(); //컴포넌트를 그리는 붓
		g.setFont(new Font("Dialog",Font.BOLD,20));
		
		
		//출력된 글씨 지우기
		//g.clearRect(0,0,500,300);
		
		
		g.setColor(Color.BLUE);
		g.drawString("code 값 : "+(int)e.getKeyChar(), 30, 150); //대소문자 구별위해 (int)
		g.drawString("문자값 : "+e.getKeyChar(), 30, 180);
	}

	
	

	
	@Override
	public void keyReleased(KeyEvent e) {}
	@Override
	public void actionPerformed(ActionEvent e) {
	}

	
	
	
	public static void main(String[] args) {
		new KeyEventEx03();
	}
}
