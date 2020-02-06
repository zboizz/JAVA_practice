package ch07;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendartEx01 {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.toLocaleString());
		
		
		//Calendar�� �߻�Ŭ�����̱⿡ �������� ��ü ������ �Ұ����ϴ�.
		Calendar cal = Calendar.getInstance(); //getInstance()�� �߻�Ŭ������ ���� ����
		//new�� getInstance(�̱��� ����)�� ������
		System.out.println("������ ��¥�� �ð���");
		
		System.out.println(cal.get(Calendar.YEAR)+"��");
		System.out.println(cal.get(1)+"��");
	
		System.out.println(cal.get(Calendar.MONTH)+1+"��");
		System.out.println(cal.get(Calendar.DATE)+1+"��"); 
		System.out.println();
		
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		int ampm = cal.get(Calendar.AM_PM);
		
		if(ampm == Calendar.AM)
			System.out.print("����ð��� am.");
		else
			System.out.print("����ð��� pm. ");
		System.out.print(hour+"�� "+min+"�� "+sec+"��");
		
		System.out.println();
		
		SimpleDateFormat format1 =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		SimpleDateFormat format2 =new SimpleDateFormat("yyyy'��' MM'��' dd'��' (E)");
		
		System.out.println(format1.format(d));
		System.out.println(format2.format(d));
		
	}
}
