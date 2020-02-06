package ch07;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class HashMapEx01 {
	public static void main(String[] args) {
		
		//HashMap : (key, value) key는 유니크한 값이 되어야 한다.
		HashMap<String,String> hash = new HashMap<String,String>();
	
		hash.put("사과" , "Apple");
		hash.put("포도" , "Grapes");
		hash.put("딸기" , "Strawberry");
		System.out.println(hash.size());
		hash.put("딸기" , "Erdbeeren");
		
		System.out.println(hash.get("딸기"));
		hash.remove("사과");
		hash.put("멜론", "Melon");
		
		//////////////////////////////////////
		
		
	Hashtable<String, String> ht = new Hashtable<String, String>();
	ht.put("사과" , "Apple");
	ht.put("포도" , "Grapes");
	ht.put("딸기" , "Strawberry");
	ht.put("멜론", "Melon");
	Enumeration<String> e = ht.keys(); //Enumeration--> 줄줄이사탕 타입
	while(e.hasMoreElements()) {
		String key = e.nextElement();
		String value = ht.get(key);
		System.out.println(key+":"+value);
	}
}
}
