package ch12;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class DrawRectEx0201 extends MFrame 
implements ActionListener, ItemListener{

	
	TextField tx,ty,tw,th;
	TextField tr,tg,tb;
	Checkbox chk;
	Checkbox rChk;
	Button btn;
	MCanvas canvas;
	
	public DrawRectEx0201() {
		super(500,300);
		setTitle("DrawRectEx02");
		Panel p1, p2;
        p1 = new  Panel();
        p1.setBackground(Color.CYAN);
        tx = new TextField("10",3);
        ty = new TextField("10",3);
        tw = new TextField("200",3);
        th = new TextField("100",3);
        Label l  = new Label("x");
        p1.add(l);
        p1.add(tx);
        l  = new Label("y");
        p1.add(l);
        p1.add(ty);
        l  = new Label("너비");
        p1.add(l);
        p1.add(tw);
        l  = new Label("높이");
        p1.add(l);
        p1.add(th);
        chk = new Checkbox("채우기");
        p1.add(chk);
        btn = new Button("그리기");
        btn.addActionListener(this);
        p1.add(btn);
        add(p1,BorderLayout.NORTH);
        canvas = new MCanvas();
        add(canvas, BorderLayout.CENTER);
        p2 = new Panel();
        p2.setBackground(Color.MAGENTA);
        tr = new TextField("100",3);
        tg = new TextField("100",3);
        tb = new TextField("100",3);
         l  =new Label("R");
         p2.add(l);
         p2.add(tr);
         l  =new Label("G");
         p2.add(l);
         p2.add(tg);
         l  =new Label("B");
         p2.add(l);
         p2.add(tb);
         p2.add(rChk = new Checkbox("랜덤"));
         rChk.addItemListener(this);
         add(p2,BorderLayout.SOUTH);
         validate();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		canvas.repaint();
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(rChk.getState()) { //체크를 했을때
			tr.setEnabled(false);
			tg.setEnabled(false);
			tb.setEnabled(false);
		}else {
			tr.setEnabled(true);
			tg.setEnabled(true);
			tb.setEnabled(true);
		}
	}
	class MCanvas extends Canvas{
		@Override
		public void paint(Graphics g) {
			int x,y,w,h;
			int rr,gg,bb;
			x = Integer.parseInt(tx.getText());
			y = Integer.parseInt(ty.getText());
			w = Integer.parseInt(tw.getText());
			h = Integer.parseInt(th.getText());
			
			
			if(rChk.getState()) {
				g.setColor(MColor.rColor());
			}else {
				rr = Integer.parseInt(tr.getText());
				gg = Integer.parseInt(tg.getText());
				bb = Integer.parseInt(tb.getText());
				g.setColor(new Color(rr, gg, bb));
			}		
			if(chk.getState())
				g.fillRect(x, y, w, h);
			else 
				g.drawRect(x, y, w, h);//채우기가 없는 사각형
		}//paint
	}//class MCanvas02 
	
	public static void main(String[] args) {
		new DrawRectEx02();
	}
}
