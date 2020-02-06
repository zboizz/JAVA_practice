package ch03;

public class ForEx021 {
	public static void main(String[] args) {
		
		int i =0, j =0; int m =0;
		for(i=1;i<=5;i++) {
			System.out.println("");
		for(j=1;j<=i;j++) {
			System.out.print("* ");
			}
		}System.out.println("");
		
		for(i=1;i<=5;i++) {
			System.out.println("");
		for(j=1;j<=6-i;j++) {
			System.out.print("* ");
			}
		}
	}
}

