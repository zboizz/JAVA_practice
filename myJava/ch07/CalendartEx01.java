package ch07;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendartEx01 {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.toLocaleString());
		
		
		//Calendar는 추상클래스이기에 직접적인 객체 생성이 불가능하다.
		Calendar cal = Calendar.getInstance(); //getInstance()는 추상클래스에 자주 사용됨
		//new와 getInstance(싱글톤 패턴)의 차이점
		System.out.println("오늘의 날짜와 시간은");
		
		System.out.println(cal.get(Calendar.YEAR)+"년");
		System.out.println(cal.get(1)+"년");
	
		System.out.println(cal.get(Calendar.MONTH)+1+"월");
		System.out.println(cal.get(Calendar.DATE)+1+"일"); 
		System.out.println();
		
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		int ampm = cal.get(Calendar.AM_PM);
		
		if(ampm == Calendar.AM)
			System.out.print("현재시간은 am.");
		else
			System.out.print("현재시간은 pm. ");
		System.out.print(hour+"시 "+min+"분 "+sec+"초");
		
		System.out.println();
		
		SimpleDateFormat format1 =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		SimpleDateFormat format2 =new SimpleDateFormat("yyyy'년' MM'월' dd'일' (E)");
		
		System.out.println(format1.format(d));
		System.out.println(format2.format(d));
		
	}
}
