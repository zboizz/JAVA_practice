package ch0401;

import common.util.StringUtil;

//non-static 필드 및 메소드를 사용할 수 있는 시점은 객체를 반드시 생성한 후에야 사용 가능
//그러나 static 필드 및 메소드 객체 생성없어도 클래스명은 접근하여 사용할 수 있기 때문에 
//non-static 필드 및 메소드 생성되기 전에 static을 사용하려고 하니 무조건 에러가 발생됨.



class Static02{
	static int a = 10;
	
	int b = 20;  //non=static 필드는 static 메소드 사용 불가
	
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
		
		double d = 3.15; //반올림, 올림, 내림
		System.out.println(Math.round(d));
		System.out.println(Math.ceil(d));
		System.out.println(Math.floor(d));
		
		String s3 = "100000";
		String s4 = StringUtil.addComma(s3);
		System.out.println(s4);
		
	}
}
