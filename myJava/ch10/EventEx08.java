package ch10;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class EventEx08 extends MFrame 
implements ItemListener{
	
	Checkbox pink, green, yellow;
	CheckboxGroup g;
	
	public EventEx08() {
		setTitle("Event ¿¹Á¦8");
		g= new CheckboxGroup();
		Panel p = new Panel();
		p.add(pink = new Checkbox("pink",g,true));
		p.add(green = new Checkbox("green",g,false));
		p.add(yellow = new Checkbox("yellow",g,false));
		add(p,BorderLayout.SOUTH);
		setBackground(Color.PINK);
	
		pink.addItemListener(this);
		green.addItemListener(this);
		yellow.addItemListener(this);
		validate();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
	if(e.getSource()==pink)
		setBackground(Color.pink);
	else if(e.getSource()==green)
		setBackground(Color.GREEN);
	else if(e.getSource()==yellow)
		setBackground(Color.YELLOW);		
	
	//Object obj = e.getsource();
	//if(obj==pink) {
	//	setBackground(Color.pink);
	// }else if(obj==green){
	//setBackground(Color.green);
	//}else if(obj==yellow) {
	//	setBackground(Color.yellow);
	//}
	
	
	
	}
	
	public static void main(String[] args) {
		new EventEx08();
	}


	
}
