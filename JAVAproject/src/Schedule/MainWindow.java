package Schedule;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainWindow extends JFrame {
	
	public MainWindow() {
	setTitle("��ư���� ���� ���ο� â");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	JPanel MainContainer = new JPanel();
	setContentPane(MainContainer);
	
	JButton OpenWindow = new JButton("�� â ����");
	
	OpenWindow.addActionListener(new ActionListener() {
		//������� ��ư "�� â ����"�� ��ư�� �������� �߻��ϴ� �ൿ�� ����
		@Override
		public void actionPerformed(ActionEvent e) {
			new newWindow(); //Ŭ���� newWindow�� ���� ������.
			
		}
	});
	MainContainer.add(OpenWindow);
	setSize(300,100);
	setResizable(false);
	setVisible(true);
	
	}
	
	public static void main(String[] args) {
	new MainWindow();	
	}
}

class newWindow extends JFrame{
	newWindow(){
		setTitle("���� ��� â");
		//����: setDefaultCloseOperation() ���Ǹ� ���� ���ƾ� �Ѵ�.
		//�����ϰ� �Ǹ� �� â�� ������ ��� â�� ���α׷��� ���ÿ� ������.
		
		JPanel newWindowContainer = new JPanel();
		setContentPane(newWindowContainer);
		
		JLabel newLabel = new JLabel("��â�� ���µ� ����");
		
		newWindowContainer.add(newLabel);
		
		setBounds(100,100,300,100);
		setResizable(false);
		setVisible(true);
	}
}
