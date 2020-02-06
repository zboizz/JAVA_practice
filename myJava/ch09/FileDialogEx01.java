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
		setTitle("filedialog 예제1");
		
		openFile = new FileDialog(this, "파일 열기", FileDialog.LOAD);
		saveFile = new FileDialog(this, "파일 저장", FileDialog.SAVE);		
		
		Panel p1 = new Panel();
		p1.add(openBtn = new Button("파일 열기"));
		p1.add(saveBtn = new Button("파일 저장"));
		openBtn.addActionListener(this);
		saveBtn.addActionListener(this);
		add(p1);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==openBtn) {
			openFile.setVisible(true);
		}else if(e.getSource()==saveBtn) { 
			                       //파일 저장 혹은 버틀을 누르는 순간 액션이벤트 객체(e)가 생성됨	
			saveFile.setVisible(true);
		}
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
	new FileDialogEx01();	
	}
}
