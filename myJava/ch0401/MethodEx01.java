package ch0401;

class Method01{
	//메소드 4가지 타입
	// 1. 리턴없고 매개변수 없음.
	// 2. 리턴있고 매개변수 없음.
	// 3. 리턴없고 매개변수 있음.
	// 4. 리턴있고 매개변수 있음.

	void prn1() {}			//1. 리턴없고 매개변수 없음.
	
	int prn2() {            //'int'를 사용할 시 필히 'return a;' 로 끝맺음을 하여야한다.
		int a = 10;			//2.리턴없고 매개변수 없음.
		return a;
	}
	
	void prn3(int a, int b) {	      //3. 리턴없고 매개변수 있음.
		
	}
	String prn4(int a, int b) {			//4. 리턴있고 매개변수 있음.
		String s="사자";
		return s;
	}
	
	String[] prn5() {
		String s[] = new String[3];
		return s;
	}
}

public class MethodEx01 {

	public static void main(String[] args) {
			
		}
	
}





