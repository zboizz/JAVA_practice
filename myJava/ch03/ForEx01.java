package ch03;

public class ForEx01 {
	
	public static void main(String[] args) {
	
		//for���� �̿��Ͽ� 1~10������ ���� ���Ͻÿ�.
		int sum = 0;
		for (int i = 0; i < 11; i++) {
			sum+=i;	//sum=sum+i
		}System.out.println(sum);
		////
		for (int i = 0, j=0; i < 10; i++,j--) {
			System.out.println(i+j);
		}
		for (int i = 216477880; i < Integer.MAX_VALUE; i++) {
			System.out.println(i);
			
		}
	}
}
