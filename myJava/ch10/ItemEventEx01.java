package ch10;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEventEx01 extends MFrame 
implements ItemListener{
	
	Label label;
	Checkbox cb1, cb2, cb3;
	
	public ItemEventEx01() {
		super(300, 200);
		setLayout(new FlowLayout());
		add(cb1=new Checkbox("수박"));
		add(cb2=new Checkbox("바나나"));
		add(cb3=new Checkbox("멜론"));
		add(label = new Label("현재 상태 :                    "));
		
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		validate();
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		//이벤트를 발생시킨 이벤트 소스를 가져옴
		Checkbox cb = (Checkbox)e.getSource();
		String str = cb.getLabel() + ":" + cb.getState(); //체크박스에서 표시한 항목의 값을 가져오겠다.
		label.setText(str); //표현
		setTitle(str);	
	}

	public static void main(String[] args) {
		new ItemEventEx01();
	}


	
}




