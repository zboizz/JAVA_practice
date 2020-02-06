	package TryFirst;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class DBList extends JFrame implements ActionListener {

	JLabel label;
	Vector<planBean> vlist;
	DBMgr mgr;
	List list;
	JPanel panel;
	private int deleteIndex=0;
	
	public DBList() {
	setTitle("Ω∫ƒ…¡Ï ∏Ò∑œ");
	//setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(300,400);
	label = new JLabel();
	panel = new JPanel();
	mgr= new DBMgr();
	label.setOpaque(true);
	label.setText("Title                  Date                          Hashtag");
	label.setBackground(Color.white);
	panel.add(label);
	add(panel, BorderLayout.NORTH);
	viewList();
	add(list);
	
	addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			dispose();
		}
	});
	
	setVisible(true);	
	}
	public int getDeleteIdx() {
		return deleteIndex; 
		}
	public void setDeleteIdx(int a) {
		this.deleteIndex = a-1;
		if(a==0) {
			this.deleteIndex=0;
		}
	}
	public void viewList() {

		vlist = mgr.listplan();
		
		int deletIdxCheck = 0;
		list = new List(vlist.size(),false);
		for (int i = 0; i < vlist.size(); i++) {
			planBean bean = vlist.get(i);
			String s = (i+1)+"     ";
			s+=bean.gettitle()+"                     ";
			s+=bean.getplanningDate()+"              ";
			s+=bean.gethashTag();
			list.add(s);		
		}
		add(list, BorderLayout.CENTER);
		deletIdxCheck = getDeleteIdx();
		if(list.getItemCount()>0)
			list.select(deletIdxCheck);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	}
	
	public static void main(String[] args) {
		new DBList();
	}

	
}
