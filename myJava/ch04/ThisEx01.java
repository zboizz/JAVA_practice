package ch04;


//This: 내 자신을 지칭하는 예약어
class This01{
	//객체의 속성을 가지고 있는 필드
	int a;
	int b;
	
	void prn(int a /*인수 또는 매개변수*/) {
		int b = 0; //지역(local) 변수
		System.out.println(a+b);
		//지역변수와 동일한 필드인 경우에 사용하기 위해서는 반드시 필드 앞에 this가 온다
		System.out.println(this.a+this.b);
	}

		void prn2() {
			//동일한 클래스내에 다른 메소드 호출은 가능
			/*this. 일반적으로 생략되어 있음*/prn(22);
		}
		
}

public class ThisEx01 {

	public static void main(String[] args) {
		
	}
}
