package ch02;

public class Ex03 {
	public static void main(String[] args) {
		//Date Type
		//1. �⺻�� 8����
		// a. ����: char
		// b. ����: byte, short, int, long
		// c. �Ǽ�: float, double
		// d. ��: boolean
		// -> �⺻�� 8������ �����
		//2. �������� ���Ѵ�, ��ǥ���� Type: String
		
		char c = 'a';        //���� �� ��
		char c1 = '��';      // ���� �� ��
		//char c2 = 'ab'; 	 // ���� �� �� �ʰ��Ͽ� ���� �߻� 
		
		byte b = 1;
		short s = 10;
		//short s1 = 32768; // short�� ������ ���, (-32768~32767)
		
		int i = 32768;
		long I =123456789;
		//�Ǽ��� �⺻ Ÿ���� double�̱� ������ float���� ������ �ϱ� ���ؼ��� f, F�� �ڿ� ���δ�.
		float f = 3.14f; 
		float f1 = 3.14F;
		
		double d = 3.14;
		//�⺻�� Ÿ���� ������ ����
		
		//**short, Byte, Integer, Long�� ������ ���Ͻÿ�.
		System.out.println(Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE+"~"+Short.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE+"~"+Long.MAX_VALUE);
		
		//������: String(���� �ƴ�)
		String s1= "����"; //���ڿ� Ÿ��
		String s2= "��"; //���ڿ� Ÿ��
		String s3= "����"+22; //���ڿ�+���ڴ� �ڵ����� ���ڿ� "����22"���� ����
		
	
				
	}
}
