package ch08;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReaderEx01 {
 public static void main(String[] args) {
	InputStream is = System.in; //Ű���忡 ��Ʈ�� ����
	InputStreamReader isr = new InputStreamReader(is);//import �߰�, io
	BufferedReader br = new BufferedReader(isr); //import �߰�, io
	
	BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
	String s = "";
	while(true) {
		try {
			s = br1. readLine(); //���پ� �о��.
			System.out.println("��� :" + s);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
 }
}
