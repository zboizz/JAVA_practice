package ch0501;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ch05.MColor;
import ch05.MFrame;


//�͸�Ŭ������ ����Ͽ� ��ư�� Ŭ���ϸ� �������� �������� ����

class AFrame extends MFrame{
	Button btn;
	public AFrame() {
		btn = new Button("��ư");
		add(btn, "North");
		btn.addActionListener(new ActionListener() {	
			//��ư�� �߰��ϰڴ�, �׼��̺�Ʈ��, (�Ű����� Ÿ���� ActionListner)
			//ActionListner�� �������̽�, ��ü������ �ȵ�
			@Override
			public void actionPerformed(ActionEvent e) {
				//�������� ������ ����
				setBackground(MColor.rColor());			
				Color c[] = MColor.rColor2();
				//��ư�� ���� �����(����)�� ����
				btn.setBackground(c[0]);
				btn.setForeground(c[1]);
			}
		}); 
		validate();
	}
}




public class AnonymousEx05 {

	public static void main(String[] args) {
	new AFrame();	
	}
}
