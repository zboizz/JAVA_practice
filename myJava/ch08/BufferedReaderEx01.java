package ch08;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReaderEx01 {
 public static void main(String[] args) {
	InputStream is = System.in; //키보드에 스트림 연결
	InputStreamReader isr = new InputStreamReader(is);//import 추가, io
	BufferedReader br = new BufferedReader(isr); //import 추가, io
	
	BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
	String s = "";
	while(true) {
		try {
			s = br1. readLine(); //한줄씩 읽어옴.
			System.out.println("출력 :" + s);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
 }
}
