package ch06;

class Point{
	private int x, y;  	//private는 클래스 내에서만 사용가능하기에 노란줄
	//public int a, b;	//public은 다른 곳에서도 사용가능
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
		
	}
	public void prn() {
		System.out.println(x+y);
	}
	@Override
	public String toString() {
		return "Point(" +x + "," + y + ")";
	}
}


public class ObjectEx01 {
	public static void main(String[] args) {
		
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10, 20);
		
		System.out.println(p1.getClass());
		System.out.println(p1.hashCode());	//
		System.out.println(p2.hashCode());
		System.out.println(p1.toString());
		System.out.println(p1); //뒤에 아무 내용 없을시, toString() 호출
		System.out.println(p1==p2);
		p1=p2;
		System.out.println(p1==p2);
		 
		
		
	}
}







