package ch05;


class Shape{ //도형
	protected String name;
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println("shape");
	}
}

class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}


public class BindingEx01 {
	public static void main(String[] args) {
		Shape s = new Shape();
		s.draw(); //정적바인딩
	///////////////////////////////
		
		
		Shape s1 = new Circle();
		s1.paint(); //동적바인딩
		
		
		
		
	}
}
