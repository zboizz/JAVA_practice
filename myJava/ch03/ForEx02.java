package ch03;

public class ForEx02 {
	public static void main(String[] args) {
		//����1. 1~30������ ���߿� 3�� ����� ���� ���Ͻÿ�.
		//����2. 1~30������ ���߿� ¦���� Ȧ���� ���� ���� ���Ͻÿ�.
		 
		int sum=0, couple=0, hole=0; 
		for (int i=1; i < 31; i++) {
			if(i%3==0){
			sum+=i;}
			if(i%2==0){
			couple+=i;}
			if(i%2==1){
			hole+=i;}
		}System.out.println(sum);
		 System.out.println(couple);
		 System.out.println(hole);
		 
		 //3��
		 String star = "*";
		 for (int i = 0; i < 5; i++) {
			 System.out.println(star);
			 star+="*";			
		}
		 System.out.println("--------------");
		 for (int i = 1; i < 6; i++) {
			 for (int j = 0; j < i; j++) {
				 System.out.print("*");
			 }
			 System.out.println();			
		}
	}
}
		

