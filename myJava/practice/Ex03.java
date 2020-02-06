package practice;
//super 사용
// 1. 생성자 super()생략
// 2. 부모의 필드 및 메소드 호출시 



class A03{	//클래스 생성
	int a = 10;
	
	
	public A03 () { //생성자 생성, 생성자가 기본으로 해야하는 역할들이 있음.
		super(); //생략되어 있음
	}
		void prn() {
			System.out.println("a :" + a);	
			}
}




class B03 extends A03{
	public B03() {
	}
	@Override
	void prn() {
		int b = super.a + 10; //부모의 변수의 사용할 경우에는 앞에 super을 븥인다.
		super.prn(); //오버라이딩의 경우에는 부모 메소드 호출시 반드시 super 지정
	}
}





public class Ex03 {
	public static void main(String[] args) {
		
	}
}
