package ch0501;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ch05.MColor;
import ch05.MFrame;


//익명클래스를 사용하여 버튼을 클릭하면 배경색상이 랜덤으로 변경

class AFrame extends MFrame{
	Button btn;
	public AFrame() {
		btn = new Button("버튼");
		add(btn, "North");
		btn.addActionListener(new ActionListener() {	
			//버튼에 추가하겠다, 액션이벤트를, (매개변수 타입은 ActionListner)
			//ActionListner은 인터페이스, 객체생성은 안됨
			@Override
			public void actionPerformed(ActionEvent e) {
				//프레임의 배경색을 수정
				setBackground(MColor.rColor());			
				Color c[] = MColor.rColor2();
				//버튼에 배경과 진경색(글자)를 수정
				btn.setBackground(c[0]);
				btn.setForeground(c[1]);
			}
		}); 
		validate();
	}
}




public class AnonymousEx05 {

	public static void main(String[] args) {
	new AFrame();	
	}
}
