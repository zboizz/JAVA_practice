package ch02;

import java.util.Scanner;

//Ternary : ������
public class TernaryEx01 {
	public static void main(String[] args) {
		//���� ������ or ���׿�����
		int a = 10;
		int b = 3;
		int c = a>b ? a:b;
		int d = Math.max(a, b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		
		//�Է��� ���� ������� �������� ����Ͻÿ�
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int e = sc.nextInt(); //�Է��ϴ� ����
		String msg = (e>0)? "���" : "����"; //������ ����ϴ� Ʋ
		System.out.println(e+ "��(��) " + msg); //�����Ͽ� ���
		}
}
