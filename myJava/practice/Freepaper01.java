package practice;


public class Freepaper01 {
	int s;
	static int t;
	public static void main(String[] args) {
		Freepaper01.t = 10;
		//Freepaper01.s = 20;
		Freepaper01 obj = new Freepaper01();
		obj.s = 30;
		obj.t = 40;
		System.out.println(obj.s);
		System.out.println(obj.t);
	}
}
