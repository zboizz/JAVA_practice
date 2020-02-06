package ch15;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

class LoginAWT03 extends MFrame implements ActionListener {

	TextField idTx, pwTx;
	Label logo, idl, pwl, msgl;
	Button logBtn;
	Socket sock;
	BufferedReader in;
	PrintWriter out;
	String id;

	public LoginAWT03() {
		super(450, 400, new Color(100, 200, 100));
		setTitle("MyChat 3.0");
		setLayout(null);
		logo = new Label("MyChat 3.0");
		logo.setFont(new Font("Dialog", Font.BOLD, 50));

		idl = new Label("ID");
		pwl = new Label("PWD");
		idTx = new TextField("aaa");
		pwTx = new TextField("1234");
		logBtn = new Button("�α���");
		msgl = new Label("ID�� PASS�� �Է��ϼ���.");
		logo.setBounds(100, 50, 270, 100);
		idl.setBounds(150, 200, 50, 20);
		idTx.setBounds(200, 200, 100, 20);
		pwl.setBounds(150, 230, 50, 20);
		pwTx.setBounds(200, 230, 100, 20);
		logBtn.setBounds(150, 260, 150, 40);
		msgl.setBounds(150, 320, 150, 40);
		logBtn.addActionListener(this);
		add(logo);
		add(idl);
		add(idTx);
		add(pwl);
		add(pwTx);
		add(logBtn);
		add(msgl);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		try {
			if (obj == logBtn) {
				if (sock == null) {
					sock = new Socket("127.0.0.1", 8003);
					in = new BufferedReader(new InputStreamReader(
							sock.getInputStream()));
					out = new PrintWriter(sock.getOutputStream(), true);
				}
				id = idTx.getText().trim();
				//������ id�� pwd�� ������.
				out.println(ChatProtocol03.ID+":"+id+";"+pwTx.getText());
				String line = in.readLine();
				//line:ID:T or ID:F
				int idx = line.indexOf(':');
				String cmd = line.substring(0,idx);
				String data = line.substring(idx+1);
				if(cmd.equals(ChatProtocol03.ID)) {
					if(data.equals("F")) { //�α��� ����
						//Label logo, idl, pwl, msgl;
						msgl.setForeground(Color.red);
						msgl.setText("Id�� PWD�� Ȯ���ϼ���.");
					}else if(data.equals("T")) { //�α��� ����
						dispose();	 //����â�� �ݴ´�.
						new ChatClient03(in, out, id);
					}
				}
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new LoginAWT03();
	}
}
