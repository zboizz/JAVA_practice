package ch02;

import java.util.Scanner;

public class Ifex022 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String msg = "";
		int a = sc.nextInt();
		if(a<0) {
			msg = "����,";
		}else {
			msg = "���, ";
		}
		if(a%2==0) {
			msg = "¦��,";
		}else {
			msg = "Ȧ��, ";
		}
		if(a%3==0) {
			msg = "3�� ���,";
		}else {
			msg = "3�� ��� �ƴ�, ";
		}
		System.out.println(msg);
		msg="";
		msg+=(a<0)?"����":"���";
		msg+=(a%2==0)?"¦��":"Ȧ��";
		msg+=(a%3==0)?"3�� ���":"3�� ��� �ƴ�";
		//System.out.println(msg);
	}
}
