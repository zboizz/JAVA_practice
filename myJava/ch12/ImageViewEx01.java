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
		//this: ImageObserver -> 이미지가 메모리에 로딩될때까지 관리 관찰 역할
		g.drawImage(img, 0, 0, this);
		//drawImage(Image img, int x, int y, ImageObserver observer);
	}	
	
	public static void main(String[] args) {
		new ImageViewEx01();
	}
}
