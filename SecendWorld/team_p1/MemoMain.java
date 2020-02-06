package team_p1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class MemoMain extends JFrame implements ActionListener, ComponentListener {
	private JFrame frame1;
	private JPanel panel1, panel2;
	private JTextPane tp;
	private JButton button_1, button_2, button_3, button_4, bottomLine;
	private boolean status_1, status_2, status_3, status_4;
	//btn1~3 = 새창, 메뉴, 창닫기
	//btn4~7 = 굵게, 기울게, 밑줄, 삭제표시
	Color darkYellow = new Color(255, 242, 171);
	public MemoMain() {//생성자
		initialize();
		frame1.addComponentListener(this);//resize 리스너
	}
	
	public void initialize() {//기본값, 초기화, 셋팅
		status_1 = false;
		status_2 = false;
		status_3 = false;
		status_4 = false;
		
		frame1 = new JFrame();//프레임 껍데기 만들기
		frame1.setUndecorated(false);
		frame1.setBounds(200, 200, 500, 500);
		setLayout(new BorderLayout());
		frame1.getContentPane().setLayout(null);
		frame1.setResizable(true);
		frame1.setVisible(true);
		tp = new JTextPane();
		frame1.add(tp);//Textpane 생성
		tp.setBounds(0, 0, frame1.getWidth(), frame1.getHeight()-70);

		tp.setBackground(darkYellow);
		
		
		
		panel1 = new JPanel();//패널 객체 생성, 크기, 패널색, 레이아웃+위치
		panel1.setLayout(null);
		panel1.setBackground(darkYellow);
		frame1.add(panel1);
		
		panel1.setBounds(0, frame1.getHeight()-70, frame1.getWidth(), 50);
		
		bottomLine = new JButton(changeIcon("memoBottomLine", frame1.getWidth(), 1));
		bottomLine.setBounds(0, 0, frame1.getWidth(), 5);
		button_1 = new JButton(changeIcon("boldUnfocus", 30, 30));
		button_1.setBounds(10, 10, 20, 20);
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e){
				button_1.setIcon(changeIcon("boldUnfocus", 20, 20));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				button_1.setIcon(changeIcon("boldFocus", 20, 20));
			}
		});
		button_2 = new JButton(changeIcon("tiltingUnfocus", 20, 20));
		button_2.setBounds(50, 7, 23, 23);
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e){
				button_2.setIcon(changeIcon("tiltingUnfocus", 20, 20));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				button_2.setIcon(changeIcon("tiltingFocus", 20, 20));
			}
		});
		button_3 = new JButton(changeIcon("underlineUnfocus", 20, 20));
		button_3.setBounds(90, 10, 20, 20);
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e){
				button_3.setIcon(changeIcon("underlineUnfocus", 20, 20));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				button_3.setIcon(changeIcon("underlineFocus", 20, 20));
				System.out.println("Enter");
			}
		});
		button_4 = new JButton(changeIcon("strikethroughUnfocus", 20, 20));
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e){
				button_4.setIcon(changeIcon("strikethroughUnfocus", 20, 20));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				button_4.setIcon(changeIcon("strikethroughFocus", 20, 20));
			}
		});
		button_4.setBounds(130, 10, 20, 20);
		
		buttonSet(bottomLine);
		buttonSet(button_1);
		buttonSet(button_2);
		buttonSet(button_3);
		buttonSet(button_4);
		
		panel1.add(bottomLine);
		panel1.add(button_1);
		panel1.add(button_2);
		panel1.add(button_3);
		panel1.add(button_4);
		
		button_1.addActionListener(this);//버튼 액션리스너에 연결
		button_2.addActionListener(this);
		button_3.addActionListener(this);
		button_4.addActionListener(this);
		
		
		validate();
	}

	public void buttonSet(JButton button) {
		button.setBorderPainted(false);
		button.setContentAreaFilled(false);	
		button.setFocusPainted(false);
	}
	
	
	@Override public void componentHidden(ComponentEvent e) {System.out.println("hidden");}
	@Override public void componentMoved(ComponentEvent e) {System.out.println("moved");}
	@Override public void componentShown(ComponentEvent e) {System.out.println("shown");}
	@Override
	public void componentResized(ComponentEvent e) {
		System.out.println("resize event");
		bottomLine.setBounds(0, 0, frame1.getWidth(), 5);
		bottomLine.setSize(frame1.getWidth(), 5);
		panel1.setBounds(0, frame1.getHeight()-70, frame1.getWidth(), 30);
		tp.setBounds(0, 0, frame1.getWidth(), frame1.getHeight()-70);
		tp.setBackground(darkYellow);
		panel1.setBackground(darkYellow);
	}
	
		
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println(tp.getSelectedText());

		if(e.getSource()==button_1) {
			//System.out.println("1");
			if(status_1==false) {
				Font font = new Font("", Font.BOLD, 12);
				tp.setFont(font);
				status_1=true;
			} else if(status_1==true) {
				Font font = new Font("", Font.PLAIN, 12);
				tp.setFont(font);
				status_1=false;
			}
		} else if(e.getSource()==button_2) {
			if(status_2==false) {
				Font font1 = new Font("", Font.ITALIC, 12);
				status_2=true;
			} else if(status_2==true) {
				Font font = new Font("", Font.PLAIN, 12);
				tp.setFont(font);
				status_2=false;
			}
		} else if(e.getSource()==button_3) {
			//System.out.println("3");
			if(status_3==false) {
				Font font1 = new Font("", Font.ITALIC, 12);
				tp.setFont(font1);
				status_3=true;
			} else if(status_3==true) {
				Font font = new Font("", Font.PLAIN, 12);
				tp.setFont(font);
				status_3=false;
			}
		} else if(e.getSource()==button_4) {
			//System.out.println("4");
//			if(status_4==false) {
//				Font font = new Font("", Font.BOLD, 12);
//				tp.setFont(font);
//				status_4=true;
//			} else if(status_4==true) {
//				Font font = new Font("", Font.PLAIN, 12);
//				tp.setFont(font);
//				status_4=false;
//			}
			tp.setText("<html><span><font = ");
		} 
	}

	
	public ImageIcon changeSize(String fileName, int width, int height) {
		  URL imgURL = this.getClass().getResource("IUimage/"+fileName+".JPG");
		  Image img = new ImageIcon(imgURL).getImage();
		  Image newImg = img.getScaledInstance( width, height,  java.awt.Image.SCALE_SMOOTH ) ;  
		  System.out.println(newImg);
		  return new ImageIcon(newImg);			   
	}
	public ImageIcon changeIcon(String fileName, int width, int height) {
		  URL imgURL = this.getClass().getResource("IUimage/"+fileName+".png");
		  Image img = new ImageIcon(imgURL).getImage();
		  Image newImg = img.getScaledInstance( width, height,  java.awt.Image.SCALE_SMOOTH ) ;  
		  System.out.println(newImg);
		  return new ImageIcon(newImg);			   
	}


	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemoMain window = new MemoMain();
					window.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}
