package ch02;

public class Ex04 {

	public static void main(String[] args) {
		//���� ����
		int price = 20;   //���ʿ� price�� ���� 20���� ����
		price = 30;       //�ι�° �ٿ� price ���� 30���� ����, �߰��� �� �ʿ�� ���� ����
		System.out.println(price);
		
		
		char c1, c2, c3;
		c1 = 'a';
		c2 = '��';
		c3 = '1';
		
		//���ͷ�:������ ���� ǥ���� ���
		
		int n, m, k, g; //������ �⺻�� Ÿ���� int
		n=15;
		m=015;//8����
		k=0x1A;//16����
		g=0b0101;//2����
		System.out.println(n+"+"+m+"+"+k+"+"+g);
	
		long I = 24L; //l or L
		//�Ǽ��� �⺻�� Ÿ���� double
		float f = 3.14f; //float���� ū Ÿ���� ���ͷ� ���� �Ҵ��� �Ǹ� ���� �߻�
		//f or F 
		double d = 3.0;
		System.out.println(d*3); //����*�Ǽ��� ������ �Ǽ��� ����ȯ �߻� ���Ŀ� ���=9.0
		System.out.println(10/3); //����/������ ������ ���=3 �Ҽ����� ����
		
		//���� ���ͷ�
		char a1 = 'A';
		char a2 = '\u0041';
		//System.out.println(a1+":"+a2);
		char a3='\uac00';
		System.out.println(a1+":"+a2+":"+a3);
		char a4 = '��';
		System.out.println(a1+":"+a2+":"+a3+":"+a4);
		
	}

}
