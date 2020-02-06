package ch09;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEx02 extends MFrame 
implements ActionListener{
	
	TextField tf;
	TextArea ta;
	Button btn;
	
	public TextEx02() {
		super(250, 300);
		setTitle("Mychat1.0");
		//배치관리자
		setLayout(new BorderLayout());
				
		//NullPointerException-> 아직 생성되지 않은 객체를 지명하였을때 발생하는 오류.
		//생성된 객체 뒤로 보내면 대부분 해결
		
		add(ta = new TextArea()); //저장되는 위치, default는 Center
	
		
//이쪽으로 이동시키니 NullPointerException 오류 해결
		Color c[] = MColor.rColor2();
		ta.setBackground(c[0]);
		ta.setForeground(c[1]);
		ta.setEditable(false); //편집 불가 -> 포커스 가능, 복사는 가능		
		ta.append("Mychat1.0");
		//ta.setEnabled(false); //사용 불가 -> 포커스 불가능, 보는 것만 가능
	
		
		//middle container
		Panel p = new Panel();		
		p.add(tf = new TextField(20));
		p.add(btn = new Button("send"));
		add(p,BorderLayout.SOUTH);
		//이벤트: 이벤트 소스에 이벤트리스너를 연결
		tf.addActionListener(this);
		btn.addActionListener(this);
	
		validate();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = tf.getText().trim();//입력된 값중 공백은 제거
		if(str.length()==0) {
			str = "입력을 하세요.";
		}
		ta.append(str + "\n");
		
		tf.setText("");
		tf.requestFocus();
	}
	
	public static void main(String[] args) {
		new TextEx02();
	}



	
}
