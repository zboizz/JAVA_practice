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
		//레이블 생성
		lblptitle = new JLabel("타이틀");
		lblpdate = new JLabel("날짜");
		lblpdetail = new JLabel("내용");
		lblcdate = new JLabel("작성날짜");
		
		DB= new DBplan();
		
		//버튼 생성			
		
		setTitle("추가화면");
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
					System.out.println("입력 시작");
					String pidx = tfpidx.getText();
					String ptitle = tfptitle.getText(); //타이틀
					String pdate = tfpdate.getText();   //날짜
					String pdetail = tfpdetail.getText();  //내용
					String cdate = tfcdate.getText();  //작성날짜					
					DB.insertplan(pidx, ptitle, pdate, pdetail, cdate);		
					titleStored = ptitle;
					vec = DB.selectAll(vec);								
					model.setDataVector(vec, title); }
				
		}});
		 
	 	 p5 = new JPanel();
		 savebtn = new JButton("저장");
		 getbackbtn = new JButton("취소");
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
			String ptitle = tfptitle.getText(); //타이틀
			String pdate = tfpdate.getText();   //날짜
			String pdetail = tfpdetail.getText();  //내용
			String cdate = tfcdate.getText();  //작성날짜
			//각각의 변수에 저장된 값을 데이터베이스에 insert
			DB.insertplan(pidx, ptitle, pdate, pdetail, cdate);
			//신규 저장된 데이터를 데이터베이스에서 다시 읽어와서 result 벡터에 저장
			//vec = DB.selectAll();			
			//변경된 데이터(벡터)로 모델 경신 -> 테이블 표시 갱신됨
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
