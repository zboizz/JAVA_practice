package ch06;

import java.util.StringTokenizer;

public class StringTokenizerEx01 {
	public static void main(String[] args) {
		String s1 = "���� ���� �Ƹ��� ���̽���";
		StringTokenizer st = new StringTokenizer(s1); //�� ĭ�� ���ļ� ���� ������ ��
		int cnt = st.countTokens(); //��ū�� ������ �����
		System.out.println(cnt);
		
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement()); 
		}
		
		//-------------------------------------------------
		String s2 = "����;��õ%�λ�;���;����;�뱸%����";
		StringTokenizer st1 = new StringTokenizer(s2, ";%");
		int cnt2 = st1.countTokens();
		System.out.println(cnt2);
		
		for (int i = 0; i < cnt2; i++) {
			String str = st1.nextToken();
			System.out.println(str);
		}
		
		//-------------------------------------------------
		String s3 = "1;2#3;6%9;5;4*2*9@1@9#17";
		//s3�� ���ڸ� �̾Ƽ� �հ�� ����� ���Ͻÿ�.
		StringTokenizer st2 = new StringTokenizer(s3, ";#*@%");
		double sum = 0;
		int cnt3 = st2.countTokens();
		for (int i = 0; i < cnt3; i++) {
			sum += Integer.parseInt(st2.nextToken());
			
			
		}System.out.println(sum);
	     System.out.println(sum/cnt3);
		
	    
	   //-------------------------------------------------
	   //������ ���ڿ��� ����Ͽ� �迭�� ����ÿ�.
	     String s4 ="�ڹ�&JSP&Android&Spring";
	     StringTokenizer st3 = new StringTokenizer(s4,"&");
	     
	     String str[] = new String[st3.countTokens()];  //------***�ٽɹ���
	     for (int i = 0; i < str.length; i++) {
			str[i] = st3.nextToken();
			System.out.println(str[i]);
		}
			
		}
	}

