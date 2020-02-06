package ch03;

public class BreakEx01 {
	public static void main(String[] args) {
		// break는 반복문 중간에 만나면 반복문을 빠져나옴.

		int a = 0;
		while (true) {
			if (a == 10) {
				break;
			}
			System.out.println("a : " + a);
			a++;
		} // --while
			//////////////////////////
			// 문제. for을 사용하여 1~100사이의 합을 구한다. 이때 합이 100에 가장 가까운 최소값을 출력하라.
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
		aaa: // label 설정
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
