package ch09;

import java.awt.Choice;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceEx03 extends MFrame 
implements ItemListener{
	
	Choice mode, list;
	String ms[] = {"�� ��","�� ��","�̹�ȣ","�����","����","������"};
	String fs[] = {"��ƶ�","�̿���","���ϴ�","��ä��","�� ��","�迬��"};
	
	public ChoiceEx03() {
		
		
		setTitle("Choice ����3");
		mode = new Choice();
		mode.add("���ڿ�����");
		mode.add("���ڿ�����");
		
		list = new Choice();
		for (int i = 0; i < ms.length; i++) {
			list.add(ms[i]);
		}
		
		//mode�� �̺�Ʈ�� �����Ѵ�.-->itemStateChanged �޼ҵ� ȣ��
		mode.addItemListener(this);
		add(mode);
		add(list);
		
	}	
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		//1. ������ �������� ��� ����
		list.removeAll();
		String item = mode.getSelectedItem();
		//System.out.println(item);
		if(item.equals("���ڿ�����")) {
			for (int i = 0; i < ms.length; i++) {
				list.add(ms[i]);
			}
		}else if(item.equals("���ڿ�����")) {
			for (int i = 0; i < fs.length; i++) {
				list.add(fs[i]);
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		new ChoiceEx03();
	}

	
	
}
//����� �ִ��� �ɰ������Ѵ�.
//���α׷��� ���鶧 �� ���Ŀ� ���� ���� �� �ʿ伺�� ���� ������ �ٽ� ���� �� �� �ֱ⶧����
//����� ���� �� �ִ��� ��������ƾ��Ѵ�.
