package ch15;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MFrame extends Frame {
	public MFrame() {
		this(300, 300, new Color(220,220,220), false);
	}
	public MFrame(int w, int h) {
		this(w, h, new Color(220,220,220), false);
	}
	public MFrame(Color c) {
		this(300, 300, c, false);
	}
	public MFrame(int w, int h, Color c) {
		this(w, h, c, false);
	}
	public MFrame(int w, int h, Color c, boolean flag) {
		this(w, h, 150, 150, c);
		setResizable(flag);
	}
	public MFrame(int w, int h, int x, int y, Color c) {
		//setLayout(new FlowLayout());
		setBounds(x, y, w, h);//너비 및 높이 세팅
		setBackground(c);//배경색상 세팅
		setVisible(true);//창이 보일지 안보일지
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		validate();
	}
}









