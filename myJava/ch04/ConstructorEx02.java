package ch04;

//오버로딩(overloading): 같은 클래스에 동일한 이름으로 메소드를 선언
//단, 매개변수의 타입과 갯수가 달라야 한다.
//ex) System.out.println();, Math.max(); 이와 같은 것들이 오버로딩이 된것이라고 볼 수 있다.

class Constructor02{
	public Constructor02() {}
	public Constructor02(int i) {}
	public Constructor02(String s) {}
}

public class ConstructorEx02 {
	public static void main(String[] args) {
		//생성자가 많이 존재하는 이유는 객체가 생성되는 다양한 case
		//String 클래스는 생성자 15개 존재
		Constructor02 c1 = new Constructor02();
		Constructor02 c2 = new Constructor02(22);
		Constructor02 c3 = new Constructor02("맨유시절");
		String s = new String();
	}
}
