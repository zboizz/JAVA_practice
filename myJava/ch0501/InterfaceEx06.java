package ch0501;

interface Phone{	//인터페이스 선언
	int TIMEOUT = 1000; //상수 필드 선언
	void sendCall(); //추상 메소드
	void receiveCall(); //추상 메소드
	default void printLogo() { //default 메소드
		System.out.println("**Phone**");
	}
}
interface MobilePhone extends Phone{    //인터페이스 상속
	void sendSMS();
	void receiveSMS();
	
}
interface MP3{		//인터페이스 선언
	void play();
	void stop();
}


class PDA{ 		//클래스 작성
	public int calculate(int x, int y) {
		return x + y;
	}
}



class SmartPhone extends PDA implements MobilePhone, MP3 {
	
	public void schedule() {
		System.out.println("일정 관리합니다.");			
	}

	@Override
	public void play() {
		System.out.println("음악재생");
	}

	@Override
	public void stop() {
		System.out.println("음악중단");
	}

	@Override
	public void sendCall() {
	System.out.println("전화갑니다");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화왔어요");
	}

	@Override
	public void sendSMS() {
	System.out.println("문자보냅니다");
	}

	@Override
	public void receiveSMS() {
	System.out.println("문자 왔어요.");
	}
}


public class InterfaceEx06 {

	
	
	public static void main(String[] args) {
	SmartPhone ph = new SmartPhone();
	ph.printLogo();
	ph.sendCall();
	ph.play();
	System.out.println(ph.calculate(3, 5));
	ph.schedule();
}

}
