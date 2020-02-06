package ch09;

import java.awt.Canvas;

//Canvas는 도화지
//

public class CanvasEx01 extends MFrame {

	Canvas c;
	
	
	public CanvasEx01() {
		c = new Canvas();
		c.setSize(100,100);
		c.setBackground(MColor.rColor());
		add(c);
	}
	
	
	
	public static void main(String[] args) {
		new CanvasEx01();
	}
}
