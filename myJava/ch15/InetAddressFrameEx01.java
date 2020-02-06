package ch15;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressFrameEx01 extends MFrame 
implements ActionListener{
	
	TextField tf;
	TextArea ta;
	Button lookup;
	InetAddress intAddr;
	
	public InetAddressFrameEx01() {
		setTitle("InetAddress ����");
		Panel p = new Panel();
		p.setLayout(new BorderLayout());
		p.add(new Label("ȣ��Ʈ�̸�"), BorderLayout.NORTH);
		p.add(tf = new TextField("",40));
		p.add(lookup = new Button("ȣ��Ʈ ���� ���"), BorderLayout.SOUTH);
		tf.addActionListener(this);
		lookup.addActionListener(this);
		add(p, BorderLayout.NORTH);
		ta = new TextArea("���ͳ��ּ�\n");
		ta.setFont(new Font("Dialog",Font.BOLD,15));
		ta.setForeground(Color.BLUE);
		ta.setEditable(false);
		add(ta);
		validate();
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==lookup||obj==tf) {
			//obj==lookup->��ư�� ���� �� ,obj==tf-> ���͸� ���� ��
			String host = tf.getText().trim();
			//getText().trim(); -> �ڿ� .trim()�� ������ �����ϴ� �뵵�� ����
		try {
			intAddr=InetAddress.getByName(host);
			String add = intAddr.getHostName();
			String ip = intAddr.getHostAddress();
			
			ta.append(" " + add+ "\n");
			ta.append(" "+ip+"\n");
		} catch (Exception e2) {
			ta.append("["+host+"]");
			ta.append("[�ش� IP�� �����ϴ�.]\n");
		}
		tf.setText("");
		tf.requestFocus();
	}
}
	
	public static void main(String[] args) {
		new InetAddressFrameEx01();
	}
}






