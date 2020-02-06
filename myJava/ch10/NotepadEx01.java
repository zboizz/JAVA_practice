package ch10;

import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.PopupMenu;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class NotepadEx01 extends MFrame {

	PopupMenu pm;
	MenuBar bar;
	Menu file, edit;
	TextArea ta;
	
  public NotepadEx01() {
	  super(500,500);
	  setTitle("MyEdit1.0");
	  bar = new MenuBar();
	  file = new Menu("����");
	  edit = new Menu("����");
	  file.add("������");
		file.add("����");
		file.addSeparator();
		file.add("����");
		file.add("���̸����� ����");
		file.addSeparator();
		file.add("�μ�");
		file.add("����");
		
		edit.add("���");
		edit.add("����");
		edit.add("�߶󳻱�");
		edit.add("�ٿ��ֱ�");
	  
	  
	//-----------------------------------
  
	//-----------------------------------
  	 bar.add(file);
  	 bar.add(edit);
  	 add(ta=new TextArea());
  	 setMenuBar(bar);
     popupMenu();
	}
	
	public void popupMenu() {
		pm = new PopupMenu();
		pm.add("�������");
		pm.add("�ǵ�����");
		pm.addSeparator();
		pm.add("����");
		pm.add("�߶󳻱�");
		pm.add("�ٿ��ֱ�");
		pm.addSeparator();
		pm.add("��μ���");
		pm.add("�Ӽ�");
		pm.add("����");
		add(pm);
		ta.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(e.getButton()==3) {
					pm.show(e.getComponent(), e.getX(), e.getY());
				}
			}
		});
		pm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			//System.out.println(cmd); //Ŭ���� ���� �ܼ�â�� �Էµǰ�, 
			if(cmd.equals("����")) {
				ta.append("MyEdit1.0");
			}
			}
		});
	}
	
	public static void main(String[] args) {
		new NotepadEx01();
	}
	
	
}
