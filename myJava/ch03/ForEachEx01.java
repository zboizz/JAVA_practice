package ch03;

public class ForEachEx01 {
	public static void main(String[] args) {
		//for-each: 배열이나 자료구조 클래스(Collection) 각 원소를 순차적으로 접근
		int arr[] = {1,2,3};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println("sum : " + sum);
		
		sum=0;
		for (int i : arr) {
			sum+=i;
		}
		System.out.println("sum : " + sum);
		//
		String str[] = {"아이린", "손나은", "조보아", "혜리", "수지", "나라", "베컴"};
		for (String s : str) {
			System.out.println(s);
		}
	}
}
