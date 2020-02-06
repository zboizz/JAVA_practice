package Youtube;





public class Class1501 {
	public static void main(String[] args) {
		
		Node one = new Node(10, 20);
		Node two = new Node(30, 40);
		Node result = one.getCenter(two);
		System.out.println(""+result.getX()+","+result.getY());
		
	}
}
