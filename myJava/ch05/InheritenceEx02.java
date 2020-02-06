package ch05;

class Car02{
	int velocity;									 //�Ѱ��� �ʵ�
	void speedUp(){
		velocity++;
	}
	void speedDown() {
		velocity--;									//3���� �޼ҵ�
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
		super.speedUp();	//����(�θ�)�� �޼ҵ� ȣ��
		if(velocity>100)
			velocity = 100;
	}
	public String toStirng() {
		return super.toString();  //toString()�� Object Ŭ���� �޼ҵ�
	}
}


public class InheritenceEx02 {

	public static void main(String[] args) {
		Taxi02 t = new Taxi02();
		t.speedUp();
		System.out.printf("�ý��� �ӵ��� %d" , t.velocity);
		System.out.println("");
		
		Bus02 b = new Bus02();
		b.velocity = 100;
		b.speedUp();
		System.out.printf("������ �ӵ��� %d", b.velocity );
		
		MyFrame mf = new MyFrame();
	}
}
