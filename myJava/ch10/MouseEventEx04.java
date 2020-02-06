package ch10;

import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class MouseEventEx04 extends MFrame{

	public MouseEventEx04() {
		setTitle("MouseEvent 예제4");
		//익명 클래스와 Adapter 개념을 가지고 구현
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e){
			setBackground(MColor.rColor());
		}
		});
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e){
			setBackground(MColor.rColor());
		}
		});		
		
		MyMouseEvent mm = new MyMouseEvent(this);
		addMouseListener(mm);
	}
		
	
public static void main(String[] args) {
	new MouseEventEx04();
}
	

}
