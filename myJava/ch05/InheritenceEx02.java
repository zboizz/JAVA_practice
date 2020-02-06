package ch05;

class Car02{
	int velocity;									 //한개의 필드
	void speedUp(){
		velocity++;
	}
	void speedDown() {
		velocity--;									//3개의 메소드
		if(velocity<0)
			velocity = 0;
	}
	final void stop() {
		velocity=0;
	}
}

class Taxi02 extends Car02{
	@Override
	void speedUp() {
		velocity+=5;
	}
}

class Bus02 extends Car02{
	@Override
	void speedUp() {
		super.speedUp();	//조상(부모)의 메소드 호출
		if(velocity>100)
			velocity = 100;
	}
	public String toStirng() {
		return super.toString();  //toString()은 Object 클래스 메소드
	}
}


public class InheritenceEx02 {

	public static void main(String[] args) {
		Taxi02 t = new Taxi02();
		t.speedUp();
		System.out.printf("택시의 속도는 %d" , t.velocity);
		System.out.println("");
		
		Bus02 b = new Bus02();
		b.velocity = 100;
		b.speedUp();
		System.out.printf("버스의 속도는 %d", b.velocity );
		
		MyFrame mf = new MyFrame();
	}
}
