package ch05;


class Person{
	void 말하기() {}
	void 먹기() {}
	void 걷기() {}
	void 잠자기() {}
}
class Student extends Person {
	void 공부하기() {}
}
class StudentWorker extends Student{
	void 일하기() {}
}
class Researcher extends Person {
	String 연구하기 () {return null;}
}
class Professor extends Researcher{
	int 가르치기() {return 0;}
}



public class InheritanceEx01 {
	public static void main(String[] args) {
		
	}
}
