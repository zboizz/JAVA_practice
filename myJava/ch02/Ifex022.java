package ch02;

import java.util.Scanner;

public class Ifex022 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String msg = "";
		int a = sc.nextInt();
		if(a<0) {
			msg = "À½¼ö,";
		}else {
			msg = "¾ç¼ö, ";
		}
		if(a%2==0) {
			msg = "Â¦¼ö,";
		}else {
			msg = "È¦¼ö, ";
		}
		if(a%3==0) {
			msg = "3ÀÇ ¹è¼ö,";
		}else {
			msg = "3ÀÇ ¹è¼ö ¾Æ´Ô, ";
		}
		System.out.println(msg);
		msg="";
		msg+=(a<0)?"À½¼ö":"¾ç¼ö";
		msg+=(a%2==0)?"Â¦¼ö":"È¦¼ö";
		msg+=(a%3==0)?"3ÀÇ ¹è¼ö":"3ÀÇ ¹è¼ö ¾Æ´Ô";
		//System.out.println(msg);
	}
}
