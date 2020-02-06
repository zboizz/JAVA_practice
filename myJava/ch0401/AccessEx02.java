package ch0401;

//private는 가장 작은 범위 지정자 : 필드, 메소드

class Access02{
	private int a;
	
	//private가 존재하는 이유: 데이터의 보호목적으로 사용, 
	//public int speed;
	private int speed;
		
	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		if(speed<0) {
			speed=0;}
		this.speed = speed;
	}


	private void prn() {
		System.out.println(a);
	}
}

public class AccessEx02 {

	public static void main(String[] args) {
		Access02 a2 = new Access02();
		//a2.a=10;
		//a2.speed = 100;
		//a2.speed = -10;
		a2.setSpeed(-10); // 0보다 작은 값은 0이 되도록 안전장치를 private 활용하여 
		//SUN에서 제공되는 메소드중 99퍼센트가 public
		//그러나 Math의 생성자는 private이다.
		//Math m = new Math();
		//Math는 객체 생성없이 사용가능한 필드와 메소드가 제공.
	}
}
