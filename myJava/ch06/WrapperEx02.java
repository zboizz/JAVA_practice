package ch06;

public class WrapperEx02 {

	public static void main(String[] args) {
		char c1 = 'J';
		char c2 = 'a';
		char c3 = '2';
		char c4 = ' ';
		
		
		System.out.println(c1);
		if(Character.isLetter(c1));
			System.out.println(" : 문자입니다.");
			
			System.out.println(c2);
			if(Character.isUpperCase(c2))
				System.out.println(" : 대문자입니다.");
			else if(Character.isLowerCase(c2))
			System.out.println(" : 소문자입니다.");
			
			
			System.out.print(c3);
			if(Character.isDigit(c3))
				System.out.println(" :숫자입니다.");
			System.out.print(" ** ");
			if(Character.isSpace(c4)) //inSpace
				System.out.println(" : 공백문자입니다.");
	
	
	}
}
