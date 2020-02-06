package ch03;

public class GooGoo02 {
	public static void main(String[] args) {
		System.out.println("구구단");
		for (int i = 2; i < 10; i++) {
			System.out.print("   "+ i + "단\t");
			for (int j = 1; j < 10; j++) {
				System.out.print(i+"x"+j+ "=" + (i*j)+ "\t");
				
			}System.out.println();
			
		}
	}//---main
}//---class
