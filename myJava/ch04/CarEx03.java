package ch04;

class Car03{
	//�ʵ�-3��
	String carName;
	int velocity;
	String carColor;
	//������: ��ü�� �����ϴ� ����� Ư���� �޼ҵ�. 
	//�ݵ�� Ŭ������� �����ؾ��ϰ� ���� Ÿ�� ������ ����.
	//����Ʈ������: �Ű������� ���� �����ο� �ƹ��� �ڵ尡 ���� ������
	//JVM�� ������ ������ �����ڰ� �ϳ��� ������ ����Ʈ �����ڸ� ����
	public Car03() {
		
	}
	
	
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

public class CarEx03 {
	public static void main(String[] args) {
	Car03 c1 = new Car03();
	
	}
	
}
