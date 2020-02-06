package ch09;

import java.awt.List;

public class ListEx01 extends MFrame {

	
	List list1, list2;
	String team1[] ={"·Ôµ¥","»ï¼º","ÇÑÈ­","KIA","KT"};
	String team2[] ={"LG","µÎ»ê","³Ø¼¾","SK","NC"};
	
	
	
	public ListEx01() {
		setTitle("List ¿¹Á¦1");
		list1 = new List(3,false);
		for (int i = 0; i < team1.length; i++) {
			list1.add(team1[i]);
		}
		list2 = new List(4,true);
		for (int i = 0; i < team2.length; i++) {
			list2.add(team2[i]);
		}		
		add(list1);
		add(list2);

	}
	
	
	public static void main(String[] args) {
	new ListEx01();
}
}
