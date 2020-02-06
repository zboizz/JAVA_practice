package ch08;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;

public class FileCopyEx02 extends MFrame 
implements ActionListener{
	
	Button open, save;
	TextArea ta;
	FileDialog openDialog, saveDialog;
	String sourceDir;
	String sourceFile;
	
	public FileCopyEx02() {
		super(400,500);
		setTitle("FileCopy ����");
		add(ta = new TextArea());
		Panel p = new Panel();
		p.add(open = new Button("OPEN"));
		p.add(save = new Button("SAVE"));
		//ta.setEditable(false);
		open.addActionListener(this);
		save.addActionListener(this);
		add(p,BorderLayout.SOUTH);
		validate();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == open)	{
			openDialog = new FileDialog(this,"���Ͽ���", FileDialog.LOAD);
			openDialog.setVisible(true);
			//���ϰ��, ���ϸ�
			String dir,file;
			dir = openDialog.getDirectory();
			file = openDialog.getFile();
			try {
				fileReader(dir+file);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			
			
		}else if(obj==save) {
				saveDialog = new FileDialog(this,"��������", FileDialog.SAVE);
				//public FileDialog(Frame parent, String title, int mode)
				
				saveDialog.setVisible(true);
				//���ϰ��, ���ϸ�
				String dir,file;
				dir = saveDialog.getDirectory();
				file = saveDialog.getFile();
				try {
					fileWriter(dir+file);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
		}
	}
	
	public void fileReader(String file) throws Exception{
		Charset set = Charset.forName("UTF-8");
		FileReader fr = new FileReader(file, set);
		int c;
		String s = "";
		while((c = fr.read())!=-1) {
			s += (char)c;
		}
		ta.setText(s);
		fr.close();
		
	}
	
	public void fileWriter(String file) throws Exception{
		FileWriter fw = new FileWriter(file);
		fw.write(ta.getText());
		for (int i = 5; i > 0; i--) {
			ta.setText("���� �Ͽ����ϴ�. - " + i 
					+"�� �Ŀ� ������ϴ�.");
			Thread.sleep(1000);//1�ʰ���
		}
		ta.setText("");
		fw.close();
	}
	
	public static void main(String[] args) {
		new FileCopyEx02();
	
	}
}
