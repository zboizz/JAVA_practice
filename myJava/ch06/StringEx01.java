package ch06;

public class StringEx01 {
	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = new String("Java");
		
		
		/*new �����ڸ� ������� ����   String ��ü�� String ����� ���������.
		* String ����ҿ� ����� ���� ��ü�� �̸� ����� ���� �˻縦 �Ѵ�.
		* ���� ������ ���ڿ��� �ִٸ� �װ��� �����Ѵ�.
		*/
		
		
		String s3 = "Java";
		String s4 = "Java";
		//������ type�� ==�� ���۷��� �ּҰ� ��
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		System.out.println("----------------");
		
		//���ڿ� �� �޼ҵ�
		System.out.println(s1.equals(s2)); //equals(object):boolean-string �������̵�
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
		System.out.println("-------------------");
		//�� �� java�̱⿡ ��� true�� ����� ����
		
		String s5 = "APPLE";
		String s6 = "apple";
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6)); //��ҹ��� ���������ʰ� ��
		System.out.println("------------------");
		
		
		
		//String ��ü�� ������ �ѹ� ��������� �����̴�. 
		//���� �߰� ���ڿ��� ������ �� �ٸ� ���ڰ� ����� ���� ������ ������ �ִ�.
		//�̷��� ���� �����ϱ� ���Ͽ� StringBuffer Ŭ������ ����
		String s7 = "�ڹ�";
		s7 +="�����";//String ����ҿ� �ΰ��� ���ڿ��� �������. "�ڹ�","�ڹٹ����"
		System.out.println(s7);
	
		
		
	}
}



