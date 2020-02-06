package ch0501;

abstract class Animal {
	abstract void move();
}

class Bird extends Animal {
	@Override
	void move() {
		System.out.println("비행");
	}
}

class Fish extends Animal {
	@Override
	void move() {
		System.out.println("헤엄");
	}
}

public class AbstractEx02 {

	public static void main(String[] args) {

	}
}
