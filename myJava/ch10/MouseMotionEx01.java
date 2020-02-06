package ch10;

import java.awt.Color;
import java.awt.Label;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMotionEx01 extends MFrame implements MouseMotionListener {

	Label lDrag, lMove;
	
	public MouseMotionEx01() {
		super(500, 300, new Color(100,200,100),true);
		setTitle("MouseMotion 예제1");
		setLayout(null);
		lDrag = new Label("Drag",Label.CENTER);
		lMove = new Label("Move",Label.CENTER);
		lDrag.setBounds(100, 100, 50, 30);
		lMove.setBounds(100, 150, 50, 30);
		lDrag.setBackground(Color.CYAN);
		lMove.setBackground(Color.PINK);
		add(lDrag);
		add(lMove);
		addMouseMotionListener(this);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		Point p = e.getPoint(); //이벤트 발생이 되는 위치정보 객체
		lMove.setLocation(p);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		Point p = e.getPoint(); 
		lDrag.setLocation(p);
	}
	
	
	
	
	public static void main(String[] args) {
		new MouseMotionEx01();
	}
}
