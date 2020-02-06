package practice;

public class Class187 {
	int radi;
	String name;
	
	public Class187() {
		radi = 1; name = "";
	}
	public Class187(int r, String n) {
		radi = r; name= n;
		
	}
	
	public double getArea() {
		return 3.14*radi*radi;
	}
	public static void main(String[] args) {
		Class187 pizza = new Class187(10, "짠피자");
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 "+ area);
		
		Class187 donut = new Class187();
		donut.name = "도넛피자";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
		
	}
}
