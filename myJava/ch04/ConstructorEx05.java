package ch04;

class Constructor05{
	//생성자 오버로딩
	//super 부모클래스 지칭 예약어
	//this 내 자신의 지칭하는 예약어
	
	
	Constructor05(){
		//내 자신의 객체를 만드는 생성자 호출. 반드시 첫번째 라인에 와야함
		this(100,"자바");
	}
	Constructor05(int i){
		this(i,"자바");
	}
	Constructor05(String s){
		this(100,s);
	}	
	
	//가정: 잘 구현되어 있는 생성자
	Constructor05(int i, String s){
		//super(); 가 생성, 생략되어 있음
		super();
		//잘 구현되어 있는 코드가 있다
	}	
	
}


public class ConstructorEx05 {
	
	public static void main(String[] args) {
		
	}
}
