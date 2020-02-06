package practice;

import java.awt.Frame;
import java.util.Vector;


class A05{}



public class Ex05 {
	public static void main(String[] args) {

		String s = new String();
		Frame f = new Frame();
		Vector v = new Vector(); //10개의 객체를 담을 수 있는 빈 용기가 만들어짐.
		
		v.add(s); //v.add(Object obj): 자동업캐스팅
		v.add(f);
		
		String s1 = (String)v.get(0); //다운캐스팅
		Frame f1 = (Frame)v.get(1);   //다운캐스팅
		
		
	   //////////////////////////////////////	
		A05 a = new A05();
		String str = new String("칼국수");
		System.out.println(a.toString());   //practice.A05@4d591d15
		System.out.println(str.toString()); //칼국수 ---->오버라이딩됨
	}
}
