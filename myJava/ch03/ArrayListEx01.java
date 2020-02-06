package ch03;

import java.util.ArrayList;

public class ArrayListEx01 {	
	
	public static void main(String[] args) {
		
		ArrayList<String> fruit = new ArrayList<>();
		
		fruit.add("사과");
		fruit.add("바나나");
		fruit.add("배");
		fruit.add("딸기");
	
		for(int i=0; i<fruit.size(); i++) {
			System.out.println(fruit.get(i));
		
		}
	
	}
}

