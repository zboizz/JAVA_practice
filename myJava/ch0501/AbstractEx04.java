package ch0501;

//Shape : ������ �߻�ȭ ��Ų Ŭ����

abstract class Shape{
		int x, y;
		void move(int x, int y) {
			this.x =x;
			this.y =y;
		}
		abstract void draw();
}
//�ﰢ��
class Triangle extends Shape{
	@Override
	void draw() {
		System.out.println("�ﰢ�� �׸���");
	}
}
//�簢��
class Rectangle extends Shape{
	@Override
	void draw() {
	System.out.println("�簢�� �׸���");
	}
}
//��
class Circle extends Shape{
	@Override
	void draw() {
	System.out.println("���׶�� �׸���");
	}
}


public class AbstractEx04 {
	public static void main(String[] args) {
		
		
	}
}
