package ch05;

class Animal{
	void move() {
		
	}
}

class Bird extends Animal{
	String name = "��";
	void move() {
		System.out.println(name+" ���ƶ�!");
	}
}	

class Fish extends Animal{
	String name = "�����";
	void move() {
		System.out.println(name+" ����Ķ�!");
	}
}

class Cheetah extends Animal{
	String name = "ġŸ";
	void move() {
		System.out.println(name+" �޷���!");
	}
}

public class CastingEx0201 {
	public static void main(String[] args) {
		Animal ani[] = new Animal[3];
		ani[0] = new Bird();		
		ani[1] = new Fish();		
		ani[2] = new Cheetah();
		//�޸𸮿� �ִ� �޼ҵ� ȣ���� ���ε�(binding) ->> ����, ����
		for (int i = 0; i < ani.length; i++) {
			ani[i].move(); //���� ���ε�
			
		}
		
		}
	}

