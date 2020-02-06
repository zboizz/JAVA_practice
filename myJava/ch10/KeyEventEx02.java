package ch10;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventEx02 extends MFrame 
implements ActionListener, KeyListener {

	Button move;
	
	public KeyEventEx02() {
		super(400, 500, new Color(100,200,100));
		setTitle("KeyEvent 예제2");		
		setLayout(null);
		move = new Button("move");
		
		move.addKeyListener(this);		
		move.addActionListener(this);
		
		move.setBounds(200, 250, 50, 30);
		add(move);
		move.requestFocus();
		validate();
	}
	@Override
	public void keyPressed(KeyEvent e) {
	int code = e.getKeyCode();
	//System.out.println(code);
	String txt = KeyEvent.getKeyText(code);
	//System.out.println(txt);
	int x = move.getX();
	int y = move.getY();  //x와 y의 좌표값을 가져온다.
	if(txt.equals("Right")) {
		x += 10;
	}else if(txt.equals("Left")) {
		x -= 10;
	}else if(txt.equals("Up")) {
		y -= 10;
	}else if(txt.equals("Down")) {
		y += 10;
	}
	move.setLocation(x, y);
	//setBackground(MColor.rColor());
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}	
	@Override
	public void keyTyped(KeyEvent e) {}
	@Override
	public void keyReleased(KeyEvent e) {}

	public static void main(String[] args) {
		new KeyEventEx02();
	}

	
}
