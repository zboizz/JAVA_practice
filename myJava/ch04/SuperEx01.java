package ch04;


//super: 상위클래스를 지칭하는 예약어

class Super01{
	int a=1;
	void prn(){
		System.out.println("상위클래스 prn");
	}
}

class Sub01 extends Super01{
	int a=2;
	//오버라이딩: 상위클래스에서 정의한 메소드를 하위클래스에서 재정의
	void prn() {
		System.out.println(a);
		//상위클래스와 동일한 필드일 경우에는 필드앞에 super
		System.out.println(super.a);
		//오버라이딩 통해서 동일한 메소드명일 경우에 상위 메소드 호출
		super.prn();		
		System.out.println("하위 클래스 prn");
	}
}

public class SuperEx01 {

	public static void main(String[] args) {
			Sub01 s = new Sub01();
			s.prn(); //호출시작--->16 부터 차례대로 내려오면서 작업 수행--->21 super.prn---->9를 통해 "상위클래스 prn'출력--->22 하위클래스 prn 출력
				
		
		}
}
