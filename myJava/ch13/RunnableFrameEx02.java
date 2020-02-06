package ch13;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import ch12.MFrame;
//Thread 기능없이 두 개의 창에 랜덤하게 원을 그리는 예제
public class RunnableFrameEx02 extends MFrame implements Runnable{
	
	
	Color c;
	Random r = new Random();
	int x,y;
	
	public RunnableFrameEx02(Color c) {
		super(300,300);
		this.c=c;
	}
	
	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				x=r.nextInt(300);
				y=r.nextInt(300);
				Thread.sleep(500);
				repaint();
			}
		} catch (Exception e) {
	}
}
	@Override
	public void paint(Graphics g) {
		g.setColor(c);
		g.fillOval(x, y, 10, 10);
	}
	
	@Override
	public void update(Graphics g) {
		g.clipRect(x, y, 10, 10);
		paint(g);
	}	

	
	public static void main(String[] args) {
		RunnableFrameEx02 r1 = new RunnableFrameEx02(Color.pink);
		RunnableFrameEx02 r2 = new RunnableFrameEx02(Color.black);
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		
		
}

	
}
