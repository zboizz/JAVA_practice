package practice;

import java.awt.Frame;
import java.util.Vector;


class A05{}



public class Ex05 {
	public static void main(String[] args) {

		String s = new String();
		Frame f = new Frame();
		Vector v = new Vector(); //10���� ��ü�� ���� �� �ִ� �� ��Ⱑ �������.
		
		v.add(s); //v.add(Object obj): �ڵ���ĳ����
		v.add(f);
		
		String s1 = (String)v.get(0); //�ٿ�ĳ����
		Frame f1 = (Frame)v.get(1);   //�ٿ�ĳ����
		
		
	   //////////////////////////////////////	
		A05 a = new A05();
		String str = new String("Į����");
		System.out.println(a.toString());   //practice.A05@4d591d15
		System.out.println(str.toString()); //Į���� ---->�������̵���
	}
}
