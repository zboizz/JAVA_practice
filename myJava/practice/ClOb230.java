package practice;

import java.util.Scanner;

class CurrencyConverter {
	private static double rate;
	public static double toDollar(double won) {
		return won/rate; //��ȭ�� �޷��� ��ȯ
	}
	public static double toKWR(double dollar) {
		return dollar * rate; //�޷��� ��ȭ�� ��ȯ
	}
	public static void setRate(double r) {
		rate=r; //ȯ������
	}
}

public class ClOb230 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ȯ��(1�޷�)>>");
		double rate = s.nextDouble();
		CurrencyConverter.setRate(rate);
		System.out.println("�鸸���� $"+ CurrencyConverter.toDollar(1000000)+"�Դϴ�");
		System.out.println("$100��" + CurrencyConverter.toKWR(100)+"���Դϴ�");
		s.close();
		
	}
}
