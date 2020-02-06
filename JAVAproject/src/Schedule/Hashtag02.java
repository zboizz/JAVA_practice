package Schedule;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Hashtag02 extends JFrame implements ActionListener {

	JTable table;
	JTextField tfDate, tfImportance, tfTitle, tfHashtag;
	
	
	public Hashtag02() {
	setTitle("해시태그 검색");
	setSize(800,400);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	String[] colName = {"Date","Importance","Title","Hashtag"};
	DefaultTableModel model = new DefaultTableModel(colName, 0);
	
	JPanel p1 = new JPanel();
	table = new JTable(model);
	add(new JScrollPane(table));//스크롤 추가
	
	JButton botton_1Add = new JButton("추가");
	JButton botton_2Remove = new JButton("삭제");
	
	p1.add(new JLabel("Date"));
	tfDate = new JTextField(10);
	p1.add(tfDate);
	
	p1.add(new JLabel("Importance"));
	tfImportance = new JTextField(3);
	p1.add(tfImportance);
	
	p1.add(new JLabel("Title"));
	tfTitle = new JTextField(10);
	p1.add(tfTitle);
	
	p1.add(new JLabel("HashTag"));
	tfHashtag = new JTextField(10);
	p1.add(tfHashtag);
	
	
	
	
	p1.add(botton_1Add);
	p1.add(botton_2Remove);
	add(p1, BorderLayout.SOUTH);
	setVisible(true);
	
	botton_1Add.addActionListener(this);
	botton_2Remove.addActionListener(this);
	
	table.addMouseListener(new MouseListener() {
		@
		Override
		public void mouseReleased(MouseEvent e) {
			int row = table.getSelectedRow();
			TableModel model = table.getModel();
			tfDate.setText(model.getValueAt(row, 0).toString());
			tfImportance.setText(model.getValueAt(row, 1).toString());
			tfTitle.setText(model.getValueAt(row, 2).toString());
			tfHashtag.setText(model.getValueAt(row, 3).toString());
						
		}
		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println(table.getSelectedRow());
		}
		@Override
		public void mouseEntered(MouseEvent e) {}
		@Override
		public void mouseExited(MouseEvent e) {}
		@Override
		public void mousePressed(MouseEvent e) {}
	});
	
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if(command.equals("추가")) {
			String[] arr = new String[4];
			arr[0] = tfDate.getText();
			arr[1] = tfImportance.getText();
			arr[2] = tfTitle.getText();
			arr[3] = tfHashtag.getText();
			DefaultTableModel model = (DefaultTableModel)table.getModel();
			model.addRow(arr);
			init();//초기화
			
			System.out.println("---추가---");
			TableModel tMmodel = table.getModel();
			int rowCnt = tMmodel.getRowCount();
			int colCnt = tMmodel.getColumnCount();
			
			for (int i = 0; i < colCnt; i++) {
				System.out.print("["+tMmodel.getColumnName(i)+"]"+"\t");
			}System.out.println();
			for (int i = 0; i < rowCnt; i++) {
				for (int j = 0; j < colCnt; j++) {
					System.out.println(tMmodel.getValueAt(i, j)+"\t");					
				}System.out.println();
				
			}
		}else if(command.equals("삭제")) {
			System.exit(0);
		}
	}
	private void init(){
		tfDate.setText("");
		tfImportance.setText("");
		tfTitle.setText("");
		tfHashtag.setText("");
	}
	
	public static void main(String[] args) {
		new Hashtag02();
	}
}
