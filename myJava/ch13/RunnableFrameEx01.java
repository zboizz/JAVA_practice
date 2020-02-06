package ch13;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import ch12.MFrame;
//Thread ��ɾ��� �� ���� â�� �����ϰ� ���� �׸��� ����
public class RunnableFrameEx01 extends MFrame{
	
	
	Color c;
	Random r = new Random();
	int x,y;
	
	public RunnableFrameEx01(Color c) {
		super(300,300);
		this.c=c;
	}
	
	
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
		//public abstract void clipRect(int x, int y, int width, int height);
		//������ �ִ� �� + ���Ӱ� ������Ʈ�� �� ��
		//���ҽÿ� ���Ӱ� ��Ÿ���� �͸� ����
		paint(g);
	}
	
	
	public void start() {
		run();
	}	
	
	public static void main(String[] args) {
		RunnableFrameEx01 r1 = new RunnableFrameEx01(Color.red);
		RunnableFrameEx01 r2 = new RunnableFrameEx01(Color.blue);
		
		r1.start();
		r2.start();
}

	
}
