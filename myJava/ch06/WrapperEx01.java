package ch06;



//parse: 사전적 의미로 분석하다.




public class WrapperEx01 {
	public static void main(String[] args) {
		Integer it1 = new Integer(10);
		Integer it2 = new Integer("20");
		Integer it3 = 30;
		
		
		int n1 = it1.intValue();
		int n2 = it2.intValue();
		System.out.println(n1+n2);
		String s1 = "30";
		String s2 = "40";
		String s3 = "3.14"; //실수
		System.out.println(s1 + s2);
		int n3 = Integer.parseInt(s1);
		int n4 = Integer.parseInt(s2);
		
		double d1 = Double.parseDouble(s3);
		System.out.println(n3+n4+d1);
		System.out.println(Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		
		int n5 = 70;
		
		
		//2,8,16진수 출력하시오.(API) : Hint는 to로 시작
		String bin = Integer.toBinaryString(n5); //2진수
		String oct = Integer.toOctalString(n5);  //8진수
		String hex = Integer.toHexString(n5);    //16진수
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
	////////////////////////////////////////////////
		System.out.println(Integer.toBinaryString(n5));
		System.out.println(Integer.toOctalString(n5));
		System.out.println(Integer.toHexString(n5));
		
		Integer it4 = Integer.valueOf(30);
		Integer it5 = Integer.valueOf("30");
				
	
	}
}
