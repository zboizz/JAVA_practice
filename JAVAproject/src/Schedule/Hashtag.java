package Schedule;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.util.Vector;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Hashtag extends MFrame {
	
	JTable table = null;
	String []a = {"Date","Importance","Title","Hashtag"};
    String [][]b = {{"2019.10.7","A","ȸ������","#ȸ��"},
                    {"2019.10.7","B","������Ƽ","#ģ��"},
                    {"2019.10.7","C","�ٳѱ� 100��","#�"},
                    {},
                    {},
                    {},
                    {},
    				};
	TableModel model;
	JScrollPane scroll;
	Vector val;
	
	
	public Hashtag() {
		setTitle("�ؽ��±� �˻�");		
		setLayout(new BorderLayout());
		Panel p1, p2;
		
		
	DefaultTableModel model = new DefaultTableModel(b,a);
	
	
	JTable table = new JTable(model);
	JScrollPane sc = new JScrollPane(table);
	
	
	DefaultTableModel m = (DefaultTableModel)table.getModel();
	//m.insertRow(1, new Object[] {"d1","d2","d3"});
	table.updateUI();
	
	add(sc);
	setBounds(0,0,500,400);
	setVisible(true);
	
	
		
		/*model = new DefaultTableModel(val, colName);
	table = new JTable(model);
	table.setBackground(Color.DARK_GRAY);
	table.setSize(100,50);
	
	scroll = new JScrollPane(table);
	scroll = setPreferredSize(new Dimension(470,250));
	
	*/
	}	
	
	
	
	public static void main(String[] args) {
		new Hashtag();
	}
}
