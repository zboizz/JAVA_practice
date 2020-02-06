package ch10;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEventEx02 extends MFrame 
implements ItemListener {
	
	Choice air, city;
	String sair[] = {"항공사선택","대한항공","아시아나","에어부산"};
	String scity[] = {"도시선택","서 울","대 전","대 구","부 산","제주도"};
	TextArea ta;
	
	public ItemEventEx02() {
		super(300,300,new Color(100,200,100));
		setTitle("itemevent 예제2");
		Panel p = new Panel();
		air = new Choice();
		city = new Choice();
		for (int i = 0; i < sair.length; i++) {
			air.add(sair[i]);			
		}
		for (int i = 0; i < scity.length; i++) {
			city.add(scity[i]);			
		}
		p.add(air);
		p.add(city);
		add(p,BorderLayout.NORTH);
		add(ta=new TextArea());	
		//air.addItemListener(this);
		city.addItemListener(this);
		validate();
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		Object obj = e.getSource();
		if(obj==city) {
			String str = "선택한 항공사: ";
			str += air.getSelectedItem();
			str +="\n선택한 도시 : ";
			str +=city.getSelectedItem();
			ta.append(str+"\n\n");
			//항공사와 도시를 선택한 후에 item은 각각 0번째 값으로 초기화			
			air.select(0);
			city.select(0);
		}
	}

	public static void main(String[] args) {
		new ItemEventEx02();
	}


	
}




