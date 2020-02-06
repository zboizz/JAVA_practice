package ch10;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventEx02 extends MFrame implements MouseListener {

	public MouseEventEx02() {
		setTitle("MouseEvent ¿¹Á¦2");
		addMouseListener(this);
	}
	
	
	@Override
	public void mouseEntered(MouseEvent e) {
		setBackground(MColor.rColor());
	}
	@Override
	public void mouseExited(MouseEvent e) {
		setBackground(MColor.rColor());
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {setBackground(MColor.rColor());}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	
public static void main(String[] args) {
	new MouseEventEx02();
}
	

}
