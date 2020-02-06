package ch04;

class Car03{
	//필드-3개
	String carName;
	int velocity;
	String carColor;
	//생성자: 객체를 생성하는 기능의 특별한 메소드. 
	//반드시 클래스명과 동일해야하고 리턴 타입 선언은 없다.
	//디폴트생성자: 매개변수도 없고 구현부에 아무런 코드가 없는 생성자
	//JVM이 컴파일 시점에 생성자가 하나라도 없으면 디폴트 생성자를 제공
	public Car03() {
		
	}
	
	
	//메소드-3개
	void speedup() {
		velocity++;
	}
	void speedDown() {
		velocity--;
		if(velocity<0) {
			velocity = 0;
		}
	}
	void stop() {
		velocity = 0;
	}
}

public class CarEx03 {
	public static void main(String[] args) {
	Car03 c1 = new Car03();
	
	}
	
}
