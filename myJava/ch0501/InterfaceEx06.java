package ch0501;

interface Phone{	//�������̽� ����
	int TIMEOUT = 1000; //��� �ʵ� ����
	void sendCall(); //�߻� �޼ҵ�
	void receiveCall(); //�߻� �޼ҵ�
	default void printLogo() { //default �޼ҵ�
		System.out.println("**Phone**");
	}
}
interface MobilePhone extends Phone{    //�������̽� ���
	void sendSMS();
	void receiveSMS();
	
}
interface MP3{		//�������̽� ����
	void play();
	void stop();
}


class PDA{ 		//Ŭ���� �ۼ�
	public int calculate(int x, int y) {
		return x + y;
	}
}



class SmartPhone extends PDA implements MobilePhone, MP3 {
	
	public void schedule() {
		System.out.println("���� �����մϴ�.");			
	}

	@Override
	public void play() {
		System.out.println("�������");
	}

	@Override
	public void stop() {
		System.out.println("�����ߴ�");
	}

	@Override
	public void sendCall() {
	System.out.println("��ȭ���ϴ�");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ�Ծ��");
	}

	@Override
	public void sendSMS() {
	System.out.println("���ں����ϴ�");
	}

	@Override
	public void receiveSMS() {
	System.out.println("���� �Ծ��.");
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
