package ch06;

import java.util.Vector;

public class WrapperEx03 {

	public static void main(String[] args) {
			//�ڹٱ⺻�� <==> Wrapper Ŭ����
	int a = 10;
	Integer it1 = Integer.valueOf(a);
	int b = it1.intValue();
	int c = it1;         //Auto Unboxing
	Integer it2 =a;      //Auto boxing
	
	Vector<Object> v = new Vector<Object>();
	String s = "����";
	v.add(s);
	v.add(a);
	Integer it3 = Integer.valueOf(22);
	
	setInt(it3);
	int d = 10;
	setInt(d);
	
	
	}
	
	public static void setInt(Integer it) {
		System.out.println(it);
	}
	
	
}
