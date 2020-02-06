package Youtube;

public class Class1002 {
	
	public static int max(int a, int b) {
		return(a>b)? a : b;
	}
	public static int function(int a, int b, int c) {
		int result = max(a,b);
		result = max(result,c);
		return result;
	}
	public static void main(String[] args) {
		
		
		System.out.println(function(345, 567, 789));
	}
}
