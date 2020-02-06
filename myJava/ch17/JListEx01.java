package ch17;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;



public class JListEx01 extends JFrame
implements ListSelectionListener{

	private String[] cities = { "����", "�ĸ�", "�õ��", "�ν���������", "����", "�踮��", "�����" };
	JLabel label;
	JPanel p1, p2;
	JTextField tf;
	JList<String> list;
	
	public JListEx01() {
		setSize(300,300);
		setTitle("Jlist ����1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//////////////////////////////
		list = new JList<String>(cities);
		//����Ʈ ��輱
		list.setBorder(BorderFactory.createLineBorder(Color.green,1)); //1�� �β�
		JScrollPane sc = new JScrollPane(list);
		sc.setPreferredSize(new Dimension(200,100));
		//���ϸ��
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		
		list.addListSelectionListener(this);
		
		
		p1 = new JPanel();
		p1.add(sc);
		/////////////////////
		label = new JLabel("���õ� �׸� : ");
		tf = new JTextField(10);
		tf.setEditable(false);
		p2 = new JPanel();
		p2.add(label);
		p2.add(tf);
		///////////////////////
		add(p1,BorderLayout.PAGE_START); //North
		add(p2,BorderLayout.CENTER);
		//////////////////////////////
		setVisible(true);		
	}
	@Override
	public void valueChanged(ListSelectionEvent e) {
		String city = list.getSelectedValue();
		tf.setText(city);
	}
	
	
	
	public static void main(String[] args) {
		new JListEx01();
	}

	
}
