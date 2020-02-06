package ch05;

	class Person01{}

	class Student01 extends Person01{}
	class Professor01 extends Person01{}

public class InstanceOfEx01 {

		public static void main(String[] args) {
			//모든 객체는 obj가 레퍼런스 가능
			Object obj = new Person01(); //객체 불변의 법칙
			Person01 p1 = new Student01();
			Person01 p2 = new Professor01();
			//레퍼런스 변수명 instanceOf 클래스명 => boolean 값
			if(p1 instanceof Person01)
				System.out.println("p1은 Person01이다");
			if(p1 instanceof Object)
				System.out.println("p1은 Object이다");
			if(p1 instanceof Professor01)
				System.out.println("p1은 Professor01이다");
			
		}
}
