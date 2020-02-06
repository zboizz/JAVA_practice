package ch04;

//메소드는 절대로 자동으로 만들어 주는 경우는 없음
class Constructor03 {
	// 디폴트 생성자만 JVM이 제공을 해준다.
	// JVM은 생성자가 하나라도 선언이 되어있으면 디폴트생성자를 제공하지않음
	Constructor03(int i) {
	}

}

public class ConstructorEx03 {

	public static void main(String[] args) {
		Constructor03 c = new Constructor03(0);
		Constructor03 c1 = new Constructor03(22);
	}
}
