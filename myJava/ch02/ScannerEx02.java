package ch02;

import java.util.Scanner;

public class ScannerEx02 {
		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Scanner Ŭ������ �ܼ�â�� ������� �Է°��� �޴� ���
		//����, ����, �Ǽ�, �������� ���� �޾Ƴ� �� ����
		//��� �Ŀ��� �ݵ�� close�� �ؾ���
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");
		String name = sc.next();//���ڿ�
		String city = sc.next();
		int age = sc.nextInt(); //����
		double weight = sc.nextDouble(); //�Ǽ�
		boolean single = sc.hasNextBoolean(); //����
		System.out.println("name:"+ name);
		System.out.println("city:"+ city);
		System.out.println("age:"+ age);
		System.out.println("weight:"+ weight);
		System.out.println("single:"+ single+ "�Դϴ�");
		}
}
