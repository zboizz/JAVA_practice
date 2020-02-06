package ch05;

class Animal{
	void move() {
		
	}
}

class Bird extends Animal{
	String name = "새";
	void move() {
		System.out.println(name+" 날아라!");
	}
}	

class Fish extends Animal{
	String name = "물고기";
	void move() {
		System.out.println(name+" 헤엄쳐라!");
	}
}

class Cheetah extends Animal{
	String name = "치타";
	void move() {
		System.out.println(name+" 달려라!");
	}
}

public class CastingEx0201 {
	public static void main(String[] args) {
		Animal ani[] = new Animal[3];
		ani[0] = new Bird();		
		ani[1] = new Fish();		
		ani[2] = new Cheetah();
		//메모리에 있는 메소드 호출을 바인딩(binding) ->> 정적, 동적
		for (int i = 0; i < ani.length; i++) {
			ani[i].move(); //동적 바인딩
			
		}
		
		}
	}

