package ch05;

import java.util.Vector;

class Person03{
	int a;
	void prn() {System.out.println("a : " + a);}
	
}

class Student03 extends Person03{
	int b;
	void mrn() { System.out.println("b : " + b);}
}


public class CastingEx01 {
	public static void main(String[] args) {

		Student03 s = new Student03();   //��ü�Һ��� ��Ģ
		Person03 p = s;     //��ĳ���� �߻�(UpCasting)
		p.a = 100;
		p.prn();
		s.b =200;
		s.mrn();
		/////////////////////////////////////
		Person03 p1 = new Person03();	
		Student03 s1 = (Student03)p;
		//Student03 s1 = (Student03)p1; //�ٿ�ĳ����(DownCasting)
		//�ٿ�ĳ������ �ҽÿ� �ʿ��� ����
		s1.b =300;
		s1.mrn();
		////////////////////////////////////////ex)
		Vector v = new Vector();
		String str = new String("JAVA");
		v.add(str); //�ڵ����� ��ĳ���� �� ���, obj�� �� ��ġ�� str�� �� ����
		String str1 = (String)v.get(0);  //�ٿ�ĳ���� �� ���
		//v�� 0��° �濡 �ִ� ���� �����Ͷ�(get), get���� obj������ ������ ���� �����;��ϴ� ���� str
		System.out.println(str1.length());
		
		
		
		
	}
}
