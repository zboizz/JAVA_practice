package ch04;

//�޼ҵ�� ����� �ڵ����� ����� �ִ� ���� ����
class Constructor03 {
	// ����Ʈ �����ڸ� JVM�� ������ ���ش�.
	// JVM�� �����ڰ� �ϳ��� ������ �Ǿ������� ����Ʈ�����ڸ� ������������
	Constructor03(int i) {
	}

}

public class ConstructorEx03 {

	public static void main(String[] args) {
		Constructor03 c = new Constructor03(0);
		Constructor03 c1 = new Constructor03(22);
	}
}
