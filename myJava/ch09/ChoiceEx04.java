package ch09;

import java.awt.Choice;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceEx04 extends MFrame 
implements ItemListener{
	
	Choice mode, list;
	String ms[] = {"�� ��","�� ��","�̹�ȣ","�����","����","������"};
	String fs[] = {"��ƶ�","�̿���","���ϴ�","��ä��","�� ��","�迬��"};
	
	public ChoiceEx04() {
		setTitle("Choice ����4");
		setSize(500,500);
		mode = new Choice();
		mode.add("���ڿ�����");
		mode.add("���ڿ�����");
		list = new Choice();
		inputItem(list,ms);
		mode.addItemListener(this);
		add(mode);
		add(list);
		validate();
	}

	public void inputItem(Choice c, String item[]) {
		//Choice c -> ���ñǿ� ���� ��/�� ������ ��ȭ
		//������ item ���λ���
		c.removeAll();
		for (int i = 0; i < item.length; i++) {
			c.add(item[i]);
		}
	}	
	
	
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		String item = mode.getSelectedItem();
		if(item.equals("���ڿ�����")) {
			inputItem(list, ms);
		}else if(item.equals("���ڿ�����")) {
			inputItem(list, fs);
		}
	}
	
	public static void main(String[] args) {
		new ChoiceEx04();
	}
}







