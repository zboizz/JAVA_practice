package practice;

class Var11{
	
	void min(int a, int b) {
		System.out.println(a-b);
	}
	void per(int a, int b) {
		System.out.println(a%b);
	}
	void Math(int a, int b, int c) {
		System.out.println(a+(b*c));
	}
	void plus(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}
}
class Var22{

	void doub(int...arr) {
			int doub = 0;
			for (int i = 0; i < arr.length; i++) {
				doub+=arr[i]*3;
			}
			System.out.println(doub);
	}
}

public class VarEx01Pr {
	public static void main(String[] args) {
		
		Var11 v = new Var11();
		v.min(10, 1);
		v.min(54, 49);
		v.Math(6, 9, 1);
		
		Var22 v2 = new Var22();
		v2.doub(10,10);
		v2.doub(10,20);
		
		
		
		
	}
}
