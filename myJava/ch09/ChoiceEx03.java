package ch09;

import java.awt.Choice;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceEx03 extends MFrame 
implements ItemListener{
	
	Choice mode, list;
	String ms[] = {"현 빈","원 빈","이민호","김수현","김우빈","이종석"};
	String fs[] = {"고아라","이연희","이하늬","문채원","수 지","김연아"};
	
	public ChoiceEx03() {
		
		
		setTitle("Choice 예제3");
		mode = new Choice();
		mode.add("남자연예인");
		mode.add("여자연예인");
		
		list = new Choice();
		for (int i = 0; i < ms.length; i++) {
			list.add(ms[i]);
		}
		
		//mode에 이벤트를 연결한다.-->itemStateChanged 메소드 호출
		mode.addItemListener(this);
		add(mode);
		add(list);
		
	}	
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		//1. 기존에 아이템을 모두 삭제
		list.removeAll();
		String item = mode.getSelectedItem();
		//System.out.println(item);
		if(item.equals("남자연예인")) {
			for (int i = 0; i < ms.length; i++) {
				list.add(ms[i]);
			}
		}else if(item.equals("여자연예인")) {
			for (int i = 0; i < fs.length; i++) {
				list.add(fs[i]);
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		new ChoiceEx03();
	}

	
	
}
//기능은 최대한 쪼개놔야한다.
//프로그램은 만들때 그 이후에 유지 보수 및 필요성에 따라 쓰임이 다시 생길 수 도 있기때문에
//기능을 만들 때 최대한 나누어놓아야한다.
