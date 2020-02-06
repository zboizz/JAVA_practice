package ch09;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceEx02 extends MFrame
implements ItemListener{

	Choice air, city;
	String sair[] = {"�����װ�","�ƽþƳ�","����λ�","������"};
	String scity[] = {"�� ��","�� ��","�� ��","�� ��","���ֵ�"};
	
	public ChoiceEx02() {
	super(300, 300, new Color(100, 200, 100));
	setTitle("Choice ����2");
	
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
	
	city.addItemListener(this); //�̺�Ʈ �ο�
	
	
	
	
	validate();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		repaint();
	}
	@Override  
	public void paint(Graphics g) {  //paint�� �������̵�
		//�׸��� �׸��� ���ؼ��� ��ȭ��, ��, ȭ���� �ʿ�
		//��ȭ��->Frame
		//��->g
		//ȭ��->������
		String str = "�װ���� ���ø� �����ϼ���.";
		g.setColor(Color.DARK_GRAY);
		g.drawString("�װ���� ���ø� �����ϼ���", 90, 80);
		g.setColor(Color.red);
		str = "�װ��� ����: " + air.getSelectedItem();
		g.drawString(str, 80, 120);
		g.setColor(Color.blue);
		str = "���� ����: " + city.getSelectedItem();
		g.drawString(str, 80, 160);
	}
	
	public static void main(String[] args) {
		new ChoiceEx02();
	}
}
