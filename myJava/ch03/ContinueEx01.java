package ch03;

public class ContinueEx01 {
	public static void main(String[] args) {
		// continue:���
		// 1~10������ ¦���� ���
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