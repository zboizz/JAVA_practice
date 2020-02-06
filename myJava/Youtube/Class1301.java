package Youtube;

import java.util.Scanner;

public class Class1301 {

	public static int max(int a, int b) {
		return (a>b) ? a:b;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("생성할 배열의 크기를 입력하세요 : ");
		int number = s.nextInt();
		int[] array = new int[number];
		for (int i = 0; i < number; i++) {
			
			System.out.println("배열에 입력할 정수를 하나 입력: ");
			array[i] = s.nextInt();
		}
		int result = -1;
		for (int i = 0; i < number; i++) {
			result = max(result, array[i]);
					
		}System.out.println("가장 큰 값은? : " + result);
	}
}
