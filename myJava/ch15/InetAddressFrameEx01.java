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
		setTitle("InetAddress 예제");
		Panel p = new Panel();
		p.setLayout(new BorderLayout());
		p.add(new Label("호스트이름"), BorderLayout.NORTH);
		p.add(tf = new TextField("",40));
		p.add(lookup = new Button("호스트 정보 얻기"), BorderLayout.SOUTH);
		tf.addActionListener(this);
		lookup.addActionListener(this);
		add(p, BorderLayout.NORTH);
		ta = new TextArea("인터넷주소\n");
		ta.setFont(new Font("Dialog",Font.BOLD,15));
		ta.setForeground(Color.BLUE);
		ta.setEditable(false);
		add(ta);
		validate();
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==lookup||obj==tf) {
			//obj==lookup->버튼을 누를 때 ,obj==tf-> 엔터를 누를 때
			String host = tf.getText().trim();
			//getText().trim(); -> 뒤에 .trim()은 공백을 제거하는 용도로 쓰임
		try {
			intAddr=InetAddress.getByName(host);
			String add = intAddr.getHostName();
			String ip = intAddr.getHostAddress();
			
			ta.append(" " + add+ "\n");
			ta.append(" "+ip+"\n");
		} catch (Exception e2) {
			ta.append("["+host+"]");
			ta.append("[해당 IP가 없습니다.]\n");
		}
		tf.setText("");
		tf.requestFocus();
	}
}
	
	public static void main(String[] args) {
		new InetAddressFrameEx01();
	}
}






