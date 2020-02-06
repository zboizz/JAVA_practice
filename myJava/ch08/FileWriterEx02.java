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
		setTitle("FileWriter 예제");
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
			ta.append(tf.getText()+"\n"); //엔터치면 내용이 텍스트창에 새겨짐
			tf.setText("");  //엔터를 치면 입력창이 초기화됨
			tf.requestFocus();
		}else if(obj==save) {     //저장하기
			saveFile(ta.getText());
			ta.setText("");
			try {
				for (int i = 5; i > 0; i--) {
					ta.setText("저장하였습니다.-"+i+"초 후에 사라집니다.");
					Thread.sleep(1000); //1초간격으로
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
		//파일명을 저장 -> unique
		long fName = System.currentTimeMillis();
		System.out.println("fName");
	}
}






