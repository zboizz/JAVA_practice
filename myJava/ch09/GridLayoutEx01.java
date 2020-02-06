package ch09;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;

public class GridLayoutEx01 extends MFrame {
	
	public GridLayoutEx01() {
		setTitle("GridLayout ¿¹Á¦1");
		setLayout(new GridLayout(3,2));
		
		add(new Button("1"));
		add(new Button("2"));
		add(new Label("1"));
		add(new Button("3"));
		add(new Button("4"));
		add(new Label("2"));
		validate();
	}

	public static void main(String[] args) {
		new GridLayoutEx01();
	}
}
