package ch03;

public class ContinueEx01 {
	public static void main(String[] args) {
		// continue:계속
		// 1~10사이의 짝수만 출력
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.print(i + "\t");
			}
		} // ------for
		System.out.println("\n----------------------------------");
		for (int i = 1; i < 11; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.print(i + "\t");
		}
	}
}