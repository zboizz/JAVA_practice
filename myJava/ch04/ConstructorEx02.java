package ch04;

//�����ε�(overloading): ���� Ŭ������ ������ �̸����� �޼ҵ带 ����
//��, �Ű������� Ÿ�԰� ������ �޶�� �Ѵ�.
//ex) System.out.println();, Math.max(); �̿� ���� �͵��� �����ε��� �Ȱ��̶�� �� �� �ִ�.

class Constructor02{
	public Constructor02() {}
	public Constructor02(int i) {}
	public Constructor02(String s) {}
}

public class ConstructorEx02 {
	public static void main(String[] args) {
		//�����ڰ� ���� �����ϴ� ������ ��ü�� �����Ǵ� �پ��� case
		//String Ŭ������ ������ 15�� ����
		Constructor02 c1 = new Constructor02();
		Constructor02 c2 = new Constructor02(22);
		Constructor02 c3 = new Constructor02("��������");
		String s = new String();
	}
}
