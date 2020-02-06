package ch03;

import java.util.Arrays; //정렬
import java.util.Random; //랜덤

//로또: 제어문(조건문, 반복문), 배열에 대한 연습

public class LottoEx03 {
	public static void main(String[] args) {
		int lotto[] = new int[6];
		Random r = new Random(); //random 활용
		/////////////////////////////////////////////
		for (int i = 0; i < lotto.length; i++) { 			
			lotto[i] = r.nextInt(45)+1;
			for (int j = 0; j < i; j++) {
				//i의 값이 내려오고 j의 값에 따라서 전에 있는 i값을 비교하고 같다면 다시 위로 올라가서 시작
				if(lotto[i]==lotto[j]) {
					//i와 j값을 비교하여 중복을 확인한다.
					i--;//다시 for문을 돌리게 하기 위하여 i값을 '1'감소시킨다.
					break;
				}
			}
		}
		////////////////////////////////////////////
			
		/*for (int i = 0; i < lotto.length; i++) {
			lotto[i]=r.nextInt(45)+1;
			for (int j = 0; j < i; j++) { 
			//i의 값이 내려오고 j의 값에 따라서 전에 있는 i값을 비교하고 같다면 다시 위로 올라가서 시작
				if(lotto[j]==lotto[i]) { 
				//i와 j값을 비교하여 중복을 확인한다.
					i--; 
					//다시 for문을 돌리게 하기 위하여 i값을 '1'감소시킨다.
					break; 
				}
			}
			//System.out.print(lotto[i]+ "\t");
		}*/
		
		Arrays.sort(lotto);
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]+ "\t"); //중복을 없애주어야함.
		}
	}
}
