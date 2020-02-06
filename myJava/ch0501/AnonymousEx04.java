package ch0501;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyWindows extends WindowAdapter{
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("종료합니다");
		System.exit(0);
 }
}

class YFrame extends Frame{
	public YFrame() {
		setBounds(200,200,300,300);
		setBackground(Color.RED);
		setVisible(true);
		//익명클래스를 사용하지 않고 종료 기능 추가
		addWindowListener(new MyWindows()); 
		}
}
//종료기능을 같은 클래스가 아닌 다른 외부 클래스에 만들어보자
class WFrame extends Frame{
	public WFrame() {
		setBounds(200,200,300,300);
		setBackground(Color.BLUE);
		setVisible(true);
		//익명클래스를 사용하지 않고 종료 기능 추가
		addWindowListener(new MyWindows()); 
		}
}



public class AnonymousEx04 {
	public static void main(String[] args) {
		new YFrame();
		new WFrame();
	}
}
