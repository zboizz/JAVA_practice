package ch06;

public class StringEx02 {
	public static void main(String[] args) {
		String s1 = "Java Programming";
		System.out.println("문자열 길이" + s1.length());
		System.out.println("대문자 출력 : " + s1.toUpperCase());
		System.out.println("소문자 출력 : " + s1.toLowerCase());
		System.out.println("-----------------------");
		
		//s1.length() 에서 length는 메소드이기에 ()가 뒤따라온다
		//하지만 배열시에 존재하는 arr.length의 length는 상수로써 그 전에 입력해놓은
		//int arr[] = new int[3] 에서 3이 들어가게 된다. 그렇기에 뒤에 ()이 오지않는다.
		
		
		String s2 = s1.substring(5); //5번째 문자열부터 출력
		String s3 = s1.substring(5,8); //5~8번째 사이에 있는 문자출력
		System.out.println(s2); //programming
		System.out.println(s3); //pro
		System.out.println("----------------");
		
		
		//8번째 자리에 있는 문자
		char c1 = s1.charAt(8);
		System.out.println(c1); //g 출력
		System.out.println("----------------");
		
		//문제. s1의 짝수의 index값을 _로 표시하시오. (for, char)
		for (int i = 0; i < s1.length(); i++) {
			if(i%2 == 0) {
			System.out.print('_');
		}else {
			System.out.print(s1.charAt(i));
			}
		}
		System.out.println();
		System.out.println("----------------");
		
		
		//indexOf -> 문자열의 '앞'에서부터 검색하여 첫번째 'a'의 위치값 찾기
		int idx1 = s1.indexOf('a'); 
		System.out.println(idx1); 
		//lastIndexOf -> 문자열의 '뒤'에서부터 검색
		int idx2 = s1.lastIndexOf('a'); 
		System.out.println(idx2); 
		int idx3 = s1.indexOf('k');
		System.out.println(idx3); 
		//-1 값 출력됨-> 지정한 문자열이 존재하지 않기에
		
		int idx4 = s1.indexOf("Java");
		System.out.println(idx4);
		int idx5 = s1.indexOf('a',5);
		System.out.println(idx5);
		
		
		String s4 = s1.replace('a', 'q');
		System.out.println(s4);
		
		String s5 = "Java&Android&Spirng";
		String s6[] = s5.split("&");
		for (int i = 0; i < s6.length; i++) {
			System.out.println(s6[i]);
		}
	}
}
