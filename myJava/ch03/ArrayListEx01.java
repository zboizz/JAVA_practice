package ch03;

import java.util.ArrayList;

public class ArrayListEx01 {	
	
	public static void main(String[] args) {
		
		ArrayList<String> fruit = new ArrayList<>();
		
		fruit.add("���");
		fruit.add("�ٳ���");
		fruit.add("��");
		fruit.add("����");
	
		for(int i=0; i<fruit.size(); i++) {
			System.out.println(fruit.get(i));
		
		}
	
	}
}

