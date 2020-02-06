package ch02;

import java.util.Scanner;
//ScannerEx.java => ScannerEx01.java
public class ScannerEx01 {
		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요 :");
		String name = sc.next();
		System.out.println("입력한 이름:" +name);
			
		}
}
