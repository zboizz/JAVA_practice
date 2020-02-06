package ch12;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawAllEx0101 extends MFrame 
implements ActionListener {

	Panel p1,p2;
	int mode=1/*0-선,1-사각형,2-원*/,color;
	Label l[];
	Checkbox fillcb;
	Checkbox rcb, gcb, bcb;
	CheckboxGroup cbg;
	TextField tf[];
	Button b1, b2, b3;
	Button btn;
	MCanvas canvas;
	String ll[] = {"X1","Y1","X2","Y2 "}; //선그리기
	String rl[] = {"X","Y","W","H "};     //사각형
	String ol[] = {"X","Y","너비","높이"};//원그리기
	
	public DrawAllEx0101() {
		super(600,300);
		setTitle("선그리기");
		makeAWT();
		p1 = new Panel();
		p1.setLayout(new GridLayout(3,1));
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		add(p1,BorderLayout.EAST);
		p2.setBackground(Color.yellow);
		for (int i = 0; i < l.length; i++) {
			p2.add(l[i]);
			p2.add(tf[i]);
		}
		p2.add(rcb);
		p2.add(gcb);
		p2.add(bcb);
		p2.add(btn);
		selectPanel(mode);
		add(p2,BorderLayout.SOUTH);
		add(canvas = new MCanvas());
		validate();
	}
	
	public void setLabelBoxPaint(Label [] label, String [] labelName, Color color) {
		p2.setBackground(color);
		rcb.setBackground(color);
		gcb.setBackground(color);
		bcb.setBackground(color);
		for(int i=0; i<l.length;i++) {
			label[i].setText(labelName[i]); 
			label[i].setBackground(color);
			}
	}
	
	public void selectPanel(int mode) {
		Color LabelBoxColor;
		switch(mode) {
		case 0:
			setTitle("선 그리기");
			LabelBoxColor = Color.YELLOW;
			setLabelBoxPaint(l, ll, LabelBoxColor);
			break;
		case 1:
			setTitle("사각형 그리기");
			LabelBoxColor = Color.PINK;
				setLabelBoxPaint(l, rl, LabelBoxColor);
			
			break;
		case 2:
			setTitle("원 그리기");
			LabelBoxColor = Color.GREEN;
				setLabelBoxPaint(l, ol, LabelBoxColor);
			break;
		}
		
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e. getSource();
		if(obj==b1) { 			//선 버튼
			mode=0;
			selectPanel(mode);
		}else if(obj==b2) {		//사각 버튼
			mode=1;
			selectPanel(mode);
		}else if(obj==b3) {		//원 버튼
			mode=2;
			selectPanel(mode);
		}else if(obj==btn) {	//그리기 버튼
			
		}
	}

	
	public void makeAWT(){
		p1 = new Panel();
		p2 = new Panel();
		l = new Label[4];
		for (int i = 0; i < l.length; i++) {
			l[i] = new Label();
		}
		b1 = new Button("선");
		b2 = new Button("사각형");
		b3 = new Button("원");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		tf = new TextField[4];
		for (int i = 0; i < tf.length; i++) {
			tf[i] = new TextField("30",3);
		}
		fillcb = new Checkbox("채우기");
		cbg = new CheckboxGroup();
		rcb = new Checkbox("R",cbg,true);
		gcb = new Checkbox("G",cbg,false);
		bcb = new Checkbox("B",cbg,false);
		btn = new  Button("그리기");
		btn.addActionListener(this);
	}
	
	class MCanvas extends Canvas{
		@Override
		public void paint(Graphics g) {
			//color 선택
			
			//선그리기, 사각형그리기, 원그리기, 채우기 체크
		}
	}

	public static void main(String[] args) {
		new DrawAllEx0101();
	}
}