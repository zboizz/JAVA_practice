package ch05;


class Shape{ //����
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
		s.draw(); //�������ε�
	///////////////////////////////
		
		
		Shape s1 = new Circle();
		s1.paint(); //�������ε�
		
		
		
		
	}
}
