package TryThird;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.sql.Connection;
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

public class Listplan extends JFrame implements ActionListener{

	private static final long serialVersionUID=1L;
	@SuppressWarnings("rawtypes")
	private Vector data, title = null;
	@SuppressWarnings("rawtypes")	
	private JTable table = null;	
	private addplan addplan;
	private DefaultTableModel model = null;
	private JButton btnAdd,btnDel,btnUpd =null, btnExit;	
	private JTextField tfpidx, tfptitle, tfpdate, tfpdetail, tfcdate = null;
	private JLabel lblptitle, lblpdate, lblpdetail = null;
	private JPanel p1, p2, p3, p4, p5;
	
	private String url = "jdbc:mysql://127.0.0.1:3306/mydb?useUnicode=true&characterEncoding=EUC_KR";
	private String user = "root";
	private String password = "root";	
	
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement pstmtAdd, pstmtDel;
	DBplan DB;
	
	public Listplan() {		
		DB=new DBplan();
		setTitle("추가화면");
		setSize(500,300);	
		//DB.preDbTreatment();
		tfpidx = new JTextField(3);
		data = new Vector<>();		
		title = new Vector<>();
		
		title.add("번호");   title.add("타이틀"); title.add("날짜");
		title.add("내용");   title.add("작성날짜");
		
		model = new DefaultTableModel();
		Vector result = DB.selectAll(data);
		model.setDataVector(result, title);
		table = new JTable(model);
		
		JScrollPane sp = new JScrollPane(table);
		
		JPanel panel = new JPanel();
		btnAdd=new JButton("추가");	btnUpd=new JButton("수정");	
		btnDel=new JButton("삭제");	btnExit=new JButton("나가기");			
		
		panel.add(btnAdd);	panel.add(btnUpd);	panel.add(btnDel);	panel.add(btnExit);
		
		Container c = getContentPane();
		c.add(sp, BorderLayout.CENTER);
		c.add(panel, BorderLayout.SOUTH);
		
		btnAdd.addActionListener(this);		btnUpd.addActionListener(this);
		btnDel.addActionListener(this);		btnExit.addActionListener(this);
		 		
		setVisible(true);
	}	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		//if(e.getSource()==btnAdd) addplan = new addplan();
		if(obj==btnAdd) new addplan();
		else if(e.getSource()==btnUpd){}
		else if(e.getSource()==btnDel){ 
			String pidx = tfpidx.getText();
			//String ptitle = addplan.getTitle();			
			DB.deleteplan(pidx);
			Vector result = DB.selectAll(data);
			model.setDataVector(result, title);
		}
		else if(obj==btnExit) dispose(); 
	}	
	
	public static void main(String[] args) {
		new Listplan();
	}	
}
