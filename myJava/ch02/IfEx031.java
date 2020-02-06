package ch02;

import java.util.Scanner;

public class IfEx031 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름과 학년 점수를 입력하세요");
		String name = sc.next();
		int grade = sc.nextInt();
		int score = sc.nextInt();
		
		String msg="";
		if(score>=60) {
			if(grade!=4) {
				msg = "합격";
		}else if(score>=70) {
				msg="합격";
		}else {
			msg = "불합격";
			}
		}else {
		msg = "불합격";
		}
		System.out.println(name+"은(는) "+ grade + "학년이고 "+ score +"점으로 " + msg +  "입니다" );
	}
}
