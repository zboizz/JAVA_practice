package ch0501;

//�߻�Ŭ����
// 1. Ŭ���� �տ� abstract�� �´�
// 2. �߻�Ŭ������ �߻�޼ҵ带 ���� �� �ִ�.
// 3. �ݵ�� �߻�Ŭ������ �߻�޼ҵ带 ���� �ʿ�� ����.
// 4. �߻�޼ҵ�� �ݵ�� �߻�Ŭ������ �ȿ� ������ �Ǿ�� �Ѵ�.
// 5. �߻�޼ҵ�� �޼ҵ� ����θ� �ְ� �����δ� ����.
// 6. �߻�Ŭ������ �Ϲ��ʵ� �� �Ϲ� �޼ҵ� ������ �����ϴ�.

abstract class Abstract01{
	int a =0;
	abstract void prn();
	void mrn() {}
}

//�߻� Ŭ������ ��ӹ޴� �Ϲ� Ŭ����
// 1. ���������� �߻�޼ҵ�� �������̵��� �ؾ��Ѵ�.
// 2. �������� �Ϲ� ����̶� �Ȱ���.

class Normal01 extends Abstract01{
   	@Override
   	void prn() {
   		
   	}
}
public class AbstractEx01 {
	public static void main(String[] args) {
		Normal01 n = new Normal01();
		Abstract01 a;
	//	a = new Abstract01(); //�߻�Ŭ������ ��ü ���� �Ұ���
		a = n; //���� Ŭ���� ��ü�� ���۷����� �����ϴ�.
	}
}
			
