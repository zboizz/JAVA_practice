package ch04;

class Call01{
	int a;
}
	
public class CallEx01 {
	
		public static void main(String[] args) {
			//자바의 Date Type
			// 1. 기본형: 8가지
			// ******2. 참조형(클래스): 무한대
			
			//**기본형
			int a = 10;
			//call by value(값에 의한 호출)
			int b =a;
			a=20;
			System.out.println(a);
			System.out.println(b);
			System.out.println(a+b);
			//////////////////////////
			Call01 c1 = new Call01();
			Call01 c2 = new Call01();
			c2.a=10;
			System.out.println("c1.a: " + c1.a);
			System.out.println("c2.a: " + c2.a);
			//call by reference(참조에 의한 호출)
						
			c1 = c2;
			System.out.println("c1.a : " + c1.a);
			System.out.println("c2.a : " + c2.a);
			
		}
}
