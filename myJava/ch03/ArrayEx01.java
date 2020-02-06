package ch03;

import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		//배열: 동일한 데이터 타입을 하나의 변수 사용하기 위한 목적. 한번 정해진 크기는 불변
		
		int arr[]; //1.배열선언(int[] arr)
		String[] str;
		
		arr= new int[5]; // 2. 배열의 크기 지정
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i+1)*10;
			System.out.println("arr["+i+"] : " + arr[i]);
		}
		//arr[5] = 60;
	int arr2[] = new int[3];
	arr2[0]=1;
	arr2[1]=2;
	arr2[2]=3;
	
	//4. 배열을 선언과 동시 값을 할당;
	int arr3[]= {1,2,3,4,5};
	String str2[] = {"가","나","다"};
	
	//5. 배열은 정적으로 만드는 것 보다 동적으로 만드는 경우가 많음.
	Scanner sc=new Scanner(System.in);
	System.out.println("생성할 배열의 크기를 만드시오.");
	int len = sc.nextInt();
	String gg[] = new String[len];
	for(int i = 0; i < gg.length; i++) {
		System.out.println((i+1)+".");
	gg[i]=sc.next();
}
	System.out.println("입력한 걸그룹 이름");
	for(int i = 0; i < gg.length; i++) {
		System.out.println(gg[i]+"\t");
	} 
	sc.close();
}
}