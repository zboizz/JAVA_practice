package ch17;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableEx01 extends JFrame{
	
	
	String columnNames[] = { "��ǰ��ȣ", "��ǰ�̸�", "��ǰ����", "��ǰ����" };
	Object rowData[][] = { { 1, "������", 100, "������" },  //2���迭
	                                      { 2, "������", 200, "�ҷ���ǰ" }, 
	                                      { 3, "ĭ����", 300, "���ڰ��� ������" } };
	
	JTable jt; 	//swing �߰�
	
	
	public JTableEx01() {
	setTitle("JTable ����1");
	setSize(40,200);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	jt = new JTable(rowData, columnNames); 
	JScrollPane jc = new JScrollPane(jt); //swing �߰�	
	add(jc);
	
	
	pack();
	setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new JTableEx01();
	}
}
