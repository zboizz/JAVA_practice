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
		add(cb1=new Checkbox("����"));
		add(cb2=new Checkbox("�ٳ���"));
		add(cb3=new Checkbox("���"));
		add(label = new Label("���� ���� :                    "));
		
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		validate();
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		//�̺�Ʈ�� �߻���Ų �̺�Ʈ �ҽ��� ������
		Checkbox cb = (Checkbox)e.getSource();
		String str = cb.getLabel() + ":" + cb.getState(); //üũ�ڽ����� ǥ���� �׸��� ���� �������ڴ�.
		label.setText(str); //ǥ��
		setTitle(str);	
	}

	public static void main(String[] args) {
		new ItemEventEx01();
	}


	
}




