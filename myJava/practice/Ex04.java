package practice;

import java.awt.Dialog;
import java.awt.Frame;

class A04{
	A04(String s){}
	
	//void A04(String s){}     //void�� �������ν� �ڵ����� �Ϲ� �޼ҵ尡 �Ǿ����.
							   //�׷��ٸ� ����Ʈ �����ڴ� JVM ����.
		
	}



class B04 extends A04{
	//������ ���� ����
	//1. super Ŭ������ ����Ʈ �����ڰ� ������ ����
	//2. B04 �����ڿ��� super Ŭ���� �Ű������� �ִ� �����ڸ� ȣ�� -->Dialog d = new Dialog(f);�� ���� ����

	B04(){
		super("����"); //��������� String �Ű����� ������ ȣ��


}
}
public class Ex04 {
	public static void main(String[] args) {
		Frame f = new Frame();
		String s = new String();
		Dialog d = new Dialog(f);
		
		
	}
}
