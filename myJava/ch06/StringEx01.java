package ch06;

public class StringEx01 {
	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = new String("Java");
		
		
		/*new 연산자를 사용하지 않은   String 객체는 String 저장소 만들어진다.
		* String 저장소에 만들어 지는 객체를 미리 만들기 전에 검사를 한다.
		* 만약 동일한 문자열이 있다면 그것을 참조한다.
		*/
		
		
		String s3 = "Java";
		String s4 = "Java";
		//참조형 type의 ==는 레퍼런스 주소값 비교
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		System.out.println("----------------");
		
		//문자열 비교 메소드
		System.out.println(s1.equals(s2)); //equals(object):boolean-string 오버라이딩
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
		System.out.println("-------------------");
		//넷 다 java이기에 모두 true로 결과가 나옴
		
		String s5 = "APPLE";
		String s6 = "apple";
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6)); //대소문자 구별하지않고 비교
		System.out.println("------------------");
		
		
		
		//String 객체의 내용은 한번 만들어지면 고정이다. 
		//만약 추가 문자열이 있으면 또 다른 문자가 만들어 지는 원리를 가지고 있다.
		//이러한 점을 보완하기 위하여 StringBuffer 클래스가 존재
		String s7 = "자바";
		s7 +="배우자";//String 저장소에 두개의 문자열이 만들어짐. "자바","자바배우자"
		System.out.println(s7);
	
		
		
	}
}



