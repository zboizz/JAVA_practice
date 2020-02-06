package ch13;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import ch12.MFrame;

public class DukeThread extends MFrame implements Runnable {

	String fname[] = new String[10];
	Image img[] = new Image[10];
	
	int idx = -1, x, a, b;

	public DukeThread(int a,int b) {
		this.a = a;
		this.b = b;
		for (int i = 0; i < fname.length; i++) {
			fname[i] = "ch13/duke"+(i+1)+".gif";
			img[i]=Toolkit.getDefaultToolkit().createImage(fname[i]);
		}
		//Runnable r = new Runnable();
		//Thread t = new Thread(r);
		//t.start();
		new Thread(this).start();
	}
	
		//int idx = -1, x;
	@Override
	public void run() {
	 try {
		 while(true) {
			 idx++;
			 if(idx==img.length)
				 idx=0;
			 Thread.sleep(200);
			 repaint();
		 }
	} catch (Exception e) {}
}
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(img[idx], a, 30, this);
		g.drawImage(img[idx], b, 80, this);
	}
	
	
	public static void main(String[] args) {
		DukeThread d1 = new DukeThread(30, 100);
	}
}

