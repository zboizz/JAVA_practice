package ch0501;

abstract class Animal {
	abstract void move();
}

class Bird extends Animal {
	@Override
	void move() {
		System.out.println("����");
	}
}

class Fish extends Animal {
	@Override
	void move() {
		System.out.println("���");
	}
}

public class AbstractEx02 {

	public static void main(String[] args) {

	}
}
