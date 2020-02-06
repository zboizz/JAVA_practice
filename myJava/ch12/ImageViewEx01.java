package ch12;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;

public class ImageViewEx01 extends MFrame{

	Image img;
	
	public ImageViewEx01() {
		super(450, 650);
		img = Toolkit.getDefaultToolkit().
				getImage("ch12/img1.jpg");
	}

	@Override
	public void paint(Graphics g) {
		//this: ImageObserver -> �̹����� �޸𸮿� �ε��ɶ����� ���� ���� ����
		g.drawImage(img, 0, 0, this);
		//drawImage(Image img, int x, int y, ImageObserver observer);
	}	
	
	public static void main(String[] args) {
		new ImageViewEx01();
	}
}
