package ch08;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx02 extends MFrame
implements ActionListener{
	
	TextArea ta;
	TextField tf;
	Button save;
	
	public FileWriterEx02() {
		super(320, 400);
		setTitle("FileWriter ����");
		add(ta=new TextArea());
		Panel p = new Panel();
		p.add(tf = new TextField(30));
		p.add(save = new Button("SAVE"));
		ta.setEditable(false);
		tf.addActionListener(this);
		save.addActionListener(this);
		add(p,BorderLayout.SOUTH);
		validate();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==tf) {
			ta.append(tf.getText()+"\n"); //����ġ�� ������ �ؽ�Ʈâ�� ������
			tf.setText("");  //���͸� ġ�� �Է�â�� �ʱ�ȭ��
			tf.requestFocus();
		}else if(obj==save) {     //�����ϱ�
			saveFile(ta.getText());
			ta.setText("");
			try {
				for (int i = 5; i > 0; i--) {
					ta.setText("�����Ͽ����ϴ�.-"+i+"�� �Ŀ� ������ϴ�.");
					Thread.sleep(1000); //1�ʰ�������
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}ta.setText("");
	}
}
	public void saveFile(String str) {
		try {
			long fName = System.currentTimeMillis();
			FileWriter fw = new FileWriter("ch08/"+ fName +".txt");
			fw.write(str);
			fw.flush();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		new FileWriterEx02();
		//���ϸ��� ���� -> unique
		long fName = System.currentTimeMillis();
		System.out.println("fName");
	}
}






