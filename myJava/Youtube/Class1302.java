package Youtube;
// 100개의 랜덤 숫자들의 평균 구하기


public class Class1302 {
	public static void main(String[] args) {
		
		int[] array = new int[100];
		for (int i = 0; i < 100; i++) {
			array[i] = (int) (Math.random() * 100 + 1);
			//Math.random() --> 0부터 시작하는 숫자중에 랜덤으로 가져옴
		}
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			sum +=array[i];
		}System.out.println(sum/100);	
	}
}
