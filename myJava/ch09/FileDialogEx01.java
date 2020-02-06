package ch09;

import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class FileDialogEx01 extends MFrame
implements ActionListener {
	
	
	Button openBtn, saveBtn;
	FileDialog openFile, saveFile;

	
	
	
	public FileDialogEx01() {
		setTitle("filedialog ����1");
		
		openFile = new FileDialog(this, "���� ����", FileDialog.LOAD);
		saveFile = new FileDialog(this, "���� ����", FileDialog.SAVE);		
		
		Panel p1 = new Panel();
		p1.add(openBtn = new Button("���� ����"));
		p1.add(saveBtn = new Button("���� ����"));
		openBtn.addActionListener(this);
		saveBtn.addActionListener(this);
		add(p1);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==openBtn) {
			openFile.setVisible(true);
		}else if(e.getSource()==saveBtn) { 
			                       //���� ���� Ȥ�� ��Ʋ�� ������ ���� �׼��̺�Ʈ ��ü(e)�� ������	
			saveFile.setVisible(true);
		}
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
	new FileDialogEx01();	
	}
}
