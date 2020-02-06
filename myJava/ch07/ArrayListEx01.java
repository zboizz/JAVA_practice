package ch07;

import java.util.ArrayList;

public class ArrayListEx01 {
	public static void main(String[] args) {
		//ArrayList vs Vector: 동기화 유무
		//동기화란: 네트워크상에서 
		ArrayList<String> list = new ArrayList<>(); //ArrayList<>의 타입은 <String>으로
		//1.7이후 가능: 양변에 <>를 넣지않아도 되는 것, 왼쪽 변에만 넣어도 됨
		//제네릭은 5.0부터 사용시작
		
		list.add("Java");
		list.add("JSP");
		list.add("Database");
		list.add("Android");
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.println(s);			
		}System.out.println();
		
		for (String s : list) { //s가 list에 받은 값
			System.out.println(s);
		}
			
		}
	}

