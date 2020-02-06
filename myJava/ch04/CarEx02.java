package ch04;

class Car02{
	//필드-3개
	String carName;
	int velocity;
	String carColor;
	
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

public class CarEx02 {
	public static void main(String[] args) {
		//클래스를 가지고 객체 생성: "클래스명 레퍼런스변수 = new 클래스 명();"
		Car03 my =new Car03();
		Car03 you =new Car03();
		my.carName = "티코";
		my.carColor = "red";
		for (int i = 0; i < 50; i++) {
			my.speedup();
		}
		you.carName = "마티즈";
		you.carColor = "blue";
		you.speedup();
		System.out.println(my.carName + "," + my.carColor+ "," + my.velocity);
		System.out.println(you.carName + "," + you.carColor+ "," + you.velocity);
	}
	
}
