package ch07;

import java.util.Calendar;
import java.util.Date;

public class calendar {
	public static void main(String[] args) {	
	
	Date d = new Date();
	Calendar cal = Calendar.getInstance();
	
	int hour = cal.get(Calendar.HOUR);
	int min = cal.get(Calendar.MINUTE);
	int sec = cal.get(Calendar.SECOND);
	int ampm = cal.get(Calendar.AM_PM);
	
	int year = cal.get(Calendar.YEAR);
	int month = cal.get(Calendar.MONTH);
	int date = cal.get(Calendar.DATE);
	
	System.out.println(year+"."+(month+1)+"."+date);
	
	
	//System.out.println(cal.get(Calendar.YEAR));
	//System.out.println(cal.get(Calendar.MONTH)+1);
	
	
	
}}
