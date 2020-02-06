package ch0501;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyWindows extends WindowAdapter{
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("�����մϴ�");
		System.exit(0);
 }
}

class YFrame extends Frame{
	public YFrame() {
		setBounds(200,200,300,300);
		setBackground(Color.RED);
		setVisible(true);
		//�͸�Ŭ������ ������� �ʰ� ���� ��� �߰�
		addWindowListener(new MyWindows()); 
		}
}
//�������� ���� Ŭ������ �ƴ� �ٸ� �ܺ� Ŭ������ ������
class WFrame extends Frame{
	public WFrame() {
		setBounds(200,200,300,300);
		setBackground(Color.BLUE);
		setVisible(true);
		//�͸�Ŭ������ ������� �ʰ� ���� ��� �߰�
		addWindowListener(new MyWindows()); 
		}
}



public class AnonymousEx04 {
	public static void main(String[] args) {
		new YFrame();
		new WFrame();
	}
}
