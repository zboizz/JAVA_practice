package Schedule;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainWindow extends JFrame {
	
	public MainWindow() {
	setTitle("버튼으로 띄우는 새로운 창");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	JPanel MainContainer = new JPanel();
	setContentPane(MainContainer);
	
	JButton OpenWindow = new JButton("새 창 띄우기");
	
	OpenWindow.addActionListener(new ActionListener() {
		//만들어진 버튼 "새 창 띄우기"에 버튼이 눌어지면 발생하는 행동을 정의
		@Override
		public void actionPerformed(ActionEvent e) {
			new newWindow(); //클래스 newWindow를 새로 만들어낸다.
			
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
		setTitle("새로 띄운 창");
		//주의: setDefaultCloseOperation() 정의를 하지 말아야 한다.
		//정의하게 되면 새 창을 닫으면 모든 창과 프로그램이 동시에 꺼진다.
		
		JPanel newWindowContainer = new JPanel();
		setContentPane(newWindowContainer);
		
		JLabel newLabel = new JLabel("새창을 띄우는데 성공");
		
		newWindowContainer.add(newLabel);
		
		setBounds(100,100,300,100);
		setResizable(false);
		setVisible(true);
	}
}
