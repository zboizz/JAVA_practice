package ch0401;

import java.awt.Frame;
import java.util.Calendar;

//final(������): Ŭ����, �ʵ�, �޼ҵ�

// 1. Ŭ����: sub Ŭ������ ���� Ŭ����
// 2. �ʵ�: �������
// 3. �޼ҵ�: Override(�������̵�) �Ұ�
// final class���� final �޼ҵ�� �ǹ̰� ����.

class Final01{
	final int A = 10; //������ ���� final�� �ֱ⿡ ���� ������ ��, �빮�ڷ� ǥ���� ��
	static final int KIA = 20;
	final static int HD = 30;
	
	void prn(final int SM) {
		//KIA = 40;
		//SM = 50;
		System.out.println(Math.PI);
		
	}
}

//class Final02 extends Final01{}

class Final03{
	
	void prn1() {}
	final void prn2() {}
}
class Final04 extends Final03{
	@Override
	void prn1() {}
	//final void prn2() {}               //�������̵� �Ұ�

}
public class FinalEx01 {

	
	public static void main(String[] args) {
		Frame f = new Frame();
		//����� �����ϴ� ����
		//f.setBackground(Color.ORANGE);
		//f.setForeground(new Color(128,128,128));
		//f.setForeground(Color.GRAY);
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(5));
		
		//Character c1 = new Character("a");
     	Character c1 = 'a';
		Character.isSpace(c1);
		Character.isWhitespace(c1);
		
			
}
}
