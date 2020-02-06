package ch0401;

import java.awt.Frame;
import java.util.Calendar;

//final(마지막): 클래스, 필드, 메소드

// 1. 클래스: sub 클래스가 없는 클래스
// 2. 필드: 상수선언
// 3. 메소드: Override(오버라이딩) 불가
// final class에는 final 메소드는 의미가 없다.

class Final01{
	final int A = 10; //상수라는 것은 final이 있기에 선언 가능한 것, 대문자로 표현할 것
	static final int KIA = 20;
	final static int HD = 30;
	
	void prn(final int SM) {
		//KIA = 40;
		//SM = 50;
		System.out.println(Math.PI);
		
	}
}

//class Final02 extends Final01{}

class Final03{
	
	void prn1() {}
	final void prn2() {}
}
class Final04 extends Final03{
	@Override
	void prn1() {}
	//final void prn2() {}               //오버라이딩 불가

}
public class FinalEx01 {

	
	public static void main(String[] args) {
		Frame f = new Frame();
		//상수를 선언하는 이유
		//f.setBackground(Color.ORANGE);
		//f.setForeground(new Color(128,128,128));
		//f.setForeground(Color.GRAY);
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(5));
		
		//Character c1 = new Character("a");
     	Character c1 = 'a';
		Character.isSpace(c1);
		Character.isWhitespace(c1);
		
			
}
}
