package ch06;

import java.util.StringTokenizer;

public class StringTokenizerEx01 {
	public static void main(String[] args) {
		String s1 = "애플 구글 아마존 페이스북";
		StringTokenizer st = new StringTokenizer(s1); //네 칸에 걸쳐서 따로 저장이 됨
		int cnt = st.countTokens(); //토큰의 개수는 몇개인지
		System.out.println(cnt);
		
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement()); 
		}
		
		//-------------------------------------------------
		String s2 = "서울;인천%부산;울산;광주;대구%대전";
		StringTokenizer st1 = new StringTokenizer(s2, ";%");
		int cnt2 = st1.countTokens();
		System.out.println(cnt2);
		
		for (int i = 0; i < cnt2; i++) {
			String str = st1.nextToken();
			System.out.println(str);
		}
		
		//-------------------------------------------------
		String s3 = "1;2#3;6%9;5;4*2*9@1@9#17";
		//s3를 숫자만 뽑아서 합계와 평균을 구하시오.
		StringTokenizer st2 = new StringTokenizer(s3, ";#*@%");
		double sum = 0;
		int cnt3 = st2.countTokens();
		for (int i = 0; i < cnt3; i++) {
			sum += Integer.parseInt(st2.nextToken());
			
			
		}System.out.println(sum);
	     System.out.println(sum/cnt3);
		
	    
	   //-------------------------------------------------
	   //다음의 문자열을 토근하여 배열로 만드시오.
	     String s4 ="자바&JSP&Android&Spring";
	     StringTokenizer st3 = new StringTokenizer(s4,"&");
	     
	     String str[] = new String[st3.countTokens()];  //------***핵심문장
	     for (int i = 0; i < str.length; i++) {
			str[i] = st3.nextToken();
			System.out.println(str[i]);
		}
			
		}
	}

