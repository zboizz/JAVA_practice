package ch06;

public class WrapperEx04 {

	//������ �����μ��� �Է¹��� ������ ���� ����ϴ� �޼ҵ带 �����Ͻÿ�.
	public static void plus(int...arr) {
		int plus = 0;
		for (int i = 0; i < arr.length; i++) {
			plus+=arr[i];
		}
		System.out.println(plus);
	}
	
	
	public static void main(String[] args) {
	
		WrapperEx04 p = new WrapperEx04();
		p.plus(1,2);
		p.plus(1,2,3);
		p.plus(1,2,3,4,5,6,7,8,9);
	}
	
}
