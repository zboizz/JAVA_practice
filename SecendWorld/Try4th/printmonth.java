package Try4th;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class printmonth extends JFrame implements ActionListener{
	JTable table;
	JPanel p1, p2;
	JTextField tf1, tf2, tf3;
	JButton btn1;
	private Vector title=null;
	Vector<ScheduleBean> vtable;	
	ScheduleMgr mgr;
	JScrollPane sp;	
	int idx;
	private DefaultTableModel model = null;
	
	public printmonth() {
	setSize(500,500);	
	p1 = new JPanel();
	tf1 = new JTextField(10);
	tf2 = new JTextField(10);
	btn1 = new JButton("검색");	
	btn1.addActionListener(this);
	p1.add(tf1); p1.add(tf2);
	p1.add(btn1);
	
	add(p1,BorderLayout.PAGE_END);	
	setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==btn1) {		
			ScheduleBean bean = new ScheduleBean();			
			vtable = new Vector<ScheduleBean>();
			
			String a = tf1.getText().trim();
			System.out.println(a);
			String b = tf2.getText().trim();
			System.out.println(b);
			
			mgr = new ScheduleMgr();
			title = new Vector<>();
			vtable = mgr.printMonth2(a,b);
			
			title.add("번호");
			title.add("타이틀");
			title.add("날짜");
			title.add("세부내용");			
			
			DefaultTableModel model = new DefaultTableModel(title,0);
			
			for (int i = 0; i < vtable.size(); i++) {
				bean = vtable.get(i);
				Vector<Object> tt = new Vector<Object>();
				tt.add(bean.getpidx());
				tt.add(bean.getptitle());
				tt.add(bean.getpdate());
				tt.add(bean.getpdetail());
				model.addRow(tt);
			}
			p2 = new JPanel();
			table = new JTable(model);
			sp = new JScrollPane(table);
			p2.add(sp);
			add(p2,BorderLayout.CENTER);
			setVisible(true);
			repaint();
			validate();
		}			
	}	
	public static void main(String[] args) {
		new printmonth();
	}	
}
