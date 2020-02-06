package ch03;

import java.util.Arrays;
import java.util.Random;

//로또: 제어문(조건문, 반복문), 배열에 대한 연습

public class Lotto {
	public static void main(String[] args) {
		int lotto[] = new int[6];
		Random r = new Random(); //random 활용
		/*System.out.println(r.nextInt(45)); // '0~44'의 범위 
		System.out.println(r.nextInt(45)); 
		System.out.println(r.nextInt(45)); */
		for (int i = 0; i < lotto.length; i++) {
			lotto[i]=r.nextInt(45)+1;
			for (int j = 0; j < i; j++) {
				if(lotto[j]==lotto[i]) { //i와 j값을 비교하여 중복을 확인한다.
					i--; //다시 for문을 돌리게 하기 위하여 i값을 '1'감소시킨다.
					break; 
				}
			}
			//System.out.print(lotto[i]+ "\t");
		}
		
		Arrays.sort(lotto);
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]+ "\t"); //중복을 없애주어야함.
		}
	}
}
