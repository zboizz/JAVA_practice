package ch09;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceEx02 extends MFrame
implements ItemListener{

	Choice air, city;
	String sair[] = {"대한항공","아시아나","에어부산","진에어"};
	String scity[] = {"서 울","대 전","대 구","부 산","제주도"};
	
	public ChoiceEx02() {
	super(300, 300, new Color(100, 200, 100));
	setTitle("Choice 예제2");
	
	air = new Choice();
	for (int i = 0; i < sair.length; i++) {
		air.add(sair[i]);
	}
	
	city = new Choice();
	for (int i = 0; i < scity.length; i++) {
		city.add(scity[i]);
	}
	
	add(air);
	add(city);	
	
	city.addItemListener(this); //이벤트 부여
	
	
	
	
	validate();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		repaint();
	}
	@Override  
	public void paint(Graphics g) {  //paint를 오버라이드
		//그림을 그리기 위해서는 도화지, 붓, 화가가 필요
		//도화지->Frame
		//붓->g
		//화가->개발자
		String str = "항공사와 도시를 선택하세요.";
		g.setColor(Color.DARK_GRAY);
		g.drawString("항공사와 도시를 선택하세요", 90, 80);
		g.setColor(Color.red);
		str = "항공사 선택: " + air.getSelectedItem();
		g.drawString(str, 80, 120);
		g.setColor(Color.blue);
		str = "도시 선택: " + city.getSelectedItem();
		g.drawString(str, 80, 160);
	}
	
	public static void main(String[] args) {
		new ChoiceEx02();
	}
}
