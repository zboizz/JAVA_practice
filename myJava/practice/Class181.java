package practice;

public class Class181 {

	public static void main(String[] args) {
		Class180 pizza;
		pizza = new Class180();
		
		pizza.radius = 10;
		pizza.name = "치즈피자";
		double area = pizza.getArea();
		
		System.out.println(pizza.getArea());
		
		Class180 donut = new Class180();
		donut.radius= 2;
		donut.name="당뇨도넛";
		area = donut.getArea();
		System.out.println(donut.name+ "의 면적은" + area);
		
	}
}
