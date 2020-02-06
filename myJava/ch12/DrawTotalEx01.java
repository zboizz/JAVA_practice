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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Random;

public class DrawTotalEx01 extends MFrame 
implements ActionListener, ItemListener {

    Panel p1;
    TextField trgb[];
    Checkbox fcb;
    Checkbox rcb;//��������
    Random r = new Random();
    Checkbox scb1, scb2, scb3, scb4, scb5;
    CheckboxGroup scbg;
    Button b;
    MCanvas canvas;
    // Line
    TextField tx1_1, ty1_1, tx2_1, ty2_1;
    // Rect
    TextField tx_2, ty_2, tw_2, th_2;
    // Oval
    TextField tx_3, ty_3, tw_3, th_3;
    // Arc
    TextField tx_4, ty_4, tw_4, th_4, tsa_4, tra_4;
    // RoundRect
    TextField tx_5, ty_5, tw_5, th_5, tcw_5, tch_5;

    public DrawTotalEx01() {
        p1 = new Panel();
        p1.setBackground(Color.YELLOW);
        add(p1, BorderLayout.NORTH);
        canvas = new MCanvas();
        add(canvas, BorderLayout.CENTER);
        Panel p2 = new Panel();
        p2.setBackground(Color.GREEN);
        trgb = new TextField[3];
        trgb[0] = new TextField("10", 3);
        trgb[1] = new TextField("100", 3);
        trgb[2] = new TextField("200", 3);
        ////////////////////////////////////////////////////////////////////////////
        rcb = new Checkbox("����");
        rcb.addItemListener(this);
        p2.add(rcb);
        /////////////////////////////////////////////////////////////////////////////
        Label l = new Label("R");
        p2.add(l);
        p2.add(trgb[0]);
        l = new Label("G");
        p2.add(l);
        p2.add(trgb[1]);
        l = new Label("B");
        p2.add(l);
        p2.add(trgb[2]);
        add(p2, BorderLayout.SOUTH);
        Panel p3 = new Panel();
        p3.setBackground(Color.LIGHT_GRAY);
        p3.setLayout(new GridLayout(5, 1));
        scbg = new CheckboxGroup();
        scb1 = new Checkbox("����", scbg, true);
        scb2 = new Checkbox("�簢��", scbg, false);
        scb3 = new Checkbox("Ÿ��", scbg, false);
        scb4 = new Checkbox("��ä��", scbg, false);
        scb5 = new Checkbox("�ձٻ簢��", scbg, false);
        fcb = new Checkbox("ä���");
        scb1.addItemListener(this);
        scb2.addItemListener(this);
        scb3.addItemListener(this);
        scb4.addItemListener(this);
        scb5.addItemListener(this);
        p3.add(scb1);
        p3.add(scb2);
        p3.add(scb3);
        p3.add(scb4);
        p3.add(scb5);
        add(p3, BorderLayout.EAST);
        setAWT();
        setSize(800, 300);
    }

    public void actionPerformed(ActionEvent e) {
        canvas.repaint();
    }

    public void itemStateChanged(ItemEvent e) {
    	if(e.getSource()==rcb){
    		if(rcb.getState()){//trgb ��Ȱ��ȭ
    			for (int i = 0; i < trgb.length; i++) {
					trgb[i].setEnabled(false);
				}
    		}else{//trgb Ȱ��ȭ
    			for (int i = 0; i < trgb.length; i++) {
					trgb[i].setEnabled(true);
				}
    		}
    		return;//�żҵ� ���� �Ϸ�
    	}
    	setAWT();
    	p1.validate();
    }

    public static void main(String[] args) {
       new DrawTotalEx01();
    }

    class MCanvas extends Canvas {
        public void paint(Graphics g) {
           int rgb[] = new int[3];
           for (int i = 0; i < rgb.length; i++) {
        	   		if(rcb.getState()){//rcb�� üũ�̸�...
        	   			rgb[i] = r.nextInt(256);
        	   		}else{
        	   			rgb[i] = Integer.parseInt(trgb[i].getText());
        	   		}
           }
           g.setColor(new Color(rgb[0],rgb[1],rgb[2]));
           Checkbox cb = scbg.getSelectedCheckbox();
           if(cb==scb1) dLine(g);
           else if(cb==scb2) dRect(g);
           else if(cb==scb3) dOval(g);
           else if(cb==scb4) dArc(g);
           else if(cb==scb5) dRoundRec(g);
        }
        public void dLine(Graphics g) {
            int x1, y1, x2, y2;
            x1 = Integer.parseInt(tx1_1.getText());
            y1 = Integer.parseInt(ty1_1.getText());
            x2 = Integer.parseInt(tx2_1.getText());
            y2 = Integer.parseInt(ty2_1.getText());
            g.drawLine(x1, y1, x2, y2);
        }

        public void dRect(Graphics g) {
            int x, y, w, h;
            x = Integer.parseInt(tx_2.getText());
            y = Integer.parseInt(ty_2.getText());
            w = Integer.parseInt(tw_2.getText());
            h = Integer.parseInt(th_2.getText());
            if (fcb.getState())
                g.fillRect(x, y, w, h);
            else
                g.drawRect(x, y, w, h);
        }

        public void dOval(Graphics g) {
            int x, y, w, h;
            x = Integer.parseInt(tx_3.getText());
            y = Integer.parseInt(ty_3.getText());
            w = Integer.parseInt(tw_3.getText());
            h = Integer.parseInt(th_3.getText());
            if (fcb.getState())
                g.fillOval(x, y, w, h);
            else
                g.drawOval(x, y, w, h);
        }

        public void dArc(Graphics g) {
            int x, y, w, h, s, r;
            x = Integer.parseInt(tx_4.getText());
            y = Integer.parseInt(ty_4.getText());
            w = Integer.parseInt(tw_4.getText());
            h = Integer.parseInt(th_4.getText());
            s = Integer.parseInt(tsa_4.getText());
            r = Integer.parseInt(tra_4.getText());
            if (fcb.getState())
                g.fillArc(x, y, w, h, s, r);
            else
                g.drawArc(x, y, w, h, s, r);
        }

        public void dRoundRec(Graphics g) {
            int x, y, w, h, cw, ch;
            x = Integer.parseInt(tx_5.getText());
            y = Integer.parseInt(ty_5.getText());
            w = Integer.parseInt(tw_5.getText());
            h = Integer.parseInt(th_5.getText());
            cw = Integer.parseInt(tcw_5.getText());
            ch = Integer.parseInt(tch_5.getText());
            if (fcb.getState())
                g.fillRoundRect(x, y, w, h, cw, ch);
            else
                g.drawRoundRect(x, y, w, h, cw, ch);
        }
    }

    public void setAWT() {
        p1.removeAll();
        Checkbox cb = scbg.getSelectedCheckbox();
        if (cb == scb1) {
            setTitle("���� �׸���");
            tx1_1 = new TextField("0", 3);
            ty1_1 = new TextField("0", 3);
            tx2_1 = new TextField("0", 3);
            ty2_1 = new TextField("0", 3);
            Label l = new Label("x1");
            p1.add(l);
            p1.add(tx1_1);
            l = new Label("y1");
            p1.add(l);
            p1.add(ty1_1);
            l = new Label("x2");
            p1.add(l);
            p1.add(tx2_1);
            l = new Label("y2");
            p1.add(l);
            p1.add(ty2_1);
            b = new Button("�׸���");
            b.addActionListener(this);
            p1.add(b);
        } else if (cb == scb2) {
            setTitle("�簢�� �׸���");
            tx_2 = new TextField("0", 3);
            ty_2 = new TextField("0", 3);
            tw_2 = new TextField("0", 3);
            th_2 = new TextField("0", 3);
            Label l = new Label("x");
            p1.add(l);
            p1.add(tx_2);
            l = new Label("y");
            p1.add(l);
            p1.add(ty_2);
            l = new Label("�ʺ�");
            p1.add(l);
            p1.add(tw_2);
            l = new Label("����");
            p1.add(l);
            p1.add(th_2);
            fcb = new Checkbox("ä���");
            p1.add(fcb);
            b = new Button("�׸���");
            b.addActionListener(this);
            p1.add(b);
        } else if (cb == scb3) {
            setTitle("Ÿ�� �׸���");
            tx_3 = new TextField("0", 3);
            ty_3 = new TextField("0", 3);
            tw_3 = new TextField("0", 3);
            th_3 = new TextField("0", 3);
            Label l = new Label("x");
            p1.add(l);
            p1.add(tx_3);
            l = new Label("y");
            p1.add(l);
            p1.add(ty_3);
            l = new Label("�ʺ�");
            p1.add(l);
            p1.add(tw_3);
            l = new Label("����");
            p1.add(l);
            p1.add(th_3);
            fcb = new Checkbox("ä���");
            p1.add(fcb);
            b = new Button("�׸���");
            b.addActionListener(this);
            p1.add(b);
        } else if (cb == scb4) {
            setTitle("��ä�� �׸���");
            tx_4 = new TextField("0", 3);
            ty_4 = new TextField("0", 3);
            tw_4 = new TextField("0", 3);
            th_4 = new TextField("0", 3);
            tsa_4 = new TextField("0", 3);
            tra_4 = new TextField("0", 3);
            Label l = new Label("x");
            p1.add(l);
            p1.add(tx_4);
            l = new Label("y");
            p1.add(l);
            p1.add(ty_4);
            l = new Label("�ʺ�");
            p1.add(l);
            p1.add(tw_4);
            l = new Label("����");
            p1.add(l);
            p1.add(th_4);
            l = new Label("���۰���");
            p1.add(l);
            p1.add(tsa_4);
            l = new Label("ȸ������");
            p1.add(l);
            p1.add(tra_4);
            fcb = new Checkbox("ä���");
            p1.add(fcb);
            b = new Button("�׸���");
            b.addActionListener(this);
            p1.add(b);
        } else if (cb == scb5) {
            setTitle("�ձٻ簢�� �׸���");
            tx_5 = new TextField("0", 3);
            ty_5 = new TextField("0", 3);
            tw_5 = new TextField("0", 3);
            th_5 = new TextField("0", 3);
            tcw_5 = new TextField("0", 3);
            tch_5 = new TextField("0", 3);
            Label l = new Label("x");
            p1.add(l);
            p1.add(tx_5);
            l = new Label("y");
            p1.add(l);
            p1.add(ty_5);
            l = new Label("�ʺ�");
            p1.add(l);
            p1.add(tw_5);
            l = new Label("����");
            p1.add(l);
            p1.add(th_5);
            l = new Label("�ڳʳʺ�");
            p1.add(l);
            p1.add(tcw_5);
            l = new Label("�ڳʳ���");
            p1.add(l);
            p1.add(tch_5);
            fcb = new Checkbox("ä���");
            p1.add(fcb);
            b = new Button("�׸���");
            b.addActionListener(this);
            p1.add(b);
        }
    }
}
