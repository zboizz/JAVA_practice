package ch12;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ImageViewEx02 extends MFrame implements 
ActionListener{
	
	Image img[] = new Image[3];
	Button btn[] = new Button[4];
	String str[] = {"ù��°","�ι�°","����°","����"};
	Random r = new Random();
	int idx=0;
	
	public ImageViewEx02() {
		super(550,300);
		Panel p = new Panel();
		p.setLayout(new GridLayout(4,1));
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button(str[i]);
			btn[i].addActionListener(this);
			p.add(btn[i]);
		}
		//�̹����� �޸𸮷� �����´�.
		for (int i = 0; i < img.length; i++) {
			img[i] = Toolkit.getDefaultToolkit().getImage("ch12/aaa"+i+".PNG");
		}		
		
		add(p,BorderLayout.EAST);
		validate();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==btn[0]) idx = 0;
		else if(obj==btn[1]) idx = 1;
		else if(obj==btn[2]) idx = 2;
		else if(obj==btn[3]) idx = r.nextInt(3); //������ �������� ���;���, 0~2������ ����
		repaint(); //paint �޼ҵ� ȣ��
	}
	@Override
	public void paint(Graphics g) {
		//System.out.println(idx);
		setTitle("aaa"+idx+"PNG");
		g.drawImage(img[idx],0,0,this); 
	}
	
	public static void main(String[] args) {
		new ImageViewEx02();
	}
}