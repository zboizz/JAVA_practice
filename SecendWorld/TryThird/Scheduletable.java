package TryThird;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTable;

public class Scheduletable extends JFrame{

	String colName[] ={"�̸�","�ּ�","����","���Կ���"};
	String citys[] = {"����","��õ","����","�뱸","�λ�","����"};
	Object data[][] = {
			{"�̿��� ","����",28, false},
			{"��ä��  ","��õ",30, false},
			{"���� ","�λ�",24, true}};
	JTable jt;
	
	public Scheduletable() {
		setTitle("JTable ����3");
		setSize(400, 200);
		jt = new JTable(data, colName);
		jt.setTextFill(Color.black);
	  //  setStyle("-fx-background-color: yellow");
		
	
	}
	
	
	
	
	public static void main(String[] args) {
		new Scheduletable();
	}
}
