package ch03;

import java.util.Arrays;
import java.util.Random;

//�ζ�: ���(���ǹ�, �ݺ���), �迭�� ���� ����

public class Lotto {
	public static void main(String[] args) {
		int lotto[] = new int[6];
		Random r = new Random(); //random Ȱ��
		/*System.out.println(r.nextInt(45)); // '0~44'�� ���� 
		System.out.println(r.nextInt(45)); 
		System.out.println(r.nextInt(45)); */
		for (int i = 0; i < lotto.length; i++) {
			lotto[i]=r.nextInt(45)+1;
			for (int j = 0; j < i; j++) {
				if(lotto[j]==lotto[i]) { //i�� j���� ���Ͽ� �ߺ��� Ȯ���Ѵ�.
					i--; //�ٽ� for���� ������ �ϱ� ���Ͽ� i���� '1'���ҽ�Ų��.
					break; 
				}
			}
			//System.out.print(lotto[i]+ "\t");
		}
		
		Arrays.sort(lotto);
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]+ "\t"); //�ߺ��� �����־����.
		}
	}
}
