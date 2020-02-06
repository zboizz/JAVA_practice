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

public class DrawRectEx01 extends MFrame 
implements ActionListener{

	
	TextField tx,ty,tw,th;
	TextField tr,tg,tb;
	Checkbox chk;
	Button btn;
	MCanvas02 canvas;
	
	public DrawRectEx01() {
		super(500,300);
		setTitle("DrawRectEx01");
		Panel p1, p2;
        p1 = new  Panel();
        p1.setBackground(Color.PINK);
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
       
        canvas = new MCanvas02();
        add(canvas, BorderLayout.CENTER);
        p2 = new Panel();
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
         p2.setBackground(Color.GREEN);
         add(p2,BorderLayout.SOUTH);
         validate();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		canvas.repaint();
	}
	
	class MCanvas02 extends Canvas{
		@Override
		public void paint(Graphics g) {
			int x, y, w, h;
			int rPaint, gPaint, bPaint;
			x = Integer.parseInt(tx.getText()); //실행창의 x값을 불러옴
			y = Integer.parseInt(ty.getText());
			w = Integer.parseInt(tw.getText());
			h = Integer.parseInt(th.getText());
			rPaint = Integer.parseInt(tr.getText());
			gPaint = Integer.parseInt(tg.getText());
			bPaint = Integer.parseInt(tb.getText());
			
			g.setColor(new Color(rPaint, gPaint, bPaint));
			
			if(chk.getState()) {
				g.fillRect(x, y, w, h);			
			}else {
				g.drawRect(x, y, w, h);
			}
				
			
		}//paint
	}//class MCanvas02 
	
	public static void main(String[] args) {
		new DrawRectEx01();
	}
}
