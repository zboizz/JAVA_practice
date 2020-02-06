package ch17;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableEx02 extends JFrame{
	
	
	String columnNames[] = { "상품번호", "상품이름", "상품가격", "상품설명" };
	Object rowData[][] = { { 1, "맛동산", 100, "오리온" },  //2차배열
	                                      { 2, "아폴로", 200, "불량식품" }, 
	                                      { 3, "칸쵸코", 300, "과자계의 레전드" } };
	
	JTable jt; 	//swing 추가
	
	
	public JTableEx02() {
	setTitle("JTable 예제1");
	setSize(40,200);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	DefaultTableModel dtm = new DefaultTableModel(rowData, columnNames);
	
	
	jt = new JTable(dtm); 
	
	//줄 한줄 추가	
	Object tempObj[] = {4, "초코송이", 500, "식품계의 절대강자"}; //추가
	dtm.addRow(tempObj);
	
	
	//행과 열 갯수 구하기
	System.out.println(dtm.getRowCount());
	System.out.println(dtm.getColumnCount());
	
	//첫번째 값을 가져온다.
	System.out.println(dtm.getColumnName(0));
	
	//첫번째 행을 삭제
	dtm.removeRow(0);
	
	//셀의 값을 가져온다.
	System.out.println(dtm.getValueAt(2, 2));
	
	//테이블에 Row를 미리 선택
	jt.setRowSelectionInterval(1, 1);
	
	
	//셀의 크기를 조절
	jt.getColumnModel().getColumn(0).setPreferredWidth(20);
	jt.getColumnModel().getColumn(3).setPreferredWidth(200);
	
	JScrollPane jc = new JScrollPane(jt); //swing 추가	
	add(jc);
	
	
	pack();
	setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new JTableEx02();
	}
}
