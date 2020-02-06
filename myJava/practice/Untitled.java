package practice;

import java.awt.*;
import java.awt.event.*;

import javax.swing.UIManager;

public class Untitled extends Frame implements MouseListener, KeyListener
{

 double Hsum = 0; // 학점 총합

 double Dsum = 0; // 나눌학점 총합

 Choice ch1;

 Panel p1 = new Panel();

 Panel p2 = new Panel(new GridLayout(3, 2));

 Panel p3 = new Panel();

 Panel p4 = new Panel();

 Panel p5 = new Panel();

 Panel p6 = new Panel();

 Panel p7 = new Panel();

 Label la1 = new Label("학점계산기");

 Label la2 = new Label("이름");

 Label la3 = new Label("과목명");

 Label la4 = new Label("학번");

 Label la5 = new Label("학년");

 Label la6 = new Label("학기");

 Label la7 = new Label("취득학점");

 Label la8 = new Label("학점");

 Label la9 = new Label("총점");

 Label la10 = new Label("평균평점");

 TextField tf1 = new TextField("", 10);

 TextField tf2 = new TextField("", 10);

 TextField tf3 = new TextField("", 10);

 CheckboxGroup group = new CheckboxGroup();

 Checkbox cb1 = new Checkbox("1학년", group, true);

 Checkbox cb2 = new Checkbox("2학년", group, false);

 Checkbox cb3 = new Checkbox("3학년", group, false);

 Checkbox cb4 = new Checkbox("4학년", group, false);

 CheckboxGroup cbg = new CheckboxGroup();

 Checkbox cb6 = new Checkbox("1학기", cbg, true);

 Checkbox cb7 = new Checkbox("2학기", cbg, false);

 Choice ch = new Choice();

 Choice ch2 = new Choice();

 TextArea ta = new TextArea(3, 30);

 TextArea ta2 = new TextArea(1, 4);

 TextArea ta3 = new TextArea(1, 4);

 Button b1 = new Button("확인");

 public Untitled () {

  super("마인의 평점계산표");

////////////////////////////////////////////////////////////////////////////////////////////////
//  크기변경 불가
  this.setResizable(false);  
  
  //중앙배치
  this.setLocation(
    ((this.getToolkit().getScreenSize()).width  -  this.getWidth()) /2 ,
    ((this.getToolkit().getScreenSize()).height -  this.getHeight())/ 2);
  
  //윈도우 종료 이벤트 호출
  this.addWindowListener(new WindowAdapter(){
   public void windowClosing(WindowEvent e){
    System.exit(0);
   }
  });
  
  //윈도우 스킨
  try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());}
  catch(Exception e) {  e.printStackTrace();}

////////////////////////////////////////////////////////////////////////////////////////////////  
  
  setLayout(new GridLayout(0, 1));

  p1.add(la1);

  p2.add(la2);
  p2.add(tf1);
  p2.add(la3);
  p2.add(tf2);
  p2.add(la4);
  p2.add(tf3);

  p3.add(la5);
  p3.add(cb1);
  p3.add(cb2);
  p3.add(cb3);
  p3.add(cb4);

  p4.add(la6);
  p4.add(cb6);
  p4.add(cb7);

  ch.add("A+");
  ch.add("A0");
  ch.add("B+");
  ch.add("B0");
  ch.add("C+");
  ch.add("C0");
  ch.add("D+");
  ch.add("D0");
  ch.add("F");
  ch.add("I");

  p5.add(la7);
  p5.add(ch);
  p5.add(la8);
  p5.add(ch2);
  ch2.add("1");
  ch2.add("2");
  ch2.add("3");
  p6.add(ta);
  p6.add(b1);
  p7.add(la9);
  p7.add(ta2);
  p7.add(la10);
  p7.add(ta3);

  add(p1);
  add(p2);
  add(p3);
  add(p4);
  add(p5);
  add(p6);
  add(p7);

  pack();
  setVisible(true);

  // b1.addActionListener(this);
  b1.addMouseListener(this);
  b1.addKeyListener(this);
  tf1.addKeyListener(this);
  tf2.addKeyListener(this);
  tf3.addKeyListener(this);
  tf1.addTextListener(new TextListener() {

   public void textValueChanged ( TextEvent e ) {

    if (tf1.getText().length() > 10) {
     tf1.setText(tf1.getText().substring(0,
         10));
     tf1.setCaretPosition(10);
    }
   }
  });
  tf2.addTextListener(new TextListener() {

   public void textValueChanged ( TextEvent e ) {

    if (tf2.getText().length() > 20) {
     tf2.setText(tf2.getText().substring(0,
         20));
     tf2.setCaretPosition(20);
    }

   }
  });
  tf3.addTextListener(new TextListener() {

   public void textValueChanged ( TextEvent e ) {

    try {
     int i = tf3.getText().charAt(tf3.getText().length() - 1);
     if ((i < 47) || (i > 58)) {
      tf3.setText("");
     }
    }
    catch (Exception ex) {
    }
   }
  });

 }

 public static void main ( String[] args ) {

  Untitled awtex = new Untitled();
 } 

 public void mouseClicked ( MouseEvent e ) {

  double credit = Integer.parseInt(ch2.getSelectedItem());
  double Rcredit;
  Dsum += credit;

  Button b = (Button) e.getSource();
  if (b == b1) {
   
   if(!tf1.getText().equals("") && !tf2.getText().equals("") && !tf3.getText().equals("")){   
   
    ta.append(tf1.getText() + "  " + tf2.getText() + "  "+ tf3.getText() + "  ");
    
    if (cb1.getState()) ta.append(cb1.getLabel() + "  ");
    if (cb2.getState()) ta.append(cb2.getLabel() + "  ");
    if (cb3.getState()) ta.append(cb3.getLabel() + "  ");
    if (cb4.getState()) ta.append(cb4.getLabel() + "  ");
    
    ta.append(cbg.getSelectedCheckbox().getLabel() + "  ");
    ta.append(ch.getSelectedItem() + "  ");
    ta.append(ch2.getSelectedItem() + "\n");
    
    if (ch.getSelectedItem() == "A+") {
     Rcredit = credit * 4.5;
     Hsum += Rcredit;
     String temp = Double.toString(Hsum);
     ta2.setText(temp);
     double result = Hsum / Dsum;
     String temp2 = Double.toString(result);
     ta3.setText(temp2);
    }
    else if (ch.getSelectedItem() == "A0") {
     Rcredit = credit * 4.0;
     Hsum += Rcredit;
     String temp = Double.toString(Hsum);
     ta2.setText(temp);
     double result = Hsum / Dsum;
     String temp2 = Double.toString(result);
     ta3.setText(temp2);
    }
    else if (ch.getSelectedItem() == "B+") {
     Rcredit = credit * 3.5;
     Hsum += Rcredit;
     String temp = Double.toString(Hsum);
     ta2.setText(temp);
     double result = Hsum / Dsum;
     String temp2 = Double.toString(result);
     ta3.setText(temp2);
    }
    else if (ch.getSelectedItem() == "B0") {
     Rcredit = credit * 3.0;
     Hsum += Rcredit;
     String temp = Double.toString(Hsum);
     ta2.setText(temp);
     double result = Hsum / Dsum;
     String temp2 = Double.toString(result);
     ta3.setText(temp2);
    }
 
    else if (ch.getSelectedItem() == "C+") {
     Rcredit = credit * 2.5;
     Hsum += Rcredit;
     String temp = Double.toString(Hsum);
     ta2.setText(temp);
     double result = Hsum / Dsum;
     String temp2 = Double.toString(result);
     ta3.setText(temp2);
    }
 
    else if (ch.getSelectedItem() == "C0") {
     Rcredit = credit * 2.0;
     Hsum += Rcredit;
     String temp = Double.toString(Hsum);
     ta2.setText(temp);
     double result = Hsum / Dsum;
     String temp2 = Double.toString(result);
     ta3.setText(temp2);
    }
 
    else if (ch.getSelectedItem() == "D+") {
     Rcredit = credit * 1.5;
     Hsum += Rcredit;
     String temp = Double.toString(Hsum);
     ta2.setText(temp);
     double result = Hsum / Dsum;
     String temp2 = Double.toString(result);
     ta3.setText(temp2);
    }
 
    else if (ch.getSelectedItem() == "D0") {
     Rcredit = credit * 1.0;
     Hsum += Rcredit;
     String temp = Double.toString(Hsum);
     ta2.setText(temp);
     double result = Hsum / Dsum;
     String temp2 = Double.toString(result);
     ta3.setText(temp2);
    }
 
    else if (ch.getSelectedItem() == "F") {
     Rcredit = credit * 0.0;
     Hsum += Rcredit;
     String temp = Double.toString(Hsum);
     ta2.setText(temp);
     double result = Hsum / Dsum;
     String temp2 = Double.toString(result);
     ta3.setText(temp2);
    }
    else if (ch.getSelectedItem() == "I") {
     Rcredit = credit * 0.0;
     Hsum += Rcredit;
     String temp = Double.toString(Hsum);
     ta2.setText(temp);
     double result = Hsum / Dsum;
     String temp2 = Double.toString(result);
     ta3.setText(temp2);
    }
   }
   else
    System.out.println("%"+tf1.getText()+"%"+tf2.getText()+"%"+tf3.getText()+"%");
  }
 }

 public void mouseEntered ( MouseEvent e ) {

 }

 public void mouseExited ( MouseEvent e ) {

 }

 public void mousePressed ( MouseEvent e ) {

 }

 public void mouseReleased ( MouseEvent e ) {

 }

 public void keyPressed ( KeyEvent e ) {

  double credit = Integer.parseInt(ch2.getSelectedItem());
  Dsum += credit;
  double Rcredit;

  if (e.getKeyChar() == KeyEvent.VK_ENTER) {
   if (tf1.hasFocus()) {
    tf2.requestFocus();
   }
   else if (tf2.hasFocus()) {
    tf3.requestFocus();
   }
   else if (tf3.hasFocus()) {
    b1.requestFocus();
   }
   else if (b1.hasFocus()) {
    ta.append(tf1.getText() + "  " + tf2.getText()
        + "  "
        + tf3.getText()
        + "  ");
    if (cb1.getState())
     ta.append(cb1.getLabel() + "  ");
    if (cb2.getState())
     ta.append(cb2.getLabel() + "  ");
    if (cb3.getState())
     ta.append(cb3.getLabel() + "  ");
    if (cb4.getState())
     ta.append(cb4.getLabel() + "  ");
    ta.append(cbg.getSelectedCheckbox().getLabel()
        + "  ");
    ta.append(ch.getSelectedItem() + "  ");
    ta.append(ch2.getSelectedItem() + "\n");
    if (ch.getSelectedItem() == "A+") {
     Rcredit = credit * 4.5;
     Hsum += Rcredit;
     String temp = Double.toString(Hsum);
     ta2.setText(temp);
     double result = Hsum / Dsum;
     String temp2 = Double.toString(result);
     ta3.setText(temp2);
    }
    else if (ch.getSelectedItem() == "A0") {
     Rcredit = credit * 4.0;
     Hsum += Rcredit;
     String temp = Double.toString(Hsum);
     ta2.setText(temp);
     double result = Hsum / Dsum;
     String temp2 = Double.toString(result);
     ta3.setText(temp2);
    }
    else if (ch.getSelectedItem() == "B+") {
     Rcredit = credit * 3.5;
     Hsum += Rcredit;
     String temp = Double.toString(Hsum);
     ta2.setText(temp);
     double result = Hsum / Dsum;
     String temp2 = Double.toString(result);
     ta3.setText(temp2);
    }
    else if (ch.getSelectedItem() == "B0") {
     Rcredit = credit * 3.0;
     Hsum += Rcredit;
     String temp = Double.toString(Hsum);
     ta2.setText(temp);
     double result = Hsum / Dsum;
     String temp2 = Double.toString(result);
     ta3.setText(temp2);
    }

    else if (ch.getSelectedItem() == "C+") {
     Rcredit = credit * 2.5;
     Hsum += Rcredit;
     String temp = Double.toString(Hsum);
     ta2.setText(temp);
     double result = Hsum / Dsum;
     String temp2 = Double.toString(result);
     ta3.setText(temp2);
    }

    else if (ch.getSelectedItem() == "C0") {
     Rcredit = credit * 2.0;
     Hsum += Rcredit;
     String temp = Double.toString(Hsum);
     ta2.setText(temp);
     double result = Hsum / Dsum;
     String temp2 = Double.toString(result);
     ta3.setText(temp2);
    }

    else if (ch.getSelectedItem() == "D+") {
     Rcredit = credit * 1.5;
     Hsum += Rcredit;
     String temp = Double.toString(Hsum);
     ta2.setText(temp);
     double result = Hsum / Dsum;
     String temp2 = Double.toString(result);
     ta3.setText(temp2);
    }

    else if (ch.getSelectedItem() == "D0") {
     Rcredit = credit * 1.0;
     Hsum += Rcredit;
     String temp = Double.toString(Hsum);
     ta2.setText(temp);
     double result = Hsum / Dsum;
     String temp2 = Double.toString(result);
     ta3.setText(temp2);
    }

    else if (ch.getSelectedItem() == "F") {
     Rcredit = credit * 0.0;
     Hsum += Rcredit;
     String temp = Double.toString(Hsum);
     ta2.setText(temp);
     double result = Hsum / Dsum;
     String temp2 = Double.toString(result);
     ta3.setText(temp2);
    }
    else if (ch.getSelectedItem() == "I") {
     Rcredit = credit * 0.0;
     Hsum += Rcredit;
     String temp = Double.toString(Hsum);
     ta2.setText(temp);
     double result = Hsum / Dsum;
     String temp2 = Double.toString(result);
     ta3.setText(temp2);
    }
   }
  }
 }

 public void keyTyped ( KeyEvent e ) {

 }

 public void keyReleased ( KeyEvent e ) {

 }

}