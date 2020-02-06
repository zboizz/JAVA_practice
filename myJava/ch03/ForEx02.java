package ch03;

public class ForEx02 {
	public static void main(String[] args) {
		//문제1. 1~30사이의 값중에 3의 배수의 합을 구하시오.
		//문제2. 1~30사이의 값중에 짝수와 홀수의 합을 각각 구하시오.
		 
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
		 
		 //3번
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
		

