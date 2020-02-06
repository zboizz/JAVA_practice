package ch02;

import java.util.Scanner;

public class IfEx03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("이름과 학년, 점수를 입력하세요");
		
		String na = sc.next();
		int gr = sc.nextInt();
		int s = sc.nextInt();
			if((gr<4)&&(s>=60)){
				System.out.println(na+"은(는) "+ gr + "학년이고 "+ s +"점으로 합격입니다." );
			}else if((gr>=4)&&(s>=70)) {
				System.out.println(na+"은(는) "+ gr + "학년이고 "+ s +"점으로 합격입니다." );
			}else {
				System.out.println(na+"은(는) "+ gr + "학년이고 "+ s +"점으로 불합격입니다." );
			}
	}
}
	
	
	
	
	
	
	