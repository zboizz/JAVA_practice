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
	  file = new Menu("파일");
	  edit = new Menu("편집");
	  file.add("새파일");
		file.add("열기");
		file.addSeparator();
		file.add("저장");
		file.add("새이름으로 저장");
		file.addSeparator();
		file.add("인쇄");
		file.add("종료");
		
		edit.add("취소");
		edit.add("복사");
		edit.add("잘라내기");
		edit.add("붙여넣기");
	  
	  
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
		pm.add("실행취소");
		pm.add("되돌리기");
		pm.addSeparator();
		pm.add("복사");
		pm.add("잘라내기");
		pm.add("붙여넣기");
		pm.addSeparator();
		pm.add("모두선택");
		pm.add("속성");
		pm.add("종료");
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
			//System.out.println(cmd); //클릭한 값이 콘솔창에 입력되게, 
			if(cmd.equals("복사")) {
				ta.append("MyEdit1.0");
			}
			}
		});
	}
	
	public static void main(String[] args) {
		new NotepadEx01();
	}
	
	
}
