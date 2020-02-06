package ch10;

import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//MouseAdapter는 MouseListener를 구현한 추상클래스이다.
//그렇기 때문에 MyMouseEvent에서는 필요한 메소드만 오버라이딩하면 된다.

class MyMouseEvent extends MouseAdapter{
	
	Frame f;	
	
	public MyMouseEvent(Frame f) {
		this.f = f;
	}
	
	
	
	@Override
	public void mouseEntered(MouseEvent e) {
		f. setBackground(MColor.rColor());
	}
	@Override
	public void mouseExited(MouseEvent e) {
		f. setBackground(MColor.rColor());
	}
}//------------classMouseEvent


public class MouseEventEx03 extends MFrame{

	public MouseEventEx03() {
		setTitle("MouseEvent 예제3");
		
		
		MyMouseEvent mm = new MyMouseEvent(this);
		addMouseListener(mm);
	}
		
	
public static void main(String[] args) {
	new MouseEventEx03();
}
	

}
