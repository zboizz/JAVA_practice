package ch17;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageIconEx01 extends JFrame implements ActionListener {

	JPanel p;
	JLabel label;
	ImageIcon icon;
	JButton btn;
	
	
	public ImageIconEx01() {
		setTitle("ImageIcon 예제1");
		setSize(300,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		p=new JPanel();
		p.add(label=new JLabel("이미지를 보려면 아래 버튼을 누르세요"));
		p.add(btn=new JButton("이미지 레이블"));
		
		icon = new ImageIcon("ch17/icon.gif");
		btn.setIcon(icon);
		btn.addActionListener(this);
		
		add(p);		
		
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		icon = new ImageIcon("ch17/dog.gif");
		label.setIcon(icon);
		label.setText(null);
	}
	
	
	
	
	public static void main(String[] args) {
		new ImageIconEx01();
	}
}
