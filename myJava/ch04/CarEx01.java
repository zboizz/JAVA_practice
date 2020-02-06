package ch04;


//실제 클래스
//클래스 : 객체를 만드는 틀
//클래스 안에는 field(필드): 객체의 속성
//              method(메소드) : 객체의 기능
class Car01{
	String carName;
	int velocity;
	String carColor;
	
	//메소드: 객체의 기능
	void speedUp() {
		velocity++;
	}
	void speedDown() {
		velocity--;
		if(velocity<0) {
			velocity = 0;
		}
	}
}//----class

//역할: 실행하기 위한 클래스
public class CarEx01 {
public static void main(String[] args) {
	//잘 만든 클래스를 가지고 객체 생성하여 필드 및 메소드를 사용한다.
	//위에서 만든 클래스를 이용하여 메모리상에 객체를 생성
	Car01 c = new Car01(); //'new'는 객체를 만드는 예약어
	//'c'는 생성된 객체를 가르키고 있다고해서 레퍼런스 변수라 일컫는다.
	//레퍼런스 변수. 필드 or 레퍼런스 변수.메소드->사용된 예
	c.carName = "그랜져";
	c.carColor = "white";
	c.speedUp();
	
	//SUN에서 제공되는 클래스를 가지고 객체를 생성
	String s=new String(); //String이란 문자를 객체화한 클래스
	s.toLowerCase();
 	}
}
