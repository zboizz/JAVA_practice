package ch12;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageViewEx03 extends MFrame implements ActionListener {

	Image img;
	Button btn[] = new Button[6];
	String str[] = {"정상그림","일부그림","축소그림","좌우뒤집기"
			,"상하뒤집기","전부뒤집기"};
	int idx;
	
	static final int SHOW_NORM = 0;//정상그림
	static final int SHOW_PART = 1;//일부그림
	static final int SHOW_SCALE = 2;//축소그림
	static final int SHOW_HORIZONTAL = 3;//좌우뒤집기
	static final int SHOW_VERTICAL = 4;//상하뒤집기
	static final int SHOW_ALL = 5;//전부뒤집기
	String name;
	
	public ImageViewEx03(String name) {
		super(600,400);
		setTitle("Image 예제3");
		this.name = name;
		img = Toolkit.getDefaultToolkit().
				getImage("ch12/"+name);
		Panel p = new Panel();
		for (int i = 0; i < btn.length; i++) {
			p.add(btn[i]=new Button(str[i]));
			btn[i].addActionListener(this);
		}
		add(p,BorderLayout.SOUTH);
		idx = SHOW_NORM;
		validate();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		for (int i = 0; i < btn.length; i++) {
			if(obj==btn[i]) {
				idx = i;
				break; //더이상 뒤에 있는 버튼은 필요없기에 break
			}
		}
		repaint();
	}
	@Override
	public void paint(Graphics g) {
		//g.drawImage(img, 0, 0, this);
		//System.out.println(idx); //버튼을 누를때마다, 버튼이 가진 idx값이 출력
		setTitle(name + "-" + str[idx]);
		
		int iw = img.getWidth(this); //이미지 너비
		int ih = img.getHeight(this); //이미지 높이
		//System.out.println(iw + ":"+ ih); //503x336 너비와 높이를 알아냄
		
		switch(idx) {
		case SHOW_NORM:
			g.drawImage(img,0,0,iw,ih, //컨테이너 좌표
					0,0,iw,ih,this);		//이미지 좌표
			break;			
		case SHOW_PART:
			g.drawImage(img,100,100,300,300, 
					220,20,420,220,this);
			break;
		case SHOW_SCALE:
			g.drawImage(img,0,0,iw/2,ih/2, 
					0,0,iw,ih,this);
			break;
		case SHOW_HORIZONTAL:
			g.drawImage(img,iw,0,0,ih, 
					0,0,iw,ih,this);
			break;
		case SHOW_VERTICAL:
			g.drawImage(img,0,ih,iw,0, 
					0,0,iw,ih,this);
			break;
		case SHOW_ALL:
			g.drawImage(img,iw,ih,0,0, 
					0,0,iw,ih,this);
			break;
		}
	}

	public static void main(String[] args) {
		new ImageViewEx03("aaa.jpg");
	}
}











