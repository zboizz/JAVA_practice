package Youtube;


//피보나치 수열이란?
//앞의 수와 뒤의 수를 더하여 그 결과로 새로운 수를 생성
public class Class1201 {
	
public static int fibonacci(int number) {
	int one = 1;
	int two = 1;
	int result = -1; //-1은 나올수 없음
	
	if(number == 1)
	{
		return one;
	}
	else if(number ==2)
	{
		return two;
	}
	else
	{
		for(int i =2; i < number; i++)
		{
			result = one + two;
			one = two;
			two = result;
		}
	}
	return result;
}



	public static void main(String[] args) {
		System.out.println(fibonacci(10));
	}
}
