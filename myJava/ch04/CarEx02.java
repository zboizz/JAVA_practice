package ch04;

class Car02{
	//�ʵ�-3��
	String carName;
	int velocity;
	String carColor;
	
	//�޼ҵ�-3��
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
		//Ŭ������ ������ ��ü ����: "Ŭ������ ���۷������� = new Ŭ���� ��();"
		Car03 my =new Car03();
		Car03 you =new Car03();
		my.carName = "Ƽ��";
		my.carColor = "red";
		for (int i = 0; i < 50; i++) {
			my.speedup();
		}
		you.carName = "��Ƽ��";
		you.carColor = "blue";
		you.speedup();
		System.out.println(my.carName + "," + my.carColor+ "," + my.velocity);
		System.out.println(you.carName + "," + you.carColor+ "," + you.velocity);
	}
	
}
