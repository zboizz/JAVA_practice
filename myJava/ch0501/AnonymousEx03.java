package ch0501;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class MFrame extends Frame{
	public MFrame() {
	
		setBounds(100, 100, 300, 300);
		setVisible(true);
		//종료 기능을 익명클래스 방식으로 추가
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("종료합니다");
				System.exit(0);
			}
		});
	}	
}




public class AnonymousEx03 {
	public static void main(String[] args) {
		new MFrame();
	}
}
