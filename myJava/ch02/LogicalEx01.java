package ch02;

public class LogicalEx01 {
	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		int c = 0;
		//System.out.println((a>b)&(a/2==5));
		//&&, ||는 뒤 논리값이 전체 논리값에 영향을 미치지 않는다면 실행안됨
		System.out.println((a<b)&&(a/c==0));
		System.out.println((a<b)||(a-b==6)); 
		//c값은 0이다. 즉, 0으로 나누는 것 자체가 식이 성립되지 않는다. 
		//앞의 논리값이 true라면 뒤의 논리값까지 과정이 진행되는데 이때 에러가 발생하여 실행되지않는다.
		//그러나 앞의 놀리값이 false라면 뒤의 놀리값까지 과정이 진행되지않아 false값으로 출력되어 실행된다.
		System.out.println((a>b)^(a%b==0)); //두개의 값이 같지 않으면 true 같으면 false
		System.out.println(!(a<b));
	}
}
