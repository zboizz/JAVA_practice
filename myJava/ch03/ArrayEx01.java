package ch03;

import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		//�迭: ������ ������ Ÿ���� �ϳ��� ���� ����ϱ� ���� ����. �ѹ� ������ ũ��� �Һ�
		
		int arr[]; //1.�迭����(int[] arr)
		String[] str;
		
		arr= new int[5]; // 2. �迭�� ũ�� ����
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i+1)*10;
			System.out.println("arr["+i+"] : " + arr[i]);
		}
		//arr[5] = 60;
	int arr2[] = new int[3];
	arr2[0]=1;
	arr2[1]=2;
	arr2[2]=3;
	
	//4. �迭�� ����� ���� ���� �Ҵ�;
	int arr3[]= {1,2,3,4,5};
	String str2[] = {"��","��","��"};
	
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