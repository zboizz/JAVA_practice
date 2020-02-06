package ch06;

class Point{
	private int x, y;  	//private�� Ŭ���� �������� ��밡���ϱ⿡ �����
	//public int a, b;	//public�� �ٸ� �������� ��밡��
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
		System.out.println(p1); //�ڿ� �ƹ� ���� ������, toString() ȣ��
		System.out.println(p1==p2);
		p1=p2;
		System.out.println(p1==p2);
		 
		
		
	}
}







