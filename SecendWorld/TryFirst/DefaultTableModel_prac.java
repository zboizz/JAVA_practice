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
	
	
	String a[] = { "��ǰ��ȣ", "��ǰ�̸�", "��ǰ����", "��ǰ����" };
	Object b[][] = { { 1, "������", 100, "��������" },  //2���迭
	                                      { 2, "������", 200, "����" }, 
	                                      { 3, "ĭ����", 300, "���ݷ�" } };
	
	JTable jt; 	//swing �߰�
		
	public DefaultTableModel_prac() {
	setTitle("JTable ����1");
	setSize(500,500);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	DefaultTableModel dtm = new DefaultTableModel(b, a);
	jt = new JTable(dtm);
	
	JScrollPane jc = new JScrollPane(jt); //swing �߰�	
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
		System.out.println("����");
	else
		System.out.println("����");
	

	
	
}



}
