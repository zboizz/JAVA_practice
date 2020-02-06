package ch17;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableEx01 extends JFrame{
	
	
	String columnNames[] = { "상품번호", "상품이름", "상품가격", "상품설명" };
	Object rowData[][] = { { 1, "맛동산", 100, "오리온" },  //2차배열
	                                      { 2, "아폴로", 200, "불량식품" }, 
	                                      { 3, "칸쵸코", 300, "과자계의 레전드" } };
	
	JTable jt; 	//swing 추가
	
	
	public JTableEx01() {
	setTitle("JTable 예제1");
	setSize(40,200);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	jt = new JTable(rowData, columnNames); 
	JScrollPane jc = new JScrollPane(jt); //swing 추가	
	add(jc);
	
	
	pack();
	setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new JTableEx01();
	}
}
