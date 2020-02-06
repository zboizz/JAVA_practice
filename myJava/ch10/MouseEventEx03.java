package ch10;

import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//MouseAdapter�� MouseListener�� ������ �߻�Ŭ�����̴�.
//�׷��� ������ MyMouseEvent������ �ʿ��� �޼ҵ常 �������̵��ϸ� �ȴ�.

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
		setTitle("MouseEvent ����3");
		
		
		MyMouseEvent mm = new MyMouseEvent(this);
		addMouseListener(mm);
	}
		
	
public static void main(String[] args) {
	new MouseEventEx03();
}
	

}
