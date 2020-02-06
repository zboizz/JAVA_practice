package ch06;

public class StringEx03 {
	public static void main(String[] args) {
		
		String s1 = "전지현이가 백화점에서 팬사인회를 연다."
				 + "전지현은 5일 오후 3시 서울 소공동 롯데 백화점"
				 + " 8층 이벤트홀에서... 구두 브랜드 조이제화의" 
				 + " 홍보를 위한 팬사인회에 참석한다.";
		
		/*1번.순방향으로 공백문자의 index번호를 출력하시오.
		5, 11,......87, : hint : indexOf을 사용한다.*/
		
		/*2번.역방향으로 공백문자의 index번호를 출력하시오.
		87, 81, 78,....5,  : hint : lastIndexOf을 사용한다.*/
		
		/*3번.빈칸을 '_' 출력하시오. hint:charAt*/
		
		/*4번 첫단어 출력하기 : substring, indexOf*/
		
		/*5번 마지막단어 출력하기 : substring, lastIndexOf*/
		
		
		
	//=========================================================        1	
		for (int i = 0; i < s1.length(); i++) {
			char pro1 = s1.charAt(i);
			if(pro1 ==' ') {
				System.out.print(i+",");
				//if(c!='') continue;
				//System.out.print(i+",");
			}
		}System.out.println();		
	//----------------------------------------------------------	   1-1
		int idx = -1; // 검색이 시작되는 값이 0이 되려면 -1로 해놓아야함 
		do {
			idx = s1.indexOf(' ',idx+1);  
			// 공백값을 찾고 루트를 돌때 5가 나온 뒤 그 뒤에 있는 문자열부터
			// 검색되기 위하여 그 값인 idx+1을 하면 그 다음부터 진행됨
			if(idx!=-1)System.out.print(idx+ ",");
		} while (idx>=0);
		System.out.println();
		
		
				
		
	//=========================================================        2
		for (int i = s1.length()-1; i>0; i--) {
			char c = s1.charAt(i);
			if(c!=' ') continue;
			System.out.print(i + ",");
		}System.out.println();
	//---------------------------------------------------------	       2-1
		idx = s1.length();
		do {
			idx = s1.lastIndexOf(' ', idx-1);
			if(idx!=-1) System.out.print(idx + ",");
		} while (idx>=0);
		System.out.println();		
		
		
		
		
	//=========================================================	       3
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if(c==' ') System.out.print('_');
			else System.out.print(c);			
		}System.out.println("");
	//---------------------------------------------------------		   3-1
		String s2 = s1.replace(' ','_');
		System.out.println(s2);
		System.out.println();
		
		
		
	//=========================================================	 	   4	
		String s3 = s1.substring(0,s1.indexOf(' '));
		System.out.println("***"+ s3 + "***");
		
	//=========================================================	       5
		
		String s4 = s1.substring(s1.lastIndexOf(' ')+1);
		System.out.println("***"+ s4 + "***");
		
		
	//====================공백제거============================	 	   6
		String s5 = "        Java         ";
		System.out.println("***"+s5.trim()+"***");
		
	//====================정수값을 문자로 변환=================	  	   7
		String s6 = String.valueOf(22);
		s6 = new Integer(22).toString();
		s6 = 22+"";
		System.out.println(s6+1);
		System.out.println(22+1);
}}
		
			
					







