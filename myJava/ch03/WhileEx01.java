package ch03;

public class WhileEx01 {
	public static void main(String[] args) {
		//while문을 이용해서 1~10까지의 합을 구하시오.
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
		System.out.println("무한반복");
	}
		//do-while 문
		do {
			System.out.println("do-while");
		}while(false);
	System.out.println("end");
 	}
}
