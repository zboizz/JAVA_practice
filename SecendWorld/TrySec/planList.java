package TrySec;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class planList extends JFrame implements ActionListener {
	private planAdd plan;
	
	private static final long serialVersionUID=1L;
	@SuppressWarnings("rawtypes")
	private Vector data, title = null;
	@SuppressWarnings("rawtypes")	
	private JTable table = null;	
	private DefaultTableModel model = null;
	private JButton btnAdd,btnDel =null, btnExit;	
	private JTextField tfptitle, tfpdate, tfpdetail = null;
	private JLabel lblptitle, lblpdate, lblpdetail = null;
	
	private String url = "jdbc:mysql://127.0.0.1:3306/mydb?useUnicode=true&characterEncoding=EUC_KR";
	private String user = "root";
	private String password = "root";
	
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement pstmtAdd, pstmtDel = null;
	
	
	private JLabel label;
	private JPanel p1, p2, p3, p4, p5;
	
	
	public planList() {
	
		
	setSize(500,500);	
	preDbTreatment();
	
	data = new Vector<>();
	
	title = new Vector<>();
	
	title.add("타이틀");
	title.add("날짜");
	title.add("내용");
	
	model = new DefaultTableModel();
	Vector result = selectAll();
	model.setDataVector(result, title);
	table = new JTable(model);
	JScrollPane sp = new JScrollPane(table);
	table.addMouseListener(new MouseAdapter() {
	
		@Override
		public void mouseClicked(MouseEvent e) {
			
			//getSelectedRow(): 테이블에서 선택된 줄의 값을 가지고 오는 메소드
			int index = table.getSelectedRow();
			Vector in =(Vector) data.get(index);
			
			
			String ptitle = (String)in.get(0);
			System.out.println(ptitle);
			String pdate = (String)in.get(1);
			System.out.println(pdate);
			String pdetail = (String)in.get(2);
			System.out.println(pdetail);
			
			tfptitle.setText(ptitle);
			tfpdate.setText(pdate);
			tfpdetail.setText(pdetail);
			
			tfptitle.setEditable(false);
		}
	
	
	});
	//값을 입력받거나 표시할 텍스트 필드 생성
	
	tfptitle = new JTextField(10);
	tfpdate = new JTextField(10);
	tfpdetail = new JTextField(20);
	//레이블 생성
	lblptitle = new JLabel("타이틀");
	lblpdate = new JLabel("날짜");
	lblpdetail = new JLabel("내용");
	//버튼 생성
	JPanel panel = new JPanel();
	btnAdd =new JButton("추가");
	btnDel =new JButton("삭제");
	btnExit = new JButton("나가기");
		
	btnExit.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	});
	btnAdd.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			callPlan();
		}		
	});
	
	btnDel.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
		
		String ptitle = tfptitle.getText();
		delete(ptitle);
		
		Vector result = selectAll();
		model.setDataVector(result, title);
		
		}
	});
		panel.add(btnExit);
		panel.add(btnAdd);
		panel.add(btnDel);
		
		//Frame의 contentPane 컨테이너 가져오기
		Container c = getContentPane();
		
		//c.add(new JLabel("젭알 되기를.....", JLabel.CENTER),"CENTER");
		c.add(sp, BorderLayout.CENTER);
		c.add(panel, BorderLayout.SOUTH);
		
		//프레임 종료시 처리될 이벤트 처리
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent w) {
				try {
					stmt.close();	//statement 객체 닫기
					conn.close();	//connection 객체닫기
					
					setVisible(false); //화면닫기
					dispose(); //자원반납
					System.exit(0); //종료처리
				}catch(Exception e) {
					
				}
			}
		});
	setVisible(true);
	}
	
	
	//데이터베이스에서 검색된 데이터를 data Vector에 담아 리턴
	private Vector selectAll() {

		data.clear();
		
		try {
			ResultSet rs = stmt.executeQuery("select ptitle, pdate, pdetail from plan2 order by idx");
			
			while(rs.next()) {
				Vector in = new Vector<String>();
				String ptitle = rs.getString(1);
				String pdate = rs.getString(2);
				String pdetail = rs.getString(3);
				System.out.println(pdetail);
				
				in.add(ptitle);
				in.add(pdate);
				in.add(pdetail);
				
				data.add(in);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
		
	}
	
	//각각의 텍스트필드에 입력된 값을 파라미터로 받아서 데이터 베이스에 insert 처리하는 메소드
	private void insert(String ptitle, String pdate, String pdetail) {
		try {
			
			//preparedStatement 생성 -> conn은 preDBTreatment() 메소드를 통해 생성되어 있음
			pstmtAdd = conn.prepareStatement("insert into plan2(ptitle,pdate,pdetail) values(?,?,?)");
			pstmtAdd.setString(1, ptitle);
			pstmtAdd.setString(2, pdate);
			pstmtAdd.setString(3, pdetail);
			
			//대입받은 쿼리를 실행 => 입력(insert)
			pstmtAdd.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		private void delete(String ptitle) {
			try {
				pstmtDel = conn.prepareStatement("delete from plan2 where ptitle =?");
				
				//title 값을 비교해서 삭제함
				pstmtDel.setString(1, ptitle);
				pstmtDel.executeUpdate();
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	
	private void preDbTreatment() {

		try{

			//Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(url,user,password);

			stmt = conn.createStatement();

		}catch(Exception e){

			e.printStackTrace();

		}
		
		//창을 꺼도 메인프레임이 꺼지지않게
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});	
	}
	public void callPlan() {		
		plan = new planAdd();
	}
	

	public static void main(String[] args) {
		new planList();
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
	}		
	
}

class planAdd extends JFrame implements ActionListener {
private planAdd plan;
	
	private static final long serialVersionUID=1L;
	@SuppressWarnings("rawtypes")
	private Vector data, title = null;
	@SuppressWarnings("rawtypes")	
	private JTable table = null;	
	private DefaultTableModel model = null;
	private JButton btnAdd,btnDel =null, btnExit;	
	private JTextField tfptitle, tfpdate, tfpdetail = null;
	private JLabel lblptitle, lblpdate, lblpdetail = null;
	
	private String url = "jdbc:mysql://127.0.0.1:3306/mydb?useUnicode=true&characterEncoding=EUC_KR";
	private String user = "root";
	private String password = "root";
	
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement pstmtAdd, pstmtDel = null;
	
	
	private JLabel label;
	private JPanel p1, p2, p3, p4, p5;
	
	
	//private DefaultTableModel model = null;
	//private Vector data, title = null;
	private boolean continueInput = false;
	private JButton savebtn, getbackbtn;		
	
	 public planAdd() {
	

			tfptitle = new JTextField(10);
			tfpdate = new JTextField(10);
			tfpdetail = new JTextField(20);
			//레이블 생성
			lblptitle = new JLabel("타이틀");
			lblpdate = new JLabel("날짜");
			lblpdetail = new JLabel("내용");
			//버튼 생성
			JPanel panel = new JPanel();
			btnAdd =new JButton("추가");
			btnDel =new JButton("삭제");
			btnExit = new JButton("나가기");
			
		 setTitle("추가화면");
		 setSize(500,500);
		 p1 = new JPanel();
		 p1.setLayout(new GridLayout(4,1));
		 //continueInput = false;			 
		 
		 p2 = new JPanel();
		 p2.add(lblptitle);
		 p2.add(tfptitle);
		 p1.add(p2);
		 
		 p3=new JPanel();
		 p3.add(lblpdate);
		 p3.add(tfpdate);
		 p1.add(p3);
		
		 p4=new JPanel();
		 p4.add(lblpdetail);
		 p4.add(tfpdetail);
		 p1.add(p4);
		 
	 	 p5 = new JPanel();
		 savebtn = new JButton("저장");
		 getbackbtn = new JButton("취소");
		 p5.add(savebtn);
		 p5.add(getbackbtn);
		 p1.add(p5);
		 
		 
		 savebtn.addActionListener(this);
		 getbackbtn.addActionListener(this);
		 
		 add(p1, BorderLayout.CENTER);
		 
		//p4.add(savebtn);
		//p4.add(getbackbtn);
		 
		 //add(p1,BorderLayout.NORTH);
		 			 
		// add(p4,BorderLayout.PAGE_END);
		 
		 setVisible(true);
		 
		 /*addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					dispose();
				}
			});*/
		 
	 }
		 	
		 
		 @Override
			public void actionPerformed(ActionEvent e) {
					Object obj = new Object();
					System.out.println(obj);
			if(e.getSource()==savebtn) {
				String ptitle = tfptitle.getText(); //타이틀
				String pdate = tfpdate.getText();   //날짜
				String pdetail = tfpdetail.getText();  //내용
				//각각의 변수에 저장된 값을 데이터베이스에 insert
				insert(ptitle, pdate, pdetail);
				//신규 저장된 데이터를 데이터베이스에서 다시 읽어와서 result 벡터에 저장
				Vector result = selectAll();
				//변경된 데이터(벡터)로 모델 경신 -> 테이블 표시 갱신됨
				model.setDataVector(result, title);
				
				 
			}else if(obj==getbackbtn);
				plan.dispose();
				
				
		 }
			private void insert(String ptitle, String pdate, String pdetail) {
				try {
					
					//preparedStatement 생성 -> conn은 preDBTreatment() 메소드를 통해 생성되어 있음
					pstmtAdd = conn.prepareStatement("insert into plan2(ptitle,pdate,pdetail) values(?,?,?)");
					pstmtAdd.setString(1, ptitle);
					pstmtAdd.setString(2, pdate);
					pstmtAdd.setString(3, pdetail);
					
					//대입받은 쿼리를 실행 => 입력(insert)
					pstmtAdd.executeUpdate();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
				private void delete(String ptitle) {
					try {
						pstmtDel = conn.prepareStatement("delete from plan2 where ptitle =?");
						
						//title 값을 비교해서 삭제함
						pstmtDel.setString(1, ptitle);
						pstmtDel.executeUpdate();
						
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				private Vector selectAll() {

					data.clear();
					
					try {
						ResultSet rs = stmt.executeQuery("select ptitle, pdate, pdetail from plan2 order by idx");
						
						while(rs.next()) {
							Vector in = new Vector<String>();
							String ptitle = rs.getString(1);
							String pdate = rs.getString(2);
							String pdetail = rs.getString(3);
							
							in.add(ptitle);
							in.add(pdate);
							in.add(pdetail);
							
							data.add(in);
						}
						
						
						
					} catch (Exception e) {
						e.printStackTrace();
					}
					return data;
					
				}
		
	}	

	
