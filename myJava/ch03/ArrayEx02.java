package ch03;

import java.util.Scanner;

public class ArrayEx02 {
	public static void main(String[] args) {
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

