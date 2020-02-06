package ch09;

import java.awt.Button;
import java.awt.FlowLayout;

public class FlowLayoutEx01 extends MFrame{
	
	Button btn[];
	String str[] = {"ù��°","�ι�°","����°","�׹�°","�ټ���°"};
	
	public FlowLayoutEx01() {
		setTitle("FlowLayout ����1");		
		setResizable(true); //------------------------ũ���������� setResizable
		//���� �������� ��ġ������ ����
		setLayout(new FlowLayout());
		btn = new Button[5];
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button(str[i]);
			add(btn[i]);
		}validate();
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx01();
	}
}
