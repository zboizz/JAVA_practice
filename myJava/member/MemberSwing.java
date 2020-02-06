package member;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MemberSwing extends JFrame implements ActionListener {

	JButton b1, b2, b3, b4;
	List list;
	JLabel label;
	JCheckBox ck1;
	JTextField tf1, tf2, tf3;
	JPanel p1, p2, p3, p4, p5, p6;
	JButton insBtn, upBtn;
	Vector<MemberBean> vlist;
	MemberMgr mgr;
	
	int idx;
	int updateIdx;
	boolean selectCheck = true;
	private int deleteIndex=0;
	private boolean continueInput = false;
	public MemberSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 400);
		setTitle("회원관리 프로그램");
 		mgr= new MemberMgr();
		p1 = new JPanel();
		p2 = new JPanel();
		label = new JLabel("");
		add(label, BorderLayout.PAGE_START);
		b1 = new JButton("수정");
		b2 = new JButton("삭제");
		b3 = new JButton("입력");
		b4 = new JButton("리스트");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		p1 = new JPanel();
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		add(p1, BorderLayout.PAGE_END);
		viewList();
		setVisible(true);
		//setResizable(false);
	}

	// DB에 연결해서 리스트를 List객체 add한다.
	public void viewList() {
		label.setOpaque(true);
		label.setText("NO   NAME            PHONE             TEAM");
		label.setBackground(Color.CYAN);
		vlist = mgr.listMember();
		int deleteIdxCheck = 0;
//		System.out.println(vlist.size());
		list = new List(vlist.size(), false);			//사이즈, 멀티 선택 false true
		for(int i=0; i<vlist.size(); i++) {
			//Vector에서 bean 호출
			MemberBean bean = vlist.get(i);
			String s = (i+1) + "     ";
			s+= bean.getName() + "     ";
			s+= bean.getPhone() +"     ";
			s+= bean.getTeam();
			list.add(s);
		}
		add(list, BorderLayout.CENTER);
		deleteIdxCheck = getDeleteIdx();
		if(list.getItemCount()>0)
				list.select(deleteIdxCheck);
	}

	// 회원입력폼
	public void insertForm() {
		label.setText("회원입력폼");
		label.setBackground(Color.GRAY);
		p2.setLayout(new GridLayout(4, 1));
		continueInput = false;
		p3 = new JPanel();
		p3.add(new JLabel("NAME  :"));
		tf1 = new JTextField(20);
		tf1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==10) {
					tf2.requestFocus();
				}
			}
		});
		p3.add(tf1);
		p2.add(p3);
		
		p4 = new JPanel();
		p4.add(new JLabel("PHONE  :"));
		tf2 = new JTextField(20);
		p4.add(tf2);
		p2.add(p4);
		tf2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==10) {
					tf3.requestFocus();
				}
			}
		});
		p5 = new JPanel();
		p5.add(new JLabel("TEAM  :"));
		tf3 = new JTextField(20);
		tf3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==10) {
					MemberBean bean = new MemberBean();
					System.out.println("입력 시작");
					bean.setIdx(idx);
					bean.setName(tf1.getText());
					bean.setPhone(tf2.getText());
					bean.setTeam(tf3.getText());

					mgr.insertMember(bean);
					if(continueInput==true) {
					tf1.setText("");
					tf2.setText("");
					tf3.setText("");
					tf1.requestFocus();
					}
					else {
						p2.removeAll();
						remove(p2);
						list.removeAll();
						remove(list);
						vlist.removeAllElements();
						setDeleteIdx(1);
						viewList();
						b1.setEnabled(true);
						b2.setEnabled(true);
						b3.setEnabled(true);
						selectCheck = true;
					}
				}
			}
		});
		p5.add(tf3);
		p2.add(p5);
		
		p6 = new JPanel();
		ck1 = new JCheckBox("연속 입력");
		ck1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
			System.out.println(e.getStateChange());
			if(e.getStateChange()==1) 
				continueInput=true;
			else
				continueInput=false;
			}
		});	
		p6.add(ck1);
		insBtn = new JButton("저장");
		insBtn.addActionListener(this);
		p6.add(insBtn);
		p2.add(p6);

		add(p2, BorderLayout.CENTER);
	}

	// 회원수정폼
	public void updateForm(MemberBean bean) {
		label.setText("회원수정폼");
		label.setBackground(Color.YELLOW);
		p2.setLayout(new GridLayout(4, 1));
		idx = bean.getIdx();

		p3 = new JPanel();
		p3.add(new JLabel("NAME  :"));
		tf1 = new JTextField(bean.getName(), 20);
		p3.add(tf1);
		p2.add(p3);

		p4 = new JPanel();
		p4.add(new JLabel("PHONE  :"));
		tf2 = new JTextField(bean.getPhone(), 20);
		p4.add(tf2);
		p2.add(p4);

		p5 = new JPanel();
		p5.add(new JLabel("TEAM  :"));
		tf3 = new JTextField(bean.getTeam(), 20);
		p5.add(tf3);
		p2.add(p5);

		p6 = new JPanel();
		upBtn = new JButton("수정저장");
		upBtn.addActionListener(this);
		p6.add(upBtn);
		p2.add(p6);

		add(p2, BorderLayout.CENTER);
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
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		
		
		if(obj==b1/*수정폼*/) {
			if(selectCheck==true) {
			updateIdx = vlist.get(list.getSelectedIndex()).getIdx();		
			MemberBean bean = vlist.get(list.getSelectedIndex());
//			//기존 list 저장된것 아이템 모두 삭제
			list.removeAll();
			//JFrame에 추가된 list 제거
			remove(list);
			updateForm(bean);
			b2.setEnabled(false);
			b3.setEnabled(false);
			selectCheck=false;
			}
		} else if(obj==b2/*삭제*/){
			int i =vlist.get(list.getSelectedIndex()).getIdx();
			setDeleteIdx(list.getSelectedIndex());
			//MemberBean bean = vlist.setIdx(i);로 넣어서 beangetindex로 deletemember에 저장가능
			mgr.deleteMember(i);
			p2.removeAll();
			remove(p2);
			list.removeAll();
			remove(list);
			vlist.removeAllElements();
			viewList();
		} else if(obj==b3/*입력폼*/){
			p2.removeAll();
			remove(p2);
			list.removeAll();
			remove(list);
			insertForm();
			tf1.requestFocus();
			b1.setEnabled(false);
			b2.setEnabled(false);
			selectCheck=false;
			
		}else if(obj==b4/*리스트*/) {
			p2.removeAll();
			remove(p2);
			list.removeAll();
			remove(list);
			vlist.removeAllElements();
			setDeleteIdx(1);
			viewList();
			b1.setEnabled(true);
			b2.setEnabled(true);
			b3.setEnabled(true);
			selectCheck = true;
		}else if(obj==insBtn/*저장*/) {
			
			MemberBean bean = new MemberBean();
			idx = vlist.size();
			if(tf1.getText().equals(tf1.getText().trim())) {
				System.out.println("입력 시작");
			bean.setIdx(idx);
			bean.setName(tf1.getText());
			bean.setPhone(tf2.getText());
			bean.setTeam(tf3.getText());

			mgr.insertMember(bean);
			if(continueInput==true) {
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			tf1.requestFocus();
			}
			else {
				p2.removeAll();
				remove(p2);
				list.removeAll();
				remove(list);
				vlist.removeAllElements();
				setDeleteIdx(1);
				viewList();
				b1.setEnabled(true);
				b2.setEnabled(true);
				b3.setEnabled(true);
				selectCheck = true;
			}
			}
		}else if(obj==upBtn/*수정*/) {
			MemberBean bean = new MemberBean();
			bean.setIdx(updateIdx);
			bean.setName(tf1.getText());
			bean.setPhone(tf2.getText());
			bean.setTeam(tf3.getText());
			if(mgr.updateMember(bean)) {
				p2.removeAll();
				remove(p2);
				list.removeAll();
				remove(list);
				viewList();
				b1.setEnabled(true);
				b2.setEnabled(true);
				b3.setEnabled(true);
			}
		}
		validate();
		
		
	}

	public static void main(String[] args) {
		new MemberSwing();
	}
}
