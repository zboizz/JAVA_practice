package ch09;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;


public class DesignEx0101 extends MFrame {
	
	//첫째줄은 라벨로 길게
	//체크박스로 그룹화
	//전체적인 레이아웃은 BorderLayout()으로
	//제일 하단은 버튼으로
	Label label;
	Checkbox cb1, cb2, cb3;
	CheckboxGroup cbg;
	Button btn1, btn2;
	
	public DesignEx0101() {
		super(250,150);
		setTitle("디자인 예제1");
		//Frame의 디폴트 배치관리자가 BorderLayout 맞지만 
		//MFrame은 만들 때 필요에 의해서 Flowlayout 설정
		setLayout(new BorderLayout());
		
		label = new Label("과일중에 선택", Label.CENTER);		
		label.setBackground(Color.DARK_GRAY);		
		add(label, BorderLayout.NORTH);
		
		
		cbg = new CheckboxGroup();
		Panel p1 = new Panel();
		p1.add(cb1 = new Checkbox("사과", cbg, true));
		p1.add(cb2 = new Checkbox("딸기", cbg, false));
		p1.add(cb3 = new Checkbox("앵두", cbg, false));
		
		add(label,BorderLayout.NORTH);
		add(p1);
		
		
		Panel p2 = new Panel();
		
		p2.add(btn1 = new Button("Start"));
		p2.add(btn2 = new Button("End"));
		
		add(p2, BorderLayout.SOUTH);
		validate();
	}	

	public static void main(String[] args) {
		new DesignEx0101();
	}
}