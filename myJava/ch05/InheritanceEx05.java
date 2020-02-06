package ch05;

import java.util.Random;

public class InheritanceEx05 {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		for (int i = 0; i < 200; i++) {
			int w = r.nextInt(200)+100;
			int h = r.nextInt(200)+100;
			int x = r.nextInt(1200)+100;
			int y = r.nextInt(1200)+100;
			new MFrame(w, h, x, y, MColor.rColor());
		}
		
		
		
		//MFrame f =
		//		new MFrame(300,300,Color.ORANGE,false)
	}

}
