package TryThird;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTable;

public class Scheduletable extends JFrame{

	String colName[] ={"이름","주소","나이","가입여부"};
	String citys[] = {"서울","인천","대전","대구","부산","광주"};
	Object data[][] = {
			{"이연희 ","서울",28, false},
			{"문채원  ","인천",30, false},
			{"리지 ","부산",24, true}};
	JTable jt;
	
	public Scheduletable() {
		setTitle("JTable 예제3");
		setSize(400, 200);
		jt = new JTable(data, colName);
		jt.setTextFill(Color.black);
	  //  setStyle("-fx-background-color: yellow");
		
	
	}
	
	
	
	
	public static void main(String[] args) {
		new Scheduletable();
	}
}
