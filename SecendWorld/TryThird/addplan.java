package TryThird;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import TryFirst.planBean;

public class addplan extends JFrame implements ActionListener {
	
	@SuppressWarnings("rawtypes")
	private Vector data, title = null;
	@SuppressWarnings("rawtypes")	
	private JTable table = null;	
	private String titleStored = "";
	private DefaultTableModel model = null;
	private JButton btnAdd,btnDel,btnExit;	
	private JTextField tfpidx, tfptitle, tfpdate, tfpdetail, tfcdate = null;
	private JLabel lblptitle, lblpdate, lblpdetail, lblcdate = null;
	private JPanel p1, p2, p3, p4, p5;
	private JButton savebtn, getbackbtn;
	private Statement stmt = null;
	private Vector vec = null;
	DBplan DB;
	
	public addplan() {
		
		tfpidx = new JTextField(3);
		tfptitle = new JTextField(10);
		tfpdate = new JTextField(10);
		tfpdetail = new JTextField(20);
		tfcdate = new JTextField(20);
		//���̺� ����
		lblptitle = new JLabel("Ÿ��Ʋ");
		lblpdate = new JLabel("��¥");
		lblpdetail = new JLabel("����");
		lblcdate = new JLabel("�ۼ���¥");
		
		DB= new DBplan();
		
		//��ư ����			
		
		setTitle("�߰�ȭ��");
		setSize(400,400);
		
		 p1 = new JPanel();
		 p1.setLayout(new GridLayout(4,1));
		 p2 = new JPanel();
		 p2.add(lblptitle); p2.add(tfpidx);	p2.add(tfptitle);
		 tfpidx.setEditable(true);
		 p1.add(p2);
		 tfptitle.addKeyListener(new KeyAdapter() {
				@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==10) {tfpdate.requestFocus();}
				}
			});
		 
		 p3=new JPanel();
		 p3.add(lblpdate); p3.add(tfpdate);	
		 p1.add(p3);
		 tfpdate.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==10) {tfpdetail.requestFocus();}
				}
			});
		
		 p4=new JPanel();
		 p4.add(lblpdetail); p4.add(tfpdetail); 
		 p1.add(p4);
		 tfpdate.addKeyListener(new KeyAdapter() {
		 @Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==10) {					
					System.out.println("�Է� ����");
					String pidx = tfpidx.getText();
					String ptitle = tfptitle.getText(); //Ÿ��Ʋ
					String pdate = tfpdate.getText();   //��¥
					String pdetail = tfpdetail.getText();  //����
					String cdate = tfcdate.getText();  //�ۼ���¥					
					DB.insertplan(pidx, ptitle, pdate, pdetail, cdate);		
					titleStored = ptitle;
					vec = DB.selectAll(vec);								
					model.setDataVector(vec, title); }
				
		}});
		 
	 	 p5 = new JPanel();
		 savebtn = new JButton("����");
		 getbackbtn = new JButton("���");
		 p5.add(savebtn);
		 p5.add(getbackbtn);		 
		 p1.add(p5);
		 
		 savebtn.addActionListener(this);
		 getbackbtn.addActionListener(this);
		 
		 add(p1, BorderLayout.CENTER);
		 setVisible(true);
		
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==savebtn) {
			String pidx = tfpidx.getText();
			String ptitle = tfptitle.getText(); //Ÿ��Ʋ
			String pdate = tfpdate.getText();   //��¥
			String pdetail = tfpdetail.getText();  //����
			String cdate = tfcdate.getText();  //�ۼ���¥
			//������ ������ ����� ���� �����ͺ��̽��� insert
			DB.insertplan(pidx, ptitle, pdate, pdetail, cdate);
			//�ű� ����� �����͸� �����ͺ��̽����� �ٽ� �о�ͼ� result ���Ϳ� ����
			//vec = DB.selectAll();			
			//����� ������(����)�� �� ��� -> ���̺� ǥ�� ���ŵ�
			//model.setDataVector(vec, title);			
			dispose();
			 
		}else if(obj==getbackbtn);
			dispose();			
			
	 }
	public String getTitle() {
		return titleStored;
	}

	
	public static void main(String[] args) {
		new addplan();
	}

	
}
