package ch06;

public class StringEx03 {
	public static void main(String[] args) {
		
		String s1 = "�������̰� ��ȭ������ �һ���ȸ�� ����."
				 + "�������� 5�� ���� 3�� ���� �Ұ��� �Ե� ��ȭ��"
				 + " 8�� �̺�ƮȦ����... ���� �귣�� ������ȭ��" 
				 + " ȫ���� ���� �һ���ȸ�� �����Ѵ�.";
		
		/*1��.���������� ���鹮���� index��ȣ�� ����Ͻÿ�.
		5, 11,......87, : hint : indexOf�� ����Ѵ�.*/
		
		/*2��.���������� ���鹮���� index��ȣ�� ����Ͻÿ�.
		87, 81, 78,....5,  : hint : lastIndexOf�� ����Ѵ�.*/
		
		/*3��.��ĭ�� '_' ����Ͻÿ�. hint:charAt*/
		
		/*4�� ù�ܾ� ����ϱ� : substring, indexOf*/
		
		/*5�� �������ܾ� ����ϱ� : substring, lastIndexOf*/
		
		
		
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
		int idx = -1; // �˻��� ���۵Ǵ� ���� 0�� �Ƿ��� -1�� �س��ƾ��� 
		do {
			idx = s1.indexOf(' ',idx+1);  
			// ���鰪�� ã�� ��Ʈ�� ���� 5�� ���� �� �� �ڿ� �ִ� ���ڿ�����
			// �˻��Ǳ� ���Ͽ� �� ���� idx+1�� �ϸ� �� �������� �����
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
		
		
	//====================��������============================	 	   6
		String s5 = "        Java         ";
		System.out.println("***"+s5.trim()+"***");
		
	//====================�������� ���ڷ� ��ȯ=================	  	   7
		String s6 = String.valueOf(22);
		s6 = new Integer(22).toString();
		s6 = 22+"";
		System.out.println(s6+1);
		System.out.println(22+1);
}}
		
			
					







