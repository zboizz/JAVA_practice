package ch0501;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class MFrame extends Frame{
	public MFrame() {
	
		setBounds(100, 100, 300, 300);
		setVisible(true);
		//���� ����� �͸�Ŭ���� ������� �߰�
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("�����մϴ�");
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
