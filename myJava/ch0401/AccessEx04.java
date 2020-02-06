package ch0401;

import ch04.ProtectedEx01; //다른 패키지이기때문에 import 사용

import java.awt.Frame;

//protected는 상속일때는 public, 그렇지않을 경우에는 private이 된다.
//필드와 메소드에 사용가능

//서로 다른 패키지일 경우에는 반드시 import 해야함.
//그러나 예외가 존재. java.lang 패키지는 제외

import java.lang.*;


class Access04 extends ProtectedEx01{
	public Access04() {
	//protected이지만 상속을 했기 때문에 사용가능
	a=10;
	prn();
	}
}

class MyFrame extends Frame{
	public void prn() {
		String s = paramString();
		System.out.println(s);
	}
}


public class AccessEx04 {
	public static void main(String[] args) {
		Access04 b = new Access04();
		// b. protected 필드 및 메소드 안보임, protected는 상속받은 클래스내에서만 사용가능
		MyFrame m = new MyFrame();
		m.prn();
	}
}
