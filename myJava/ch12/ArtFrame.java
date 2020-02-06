package ch12;

import java.awt.Graphics;
import java.util.Random;

public class ArtFrame extends MFrame {
	
	Random r = new Random();
	int x,y,w,h;
		
	public ArtFrame() {
		super(600,600);
		run();
	}
		
	
	
	private void run() {
		for (int i = 0; i < 100000; i++) {
			x = r.nextInt(600);
			y = r.nextInt(600);
			w = r.nextInt(20)+1; //1~20
			h = r.nextInt(20)+1;
			
			try {
				Thread.sleep(1);
			} catch (Exception e) {}
			
			repaint();
		}
	}
	
	@Override
	public void update(Graphics g) {
		g.clipRect(x, y, w+1, h+1);
		paint(g);
	}
	
	
	@Override
	public void paint(Graphics g) {
		g.setColor(MColor.rColor());
		g.drawRect(x,y,w,h);
		g.fillRect(x, y, w, h);
		
	}


	public static void main(String[] args) {
	new ArtFrame();	
	}
}
