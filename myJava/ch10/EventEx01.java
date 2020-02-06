package ch10;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class EventEx01 extends MFrame
//----2.��ư�� Ŭ���ϸ� ActionEvent�� ��ü�� �߻��ȴ�.
 
implements ActionListener{
	
//----1. �̺�Ʈ �ҽ��� �����.(�̺�Ʈ �ҽ�: ��� ������Ʈ)
	Button btn;
	
	
	public EventEx01() {
		add(btn = new Button("��ư"), BorderLayout.SOUTH);
//----4. �̺�Ʈ �ҽ��� �̺�Ʈ �ڵ鷯 ����(addXXXXListner �޼ҵ�)
		//��ư�� ������ ��׶��� ������ ���ϴ� ����� �߰��ϰ� �ʹ�.
		// a. �̺�Ʈ �ҽ�: Button
		// b. Button Ŭ�� �� �߻��Ǵ� �̺�Ʈ ��ü�� ActionEvent
		//    (Action Event�� �̺�Ʈ�ҽ��� ����Ǳ� ���� �����ʸ� ����)
		// c. �̺�Ʈ������ ����: XXXListener --->ActionListener
		

		btn.addActionListener(this);
		validate();
	}
	
//----3. �̺�Ʈ�������� �޼ҵ�(�̺�Ʈ�ڵ鷯) ����
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("ȣ��"); //��ư�� �����ٶ����� ȣ���̶�� ���ڰ� �ܼ�â�� �Էµ�
		//��, addActionListener();�� ���� ����� �̰��� �����ϸ� ��
		//->�̺�Ʈ�������� �޼ҵ� ����
		//Button b = (Button)e.getSource();
		//System.out.println(b.getLabel());
		setBackground(MColor.rColor());
	}
	
	
	public static void main(String[] args) {
		new EventEx01();
	}


	
}
