package ch17;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;


public class JCheckBoxEx01 extends JFrame 
implements ItemListener{
	
	JCheckBox cb[] = new JCheckBox[3];
	String[] fruits = {"apple","grape","orange"};
	JLabel label[] = new JLabel[3];
	ImageIcon icon[] = new ImageIcon[3];
	
	public JCheckBoxEx01() {
		setSize(500, 200);
		setLayout(new GridLayout(0, 4));
		setTitle("JCheckbox 예제1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(0,1));
		for (int i = 0; i < cb.length; i++) {			
		    cb[i] = new JCheckBox(fruits[i]);
		    
			cb[i].addItemListener(this);
			
			label[i] = new JLabel(fruits[i]+".gif");
			icon[i] = new ImageIcon("ch17/"+fruits[i]+".gif");
			p.add(cb[i]);
		}
		//배경색 변경
		getContentPane().setBackground(Color.MAGENTA);
		add(p);
		for (int i = 0; i < label.length; i++) {
			add(label[i]);
		}
		setVisible(true);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		Object obj = e.getItemSelectable();
		for (int i = 0; i < cb.length; i++) {
			if(obj==cb[i]) {
				if(e.getStateChange()==ItemEvent.DESELECTED) {
					//선택을 해제할때
					label[i].setIcon(null);
				}else {
					//선택할때
					label[i].setIcon(icon[i]);
				}
			}
		}
	}

	public static void main(String[] args) {		
		try {
			//UIManager.setLookAndFeel("ch.randelshofer.quaqua.QuaquaLookAndFeel");
			UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
		} catch(Exception e) {}
		JFrame.setDefaultLookAndFeelDecorated(true);
		new JCheckBoxEx01();
	}
}