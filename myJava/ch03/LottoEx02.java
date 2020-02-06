package ch03;

import java.util.Arrays;
import java.util.Random;

public class LottoEx02 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] num = new int[6];
		
		int i, cnt, su;
		
		cnt = 0;
		jump:
		while(cnt<6) {
			su=rnd.nextInt(45)+1;
			for (i = 0; i < cnt; i++) {
				if(num [i] ==su )
					continue jump;
			}
			num[cnt++]=su;
			//System.out.print(num[i]+"\t");
		}
		Arrays.sort(num);
		for(int n : num) {
			System.out.printf("%4d",n);
		}
		System.out.println();
	}
}
