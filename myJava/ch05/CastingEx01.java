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

		Student03 s = new Student03();   //객체불변의 법칙
		Person03 p = s;     //업캐스팅 발생(UpCasting)
		p.a = 100;
		p.prn();
		s.b =200;
		s.mrn();
		/////////////////////////////////////
		Person03 p1 = new Person03();	
		Student03 s1 = (Student03)p;
		//Student03 s1 = (Student03)p1; //다운캐스팅(DownCasting)
		//다운캐스팅을 할시에 필요한 문법
		s1.b =300;
		s1.mrn();
		////////////////////////////////////////ex)
		Vector v = new Vector();
		String str = new String("JAVA");
		v.add(str); //자동으로 업캐스팅 된 경우, obj가 들어갈 위치에 str이 들어가 있음
		String str1 = (String)v.get(0);  //다운캐스팅 된 경우
		//v의 0번째 방에 있는 값을 가져와라(get), get또한 obj이지만 실제로 값을 가져와야하는 것은 str
		System.out.println(str1.length());
		
		
		
		
	}
}
