package ch02;

public class LogicalEx01 {
	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		int c = 0;
		//System.out.println((a>b)&(a/2==5));
		//&&, ||�� �� ������ ��ü ������ ������ ��ġ�� �ʴ´ٸ� ����ȵ�
		System.out.println((a<b)&&(a/c==0));
		System.out.println((a<b)||(a-b==6)); 
		//c���� 0�̴�. ��, 0���� ������ �� ��ü�� ���� �������� �ʴ´�. 
		//���� ������ true��� ���� �������� ������ ����Ǵµ� �̶� ������ �߻��Ͽ� ��������ʴ´�.
		//�׷��� ���� ����� false��� ���� ������� ������ ��������ʾ� false������ ��µǾ� ����ȴ�.
		System.out.println((a>b)^(a%b==0)); //�ΰ��� ���� ���� ������ true ������ false
		System.out.println(!(a<b));
	}
}
