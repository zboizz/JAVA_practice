package ch0501;

//내부 클래스: 클래스 안에 클래스 선언


class Out01{
	int i = 22;
	void prn() {
		System.out.println("i: " + i);
		//내부클래스는 일반적으로 외부클래스 안에서만 사용을 한다.
		//Inner01 in = new Inner01();
		//in.prn1();
	}
	//외부클래스 입장에서는 내부클래스를 메소드로 생각한다.
	//그래서 외부클래스 필드 및 메소드를 내부클래스에서 사용이 가능한다.
	
	class Inner01{		    //내부클래스- 하나의 메소드로 바라보고 있다.
		int j = 23;			//굳이 왜 내부클래스로 만들었나? 1. 클래스가 가진 여러가지 기능
		void prn1() {		//								 2. 외부클래스와 밀접한 관계를 가짐	
			prn();
			System.out.println(i+j);
		}		
	}   //-----> Inner01
}


public class InnerEx01 {
	
public static void main(String[] args) {
		//제 3의 클래스에서 내부클래스 사용법
		//외부에서는 inner01 클래스를 인식할 수 없다.
		Out01 out = new Out01();
		//Inner01 in = new Inner01();
		Out01.Inner01 in = out.new Inner01();
		in.prn1();
	}
}
