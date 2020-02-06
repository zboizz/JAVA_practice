package ch17;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderEx01 extends JFrame implements ChangeListener {

	private static final int INIT_VALUE = 0;
	JButton btn;	//swing 추가
	JSlider slider;	//swing 추가
	
	
	
	public JSliderEx01() {
	setTitle("");
	setSize(400,400);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JPanel p = new JPanel(); //swing 추가
	JLabel label = new JLabel("슬라이더를 움직여보세요."); //swing 추가
	
	label.setAlignmentX(Component.CENTER_ALIGNMENT); //component awt 추가
	
	p.add(label);
	slider = new JSlider(0,30,INIT_VALUE);
		
	slider.setMajorTickSpacing(10); //큰 눈금 간격
	slider.setMinorTickSpacing(1);  //작은 눈금 간격
	slider.setPaintTicks(true);		//눈금 표시 유무
	slider.setPaintLabels(true);	//값을 레이블로 표시
	
	slider.addChangeListener(this); //연결
	
	p.add(slider);
	
	btn=new JButton("JSlider 예제");
	ImageIcon icon = new ImageIcon("ch17/dog.gif");
	btn.setIcon(icon);
	btn.setSize(INIT_VALUE*10, INIT_VALUE*10);
	p.add(btn);
	
	add(p);	
	
	setVisible(true);
	}	
	
	
	@Override
	public void stateChanged(ChangeEvent e) {
		JSlider s = (JSlider)e.getSource(); //캐스팅
		//System.out.println(s.getValue()); //슬라이더 값이 콘솔에 출력됨
		
		if(s.getValueIsAdjusting()) { //s.슬라이더의 값이 변하였을때
			int value = s.getValue();
			btn.setSize(value*10,value*10);
		}
		
	}

	public static void main(String[] args) {
		new JSliderEx01();
	}

}
