package Youtube;

import java.util.Scanner;

public class Class1301 {

	public static int max(int a, int b) {
		return (a>b) ? a:b;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("������ �迭�� ũ�⸦ �Է��ϼ��� : ");
		int number = s.nextInt();
		int[] array = new int[number];
		for (int i = 0; i < number; i++) {
			
			System.out.println("�迭�� �Է��� ������ �ϳ� �Է�: ");
			array[i] = s.nextInt();
		}
		int result = -1;
		for (int i = 0; i < number; i++) {
			result = max(result, array[i]);
					
		}System.out.println("���� ū ����? : " + result);
	}
}
