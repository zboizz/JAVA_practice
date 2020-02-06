package practice;

import java.awt.Dialog;
import java.awt.Frame;

class A04{
	A04(String s){}
	
	//void A04(String s){}     //void를 넣음으로써 자동으로 일반 메소드가 되어버림.
							   //그렇다면 디폴트 생성자는 JVM 제공.
		
	}



class B04 extends A04{
	//에러가 나는 이유
	//1. super 클래스에 디폴트 생성자가 없었기 때문
	//2. B04 생성자에서 super 클래스 매개변수가 있는 생성자를 호출 -->Dialog d = new Dialog(f);로 에러 없앰

	B04(){
		super("하하"); //명시적으로 String 매개변수 생성자 호출


}
}
public class Ex04 {
	public static void main(String[] args) {
		Frame f = new Frame();
		String s = new String();
		Dialog d = new Dialog(f);
		
		
	}
}
