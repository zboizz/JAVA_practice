package practice;


// �߻� Ŭ����: �츮�� �����ؼ� ����� ���� �Ƹ� ���� ���� ��.
// �߻� �޼ҵ� ���� ����, �׷��� �ݵ�� �߻� Ŭ������ �߻�޼ҵ带 �����ؾ��� �������� ����.
// ex) abstract class Component ������ �߻�޼ҵ尡 ����
// �߻�Ŭ������ �Ϲ��ʵ� �� �޼ҵ� ������ �����ϴ�.
// �������� ��ü ������ �Ұ�

abstract class A06{
	int a;
	void m() {}
	abstract void p();
}

public class Ex06 {
	public static void main(String[] args) {
		//A06 a = new A06(); //�������� ��ü ������ �Ұ�����
		
		//���� ����� �ʹٸ� �Ʒ��� ���� ������� ��ü ����
		A06 a;
		//a = new A06();
	}
}
