package ch0401;

//private�� ���� ���� ���� ������ : �ʵ�, �޼ҵ�

class Access02{
	private int a;
	
	//private�� �����ϴ� ����: �������� ��ȣ�������� ���, 
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
		a2.setSpeed(-10); // 0���� ���� ���� 0�� �ǵ��� ������ġ�� private Ȱ���Ͽ� 
		//SUN���� �����Ǵ� �޼ҵ��� 99�ۼ�Ʈ�� public
		//�׷��� Math�� �����ڴ� private�̴�.
		//Math m = new Math();
		//Math�� ��ü �������� ��밡���� �ʵ�� �޼ҵ尡 ����.
	}
}
