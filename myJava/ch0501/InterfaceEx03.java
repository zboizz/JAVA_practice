package ch0501;

abstract class TV{
	

	String color;
	boolean power;
	int ch;
	void powerOnOff() {
		power=!power;
	}
	void chUp() {
		ch++;
		if(ch>160)
			ch=0;
	}
	void chDown() {
		ch--;
		if(ch<0)
			ch=160;
	}
	abstract void setModel();
}

class SMTv extends TV implements RemoteControl{
	@Override
	void setModel() {
	}

	@Override
	public void turnOn() {
	}

	@Override
	public void turnOff() {
	}
}
class LGTv extends TV implements RemoteControl{
	@Override
	void setModel() {
	}

	@Override
	public void turnOn() {
	}

	@Override
	public void turnOff() {
	}
}
interface RemoteControl{
	void turnOn();
	void turnOff();
}
	
public class InterfaceEx03 {	
	public static void main(String[] args) {
	
}
}
