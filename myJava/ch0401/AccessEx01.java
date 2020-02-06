package ch0401;

//접근지정자(제어자): private, protected, public
// 1. private: 필드, 메소드
// 2. protected: 필드, 메소드
// 3. public: 필드, 메소드, 클래스(99%를 차지) -->클래스는 무조건 'public'


/*public*/ class Access01{
	//public 붙일시 에러가 발생--->하나의 .java에 저장한 클래스는 클래스명.java의 클래스명만 public을 사용.
	//다른 클래스는 public을 사용하지 않는다. ex) 파일명-->AccessEx01.java--->public class AccessEx01{} 
	
	//이유는 public이 없는 클래스는 public이 있는 클래스에서만 사용하는 것이 일반적인 방법으므로
	//public이 올 수 없다.
}



public class AccessEx01 {

	public static void main(String[] args) {
		
	}
}
