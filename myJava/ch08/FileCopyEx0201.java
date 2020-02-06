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
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

import ch12.MFrame;

public class FileCopyEx0201 extends MFrame 
implements ActionListener{
	
	Button open, save;
	TextArea ta;
	FileDialog openDialog, saveDialog;
	String sourceDir;
	String sourceFile;
	FileReader fr;
	FileWriter fw;
	String fileContent = "";
	JFileChooser fileChooser;
	public FileCopyEx0201() {
		super(400,500);
		setTitle("FileCopy");
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
		File selectedFile = null;
		if(obj==open) {
		fileChooser = new JFileChooser("C:/Java/eclipse-workspace/myJava/ch08");
		int result = fileChooser.showOpenDialog(new Frame());
		selectedFile = fileChooser.getSelectedFile();
		String path = selectedFile.toString();
			if (result == JFileChooser.APPROVE_OPTION)
				try {
					fileReader(path);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
		}
		else if(obj==save) {
			fileChooser= new JFileChooser("C:/Java/eclipse-workspace/myJava/ch08");
			fileChooser.showSaveDialog(new Frame());
			String path = fileChooser.getSelectedFile().toString();
			try {
				fileWriter(path);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
	
	public void fileReader(String file) throws IOException{
			fr = new FileReader(file);	
			int count;
			try {
				while((count=fr.read())!=-1) {
					fileContent += Character.toString((char)count);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			ta.setText(fileContent);
			fr.close();
	}
	
	public void fileWriter(String file) throws IOException{
		fw = new FileWriter(file);
		String writeContents = ta.getText();
		fw.write(writeContents);
		fw.flush();
		fw.close();
	}
	
	public static void main(String[] args) {
		new FileCopyEx02();
	}
}
