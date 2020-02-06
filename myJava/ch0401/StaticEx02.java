package ch0401;

import common.util.StringUtil;

//non-static �ʵ� �� �޼ҵ带 ����� �� �ִ� ������ ��ü�� �ݵ�� ������ �Ŀ��� ��� ����
//�׷��� static �ʵ� �� �޼ҵ� ��ü ������� Ŭ�������� �����Ͽ� ����� �� �ֱ� ������ 
//non-static �ʵ� �� �޼ҵ� �����Ǳ� ���� static�� ����Ϸ��� �ϴ� ������ ������ �߻���.



class Static02{
	static int a = 10;
	
	int b = 20;  //non=static �ʵ�� static �޼ҵ� ��� �Ұ�
	
	void prn() {
	System.out.println(a);	
	System.out.println(b);	
	}
	static void prn1() {
		System.out.println(a);	
		//System.out.println(b);		
	}
}


public class StaticEx02 {
	public static void main(String[] args) {
		Integer i = new Integer(22);
		String s = "123";
		String s1 = "456";
		System.out.println(i.parseInt(s)+i.parseInt(s1));
		System.out.println(Integer.parseInt(s)+Integer.parseInt(s1));
		
		double d = 3.15; //�ݿø�, �ø�, ����
		System.out.println(Math.round(d));
		System.out.println(Math.ceil(d));
		System.out.println(Math.floor(d));
		
		String s3 = "100000";
		String s4 = StringUtil.addComma(s3);
		System.out.println(s4);
		
	}
}
