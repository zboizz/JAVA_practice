package ch02;

public class Ex06 {

	public static void main(String[] args) {
		//�ڹ� Ÿ��: �⺻��(8����) vs ������(Ŭ���� Ÿ��: SUN + ������)
		String s = new String();//String Ŭ������ ��ü�� �ϳ� ����
		// String.java -> String.class ����
		Ex06 e = new Ex06();
		
		//null ����
		String s1 = null; // ���� ��ü�� ���� ����
		int i;
		
		//JDK 7 ����
		int j = 10_10;
		int n = 12_34_56;
		System.out.println(j+":"+n);
		
		//var Ű����:�������� ���� Ÿ��, �ݵ�� ���� �Ҵ��Ͽ��� �Ѵ�.
		var price = 20;
		var name = "ȫ�浿";
		var pi = 3.14;
		var s2 = new String();
		//var s3;
		int i3;
		
	}

}
