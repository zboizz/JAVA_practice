package ch03;

import java.util.Scanner;

public class ArrayEx02 {
	public static void main(String[] args) {
		//5. �迭�� �������� ����� �� ���� �������� ����� ��찡 ����.
		Scanner sc=new Scanner(System.in);
		System.out.println("������ �迭�� ũ�⸦ ����ÿ�.");
		int len = sc.nextInt();
		String gg[] = new String[len];
		for(int i = 0; i < gg.length; i++) {
			System.out.println((i+1)+".");
		gg[i]=sc.next();
	}
		System.out.println("�Է��� �ɱ׷� �̸�");
		for(int i = 0; i < gg.length; i++) {
			System.out.println(gg[i]+"\t");
		} 
		sc.close();
	}
	}

