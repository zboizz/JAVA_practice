package ch03;

public class BreakEx01 {
	public static void main(String[] args) {
		// break�� �ݺ��� �߰��� ������ �ݺ����� ��������.

		int a = 0;
		while (true) {
			if (a == 10) {
				break;
			}
			System.out.println("a : " + a);
			a++;
		} // --while
			//////////////////////////
			// ����. for�� ����Ͽ� 1~100������ ���� ���Ѵ�. �̶� ���� 100�� ���� ����� �ּҰ��� ����϶�.
		int sum = 0;
		for (int i = 0; i < 101; i++) {
			if (sum > 100) {
				sum -= i;
				break;
			}
			sum += i;
		}
		System.out.println("sum : " + sum);
		/////////////////
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 10; j++) {
				if (i + j > 10) {
					System.out.println(i + j);
					break;
				}
			} // --for2
		} // --for1
			/////////////////////////////////////////
		aaa: // label ����
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 10; j++) {
				if (i + j > 10) {
					System.out.println(i + j);
					break aaa;
				}
			} // --for2
		} // --for1
	}
}
