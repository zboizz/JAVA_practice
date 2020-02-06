package TryThird;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;



public class updateplan extends JFrame implements ActionListener{
	
	private Vector data, title = null;
	private DefaultTableModel model = null;
	private JTextField tfptitle, tfpdate, tfpdetail, tfcdate = null;
	private JLabel lblptitle, lblpdate, lblpdetail, lblcdate = null;
	private JPanel p1, p2, p3, p4, p5;
	private JButton upgradebtn, getbackbtn;
	DBplan DB;
	
public updateplan() {
	

	tfptitle = new JTextField(10);	tfpdate = new JTextField(10);
	tfpdetail = new JTextField(20);	tfcdate = new JTextField(20);
	//레이블 생성
	lblptitle = new JLabel("타이틀");	lblpdate = new JLabel("날짜");
	lblpdetail = new JLabel("내용");	lblcdate = new JLabel("작성날짜");
	
	DB= new DBplan();
	
	//버튼 생성			
	setTitle("수정화면");
	setSize(400,400);
	
	 p1 = new JPanel();
	 p1.setLayout(new GridLayout(4,1));
	 p2 = new JPanel();
	 p2.add(lblptitle);	 p2.add(tfptitle);
	 p1.add(p2);
	 
	 p3=new JPanel();
	 p3.add(lblpdate); p3.add(tfpdate);
	 p1.add(p3);
	
	 p4=new JPanel();
	 p4.add(lblpdetail); p4.add(tfpdetail);
	 p1.add(p4);
	 
 	 p5 = new JPanel();
	 upgradebtn = new JButton("저장");
	 getbackbtn = new JButton("취소");
	 p5.add(upgradebtn); p5.add(getbackbtn);		 
	 p1.add(p5);
	 
	 upgradebtn.addActionListener(this); getbackbtn.addActionListener(this);
	 
	 add(p1, BorderLayout.CENTER);
	 setVisible(true);
	 
	}
@Override
public void actionPerformed(ActionEvent e) {
	String ptitle = tfptitle.getText();
	String pdate = tfptitle.getText();
	String pdetail = tfptitle.getText();

	DB.updateplan(ptitle, pdate, pdetail);
	Vector result = DB.selectAll();
	model.setDataVector(result, title);
}	
	public static void main(String[] args) {
		new updateplan();
	}	
}
