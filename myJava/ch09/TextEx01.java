package ch09;

import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEx01 extends MFrame
implements ActionListener{
	
	
	TextField tf1, tf2;
	TextArea ta;
	
	
	public TextEx01() {
		super(250,300);
		setTitle("텍슽 예제1");
		add(new Label("NAME"));
		add(tf1 = new TextField("홍길동", 20));
		add(new Label("PASS"));
		add(tf2 = new TextField(20));
		tf2.setEchoChar('$');
		//tf2 에서 엔터를 누르면 actionPerformed 호출
		tf2.addActionListener(this);
		add(ta = new TextArea(10, 30));
		validate();
	}
	@Override 
	public void actionPerformed(ActionEvent e) {
		String name = tf1.getText();
		String pass = tf2.getText();
		ta.append(name + "/"+ pass);
		tf1.setText("");
		tf2.setText("");
		tf1.requestFocus();			
				
	}
	
	
public static void main(String[] args) {
	new TextEx01();
}


}
