package ch03;

public class WhileEx01 {
	public static void main(String[] args) {
		//while���� �̿��ؼ� 1~10������ ���� ���Ͻÿ�.
		int sum = 0;
		int i = 1;
		while(i<11) {
			sum+=i;
			i++;
		}
		System.out.println("sum :"+sum);
		// version 2- while
		int j = 0;
		while(true) {
			if(++j>10) {
				break;
			}
		System.out.println("���ѹݺ�");
	}
		//do-while ��
		do {
			System.out.println("do-while");
		}while(false);
	System.out.println("end");
 	}
}
