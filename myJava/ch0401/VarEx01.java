package ch0401;


class Var01{
	
	void plus(int a, int b) {
		System.out.println(a+b);
	}
	void plus(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	void plus(int arr[]) {                   //�迭�� �޴� ���
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}
}	
class Var02{                              //�����μ�
		
	void plus(int...arr) {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum+=arr[i];
			}
			System.out.println(sum);
		}
	}

	public class VarEx01 {
	public static void main(String[] args) {
		
				
		Var01 v = new Var01();
		v.plus(22, 23);
		v.plus(22, 23, 7);
		int arr[]= {1,2,3,4,5,6};
		v.plus(arr);
		
		Var02 v2 = new Var02();
		v2.plus(1,1);
		v2.plus(1,2,3,4,5,6,7);
		v2.plus(3,4,5,6,6);
																	
		int a = 10;
		int b = 20;
		int c = 30;
		int sum = a+b+c;
		// a , b , c�� �հ踦 �İ� �Բ�  ����غ�����
		System.out.println(a+ "+" +b+ "+" +c + "="+(a+b+c));
		System.out.println(a+ "+" +b+ "+" +c + "="+sum);
		System.out.printf("%d+%d+%d=%d",a,b,c,sum); //����+����+����=����
		
	}
}
