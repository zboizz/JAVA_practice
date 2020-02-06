package ch09;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEx02 extends MFrame 
implements ActionListener{
	
	TextField tf;
	TextArea ta;
	Button btn;
	
	public TextEx02() {
		super(250, 300);
		setTitle("Mychat1.0");
		//��ġ������
		setLayout(new BorderLayout());
				
		//NullPointerException-> ���� �������� ���� ��ü�� �����Ͽ����� �߻��ϴ� ����.
		//������ ��ü �ڷ� ������ ��κ� �ذ�
		
		add(ta = new TextArea()); //����Ǵ� ��ġ, default�� Center
	
		
//�������� �̵���Ű�� NullPointerException ���� �ذ�
		Color c[] = MColor.rColor2();
		ta.setBackground(c[0]);
		ta.setForeground(c[1]);
		ta.setEditable(false); //���� �Ұ� -> ��Ŀ�� ����, ����� ����		
		ta.append("Mychat1.0");
		//ta.setEnabled(false); //��� �Ұ� -> ��Ŀ�� �Ұ���, ���� �͸� ����
	
		
		//middle container
		Panel p = new Panel();		
		p.add(tf = new TextField(20));
		p.add(btn = new Button("send"));
		add(p,BorderLayout.SOUTH);
		//�̺�Ʈ: �̺�Ʈ �ҽ��� �̺�Ʈ�����ʸ� ����
		tf.addActionListener(this);
		btn.addActionListener(this);
	
		validate();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = tf.getText().trim();//�Էµ� ���� ������ ����
		if(str.length()==0) {
			str = "�Է��� �ϼ���.";
		}
		ta.append(str + "\n");
		
		tf.setText("");
		tf.requestFocus();
	}
	
	public static void main(String[] args) {
		new TextEx02();
	}



	
}
