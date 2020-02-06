package ch09;

import java.awt.Choice;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceEx04 extends MFrame 
implements ItemListener{
	
	Choice mode, list;
	String ms[] = {"현 빈","원 빈","이민호","김수현","김우빈","이종석"};
	String fs[] = {"고아라","이연희","이하늬","문채원","수 지","김연아"};
	
	public ChoiceEx04() {
		setTitle("Choice 예제4");
		setSize(500,500);
		mode = new Choice();
		mode.add("남자연예인");
		mode.add("여자연예인");
		list = new Choice();
		inputItem(list,ms);
		mode.addItemListener(this);
		add(mode);
		add(list);
		validate();
	}

	public void inputItem(Choice c, String item[]) {
		//Choice c -> 선택권에 따른 남/여 연예인 변화
		//기존의 item 전부삭제
		c.removeAll();
		for (int i = 0; i < item.length; i++) {
			c.add(item[i]);
		}
	}	
	
	
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		String item = mode.getSelectedItem();
		if(item.equals("남자연예인")) {
			inputItem(list, ms);
		}else if(item.equals("여자연예인")) {
			inputItem(list, fs);
		}
	}
	
	public static void main(String[] args) {
		new ChoiceEx04();
	}
}







