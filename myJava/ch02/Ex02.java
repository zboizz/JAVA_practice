package ch02;

public class Ex02 {
	public static void main(String[] args) {
		//식별자: 클래스, 변수, 메소드 등에 붙이는 이름
		//1. 반드시 문자로 시작, 숫자로 시작하면 에러발생
		//2. 특수문자 중 유일하게 '$ , _'는 허용
		//3. 예약어로는 안됨. ex) package, class 와 같은 모든 적홍색 
		//4. 대소문자 구분 ex)true=X, True = O
		int aa= 22;
		//int 2a= 22; int 뒤에 2;숫자로 시작하여 에러 발생
		int a2= 22;
		
		String $a= "서울";
		String _a= "부산";
		//String &a= "대전"; 특수문자 중에 $와 _ 는 허용되지만 다른 특수문자 사용시 에러 발생
		
		boolean b1 = true;
		boolean b2 = false;
		//boolean true = true; true는 에러 발생, True는 사용 가능
		boolean True = true;
	}

}
