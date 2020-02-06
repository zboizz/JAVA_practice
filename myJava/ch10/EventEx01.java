package ch10;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class EventEx01 extends MFrame
//----2.버튼을 클릭하면 ActionEvent가 객체가 발생된다.
 
implements ActionListener{
	
//----1. 이벤트 소스를 만든다.(이벤트 소스: 모든 컴포넌트)
	Button btn;
	
	
	public EventEx01() {
		add(btn = new Button("버튼"), BorderLayout.SOUTH);
//----4. 이벤트 소스랑 이벤트 핸들러 연결(addXXXXListner 메소드)
		//버튼을 누르면 백그라운드 색깔이 변하는 기능을 추가하고 싶다.
		// a. 이벤트 소스: Button
		// b. Button 클릭 시 발생되는 이벤트 객체가 ActionEvent
		//    (Action Event와 이벤트소스가 연결되기 위한 리스너를 구현)
		// c. 이벤트리스너 선정: XXXListener --->ActionListener
		

		btn.addActionListener(this);
		validate();
	}
	
//----3. 이벤트리스너의 메소드(이벤트핸들러) 구현
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("호출"); //버튼을 눌러줄때마다 호출이라는 글자가 콘솔창에 입력됨
		//즉, addActionListener();에 대한 기능을 이곳에 구현하면 됨
		//->이벤트리스너의 메소드 구현
		//Button b = (Button)e.getSource();
		//System.out.println(b.getLabel());
		setBackground(MColor.rColor());
	}
	
	
	public static void main(String[] args) {
		new EventEx01();
	}


	
}
