package ch15;

import java.awt.Button;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

public class URLFrameEx01 extends MFrame implements ActionListener {
	
	TextArea ta;
	TextField tf;
	Button connect;
	Button save;
	
	public URLFrameEx01() {
		super(500, 500);
		setTitle("ViewHost");
		Panel p = new Panel();
		p.add(tf = new TextField("http://auctoin.co.kr", 40));
		p.add(connect = new Button("connect"));
		p.add(save = new Button("save"));
		ta = new TextArea();
		add("North", p);
		add("Center", ta);
		
		connect.addActionListener(this);
		save.addActionListener(this);
		tf.addActionListener(this);
		
		validate();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		String host = tf.getText();
		if(obj==tf||obj==connect) {
			ta.setText("");
			save.setEnabled(true);
			connectHost(host);
		}else if(obj==save) {
			createFile(host, ta.getText());
			save.setEnabled(false);
			tf.setText("http://");
			ta.setText("");
			ta.append("저장하였습니다.");
			tf.requestFocus();
		}
	}

	public void connectHost(String host) {
		try {
			URL url = new URL(host);
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(),"UTF-8"));
			String line = "";
			while(true) {
				line = br.readLine();
				if(line==null) break;
				ta.append(line +"\n");
			}
			br.close();
		} catch (Exception e) {
			ta.append("해당 호스트는 존재하지않습니다");
			//e.printStackTrace();
		}
	}
	
	//file : host.txt => http://도메인 => auction.co.kr.txt
	public void createFile(String host, String content) {
		try {
			FileWriter fw = new FileWriter("ch15/" + host.substring(7)+".txt"); //7번째 글자부터 가지고 와라
			fw.write(content);
			fw.flush();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		new URLFrameEx01();
	}
}
