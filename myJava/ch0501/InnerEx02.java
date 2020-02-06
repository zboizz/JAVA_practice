package ch0501;

class Out02{
	int i =22;
	void prn() {
		System.out.println("i"+ i);
		Inner02 in = new Inner02(this); //this: Out02 객체 자신, 14라인의 Out02
		in.prn1();
	}
}
class Inner02{
	int j = 23;
	Out02 out;
	Inner02(Out02 out){
		this.out = out;
	}		
	void prn1( ) {
		out.prn();
		System.out.println(out.i+j);
	}
}

class Out03{
	//static 내부클래스 (static은 제한된 클래스 앞에 올 수 있다.)
	static class Inner03{}
}

public class InnerEx02 {
	public static void main(String[] args) {
		
	}
}
