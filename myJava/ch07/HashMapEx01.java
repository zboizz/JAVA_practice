package ch07;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class HashMapEx01 {
	public static void main(String[] args) {
		
		//HashMap : (key, value) key�� ����ũ�� ���� �Ǿ�� �Ѵ�.
		HashMap<String,String> hash = new HashMap<String,String>();
	
		hash.put("���" , "Apple");
		hash.put("����" , "Grapes");
		hash.put("����" , "Strawberry");
		System.out.println(hash.size());
		hash.put("����" , "Erdbeeren");
		
		System.out.println(hash.get("����"));
		hash.remove("���");
		hash.put("���", "Melon");
		
		//////////////////////////////////////
		
		
	Hashtable<String, String> ht = new Hashtable<String, String>();
	ht.put("���" , "Apple");
	ht.put("����" , "Grapes");
	ht.put("����" , "Strawberry");
	ht.put("���", "Melon");
	Enumeration<String> e = ht.keys(); //Enumeration--> �����̻��� Ÿ��
	while(e.hasMoreElements()) {
		String key = e.nextElement();
		String value = ht.get(key);
		System.out.println(key+":"+value);
	}
}
}
