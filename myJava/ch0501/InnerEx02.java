package ch0501;

class Out02{
	int i =22;
	void prn() {
		System.out.println("i"+ i);
		Inner02 in = new Inner02(this); //this: Out02 ��ü �ڽ�, 14������ Out02
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
	//static ����Ŭ���� (static�� ���ѵ� Ŭ���� �տ� �� �� �ִ�.)
	static class Inner03{}
}

public class InnerEx02 {
	public static void main(String[] args) {
		
	}
}
