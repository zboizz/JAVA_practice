package ch04;


//���� Ŭ����
//Ŭ���� : ��ü�� ����� Ʋ
//Ŭ���� �ȿ��� field(�ʵ�): ��ü�� �Ӽ�
//              method(�޼ҵ�) : ��ü�� ���
class Car01{
	String carName;
	int velocity;
	String carColor;
	
	//�޼ҵ�: ��ü�� ���
	void speedUp() {
		velocity++;
	}
	void speedDown() {
		velocity--;
		if(velocity<0) {
			velocity = 0;
		}
	}
}//----class

//����: �����ϱ� ���� Ŭ����
public class CarEx01 {
public static void main(String[] args) {
	//�� ���� Ŭ������ ������ ��ü �����Ͽ� �ʵ� �� �޼ҵ带 ����Ѵ�.
	//������ ���� Ŭ������ �̿��Ͽ� �޸𸮻� ��ü�� ����
	Car01 c = new Car01(); //'new'�� ��ü�� ����� �����
	//'c'�� ������ ��ü�� ����Ű�� �ִٰ��ؼ� ���۷��� ������ ���´´�.
	//���۷��� ����. �ʵ� or ���۷��� ����.�޼ҵ�->���� ��
	c.carName = "�׷���";
	c.carColor = "white";
	c.speedUp();
	
	//SUN���� �����Ǵ� Ŭ������ ������ ��ü�� ����
	String s=new String(); //String�̶� ���ڸ� ��üȭ�� Ŭ����
	s.toLowerCase();
 	}
}
