package ch17;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableEx02 extends JFrame{
	
	
	String columnNames[] = { "��ǰ��ȣ", "��ǰ�̸�", "��ǰ����", "��ǰ����" };
	Object rowData[][] = { { 1, "������", 100, "������" },  //2���迭
	                                      { 2, "������", 200, "�ҷ���ǰ" }, 
	                                      { 3, "ĭ����", 300, "���ڰ��� ������" } };
	
	JTable jt; 	//swing �߰�
	
	
	public JTableEx02() {
	setTitle("JTable ����1");
	setSize(40,200);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	DefaultTableModel dtm = new DefaultTableModel(rowData, columnNames);
	
	
	jt = new JTable(dtm); 
	
	//�� ���� �߰�	
	Object tempObj[] = {4, "���ڼ���", 500, "��ǰ���� ���밭��"}; //�߰�
	dtm.addRow(tempObj);
	
	
	//��� �� ���� ���ϱ�
	System.out.println(dtm.getRowCount());
	System.out.println(dtm.getColumnCount());
	
	//ù��° ���� �����´�.
	System.out.println(dtm.getColumnName(0));
	
	//ù��° ���� ����
	dtm.removeRow(0);
	
	//���� ���� �����´�.
	System.out.println(dtm.getValueAt(2, 2));
	
	//���̺� Row�� �̸� ����
	jt.setRowSelectionInterval(1, 1);
	
	
	//���� ũ�⸦ ����
	jt.getColumnModel().getColumn(0).setPreferredWidth(20);
	jt.getColumnModel().getColumn(3).setPreferredWidth(200);
	
	JScrollPane jc = new JScrollPane(jt); //swing �߰�	
	add(jc);
	
	
	pack();
	setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new JTableEx02();
	}
}
