package ch0501;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ch05.MColor;


//익명클래스를 사용하지 않고 이벤트 기능을 작동

class MyAction implements ActionListener{
	NaFrame na;
	public MyAction(NaFrame na) {
		this.na=na;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {		
	na.setBackground(MColor.rColor());			
	Color c[] = MColor.rColor2();	
	na.btn.setBackground(c[0]);
	na.btn.setForeground(c[1]);
 }
}

class NaFrame extends MFrame{
	
	Button btn;
	public NaFrame() {
		btn = new Button("Button");
		add(btn,"South"); //버튼의 위치는 남쪽
		
		//MyAction 클래스에 NaFrame에 있는 필드에 접근할 수 있도록 조치
		MyAction ma = new MyAction(this); //MyAction 생성
		//this는 NaFrame 객체를 생성했을 때 객체의 주소값
		btn.addActionListener(ma); //위에서 만든 액션리스너 이벤트 호출
	}
}


public class AnonymousEx06 {
	public static void main(String[] args) {
		NaFrame ma = new NaFrame();
	}
}
