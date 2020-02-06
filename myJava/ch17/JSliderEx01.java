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
	JButton btn;	//swing �߰�
	JSlider slider;	//swing �߰�
	
	
	
	public JSliderEx01() {
	setTitle("");
	setSize(400,400);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JPanel p = new JPanel(); //swing �߰�
	JLabel label = new JLabel("�����̴��� ������������."); //swing �߰�
	
	label.setAlignmentX(Component.CENTER_ALIGNMENT); //component awt �߰�
	
	p.add(label);
	slider = new JSlider(0,30,INIT_VALUE);
		
	slider.setMajorTickSpacing(10); //ū ���� ����
	slider.setMinorTickSpacing(1);  //���� ���� ����
	slider.setPaintTicks(true);		//���� ǥ�� ����
	slider.setPaintLabels(true);	//���� ���̺�� ǥ��
	
	slider.addChangeListener(this); //����
	
	p.add(slider);
	
	btn=new JButton("JSlider ����");
	ImageIcon icon = new ImageIcon("ch17/dog.gif");
	btn.setIcon(icon);
	btn.setSize(INIT_VALUE*10, INIT_VALUE*10);
	p.add(btn);
	
	add(p);	
	
	setVisible(true);
	}	
	
	
	@Override
	public void stateChanged(ChangeEvent e) {
		JSlider s = (JSlider)e.getSource(); //ĳ����
		//System.out.println(s.getValue()); //�����̴� ���� �ֿܼ� ��µ�
		
		if(s.getValueIsAdjusting()) { //s.�����̴��� ���� ���Ͽ�����
			int value = s.getValue();
			btn.setSize(value*10,value*10);
		}
		
	}

	public static void main(String[] args) {
		new JSliderEx01();
	}

}
