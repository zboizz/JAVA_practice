package Youtube;

public class Class1101 {

	
		//5! = 5*4*3*2*1 = 120 (factorial)
	public static int factorial(int number) {         //number��� �Ű������� ���ڸ� �־ ���� ��´�.
		int sum = 1;
		for (int i = 2; i <= number; i++) {
			sum *= i;
		}
		return sum;
		
	//	if(number == 1)
	//		return 1;
	//	else
	//		return number * factorial(number - 1);    //5! = 5 * 4!
	}
	
	
	public static void main(String[] args) {
		System.out.println("10 ���丮���� " + factorial(10));
	}
}
