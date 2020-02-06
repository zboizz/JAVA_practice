package ch12;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawLineEx01 extends MFrame
implements ActionListener{
	
	TextField tx1,tx2,ty1,ty2;
	Button btn;
	MCanvas canvas;
	
	public DrawLineEx01() {
		super(500,300);
		setTitle("DrawLine 예제");
		Panel p = new Panel();
		p.setBackground(Color.yellow);
		tx1 = new TextField("10",3);
		tx2 = new TextField("30",3);
		ty1 = new TextField("10",3);
		ty2 = new TextField("30",3);
		Label l1 = new Label("x1");
		p.add(l1);
		p.add(tx1);
		l1 = new Label("y1");
		p.add(l1);
		p.add(ty1);
		l1 = new Label("x2");
		p.add(l1);
		p.add(tx2);
		l1 = new Label("y2");
		p.add(l1);
		p.add(ty2);
		p.add(btn=new Button("그리기"));
		btn.addActionListener(this);
		add(BorderLayout.NORTH,p);
		add(canvas = new MCanvas());
		validate();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//내부적으로 paint() 메소드를 호출
		canvas.repaint();
	}
	
	
	class MCanvas extends Canvas{
		//객체가 생성되고 내부적으로 호출되는 메소드
		@Override
		public void paint(Graphics g) {
			int x1, y1, x2, y2;
			g.setColor(Color.blue);
			x1 = Integer.parseInt(tx1.getText());
			y1 = Integer.parseInt(ty1.getText());
			x2 = Integer.parseInt(tx2.getText());
			y2 = Integer.parseInt(ty2.getText());
			g.drawLine(x1,y1,x2,y2);
			
		}
	}
	
	public static void main(String[] args) {
		new DrawLineEx01();
	}
}
