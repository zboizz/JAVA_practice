package ch05;

class Overriding01{
	//메소드 오버라이딩일때 부모클래스 메소드의 접근제어자보다는
	//크거나 같아야 한다.
	//만약 작다면 컴파일 에러가 발생이 되고 동적 바인딩 문제가 되는걸로 파악이 됨
	public void aaa() {}
	protected void bbb() {}	
	protected void ccc() {}	
	
}

class Overriding02 extends Overriding01{
	//@Override
	//protected void bbb() {}
	@Override
	protected void bbb() {}
	@Override
	public void ccc() {}
	
}


public class OverridingEx01 {
public static void main(String[] args) {
	
}
}

