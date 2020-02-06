package Youtube;

public class Class1001 {
	
	public static char function(String input) {
		return input.charAt(input.length()-12);
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("hello world의 마지막 단어는?" + function("hellow world"));
	}
	}
