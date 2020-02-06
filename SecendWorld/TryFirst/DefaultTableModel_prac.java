package TryFirst;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class DefaultTableModel_prac extends JFrame implements ActionListener{
	
	JTextField search;
	
	
	String a[] = { "상품번호", "상품이름", "상품가격", "상품설명" };
	Object b[][] = { { 1, "맛동산", 100, "봉지과자" },  //2차배열
	                                      { 2, "아폴로", 200, "간식" }, 
	                                      { 3, "칸쵸코", 300, "초콜렛" } };
	
	JTable jt; 	//swing 추가
		
	public DefaultTableModel_prac() {
	setTitle("JTable 예제1");
	setSize(500,500);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	DefaultTableModel dtm = new DefaultTableModel(b, a);
	jt = new JTable(dtm);
	
	JScrollPane jc = new JScrollPane(jt); //swing 추가	
	add(jc);
		
	setVisible(true);
	
	Object str =dtm.getValueAt(0,3); 
	System.out.println(str);
	
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	
public static void main(String[] args) {
	new DefaultTableModel_prac();
	
	String str = "apple";
	if(str.contains("e"))
		System.out.println("존재");
	else
		System.out.println("ㄴㄴ");
	

	
	
}



}
