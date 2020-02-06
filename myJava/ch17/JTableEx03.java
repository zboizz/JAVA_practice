package ch17;

import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

public class JTableEx03 extends JFrame 
implements TableModelListener, ListSelectionListener{
	//ListSelectionListener�� ���Ͽ� ���� �ٽ� ���ƿ��� �̺�Ʈ�� ����
	String colName[] ={"�̸�","�ּ�","����","���Կ���"};
	String citys[] = {"����","��õ","����","�뱸","�λ�","����"};
	Object data[][] = {
			{"�̿��� ","����",28, false},
			{"��ä��  ","��õ",30, false},
			{"���� ","�λ�",24, true}};
	JTable jt;
	
	Object age; //Ŀ���� ������ �־��� ������ �����ϴ� ����

	public JTableEx03() {
		setTitle("JTable ����3");
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jt = new JTable(data, colName);
		
		jt.getModel().addTableModelListener(this);
		
		jt.getSelectionModel().addListSelectionListener(this); 
		//getSelectionModel()�� �ִ�, ���� ���� �ɶ� ȣ��Ǵ� �̺�Ʈ ����
		
		jt.setAutoCreateRowSorter(true); //sorter:����, ��������/������������ ������ ������
		
		//ǥ���� �ִ� ���ø� ���� ����
		JComboBox combo = new JComboBox(citys);
		TableColumn city = jt.getColumnModel().getColumn(1); //�ݸ��� ù��° ���� �����´�.
		city.setCellEditor(new DefaultCellEditor(combo));
		
		JScrollPane jc = new JScrollPane(jt);
		add(jc);
		setVisible(true);
	}
	
	
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
	age = jt.getValueAt(jt.getSelectedRow(), 2).toString();
	//System.out.println("age: " + age); //Ŭ���ߴ� ���� ���ڰ� �ܼ�â�� ��µ�
	}
	
	
	
	@Override
	public void tableChanged(TableModelEvent e) {
		int row = e.getFirstRow();
		int column = e.getColumn(); 	//���� ������������ ����
		//System.out.println(row + ":" + column);
		
		if(column==2) {
			TableModel md = (TableModel)e.getSource(); //TableModel swing �߰�						
			String data = (String)md.getValueAt(row,column); //���� ������
			if(Integer.parseInt(data)>100) {
				JOptionPane.showMessageDialog(this, "������ �ʰ��ϼ̽��ϴ�." + data,"���", JOptionPane.WARNING_MESSAGE);				
				//������ ��� �ְ� ���ڴ� �״�� �Է��� ��
				md.setValueAt(age, row, column);
				//100���� ū ���� �ԷµǸ� �� ���� ������ ���ư��� ����
				
				
			}
		}
	}
	
	public static void main(String[] args) {
		new JTableEx03();
	}

	
}

