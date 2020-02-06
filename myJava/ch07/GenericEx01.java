package ch07;



class Box1{
	private Object data;
	public void set(Object data) {this.data = data;}
	public Object get() {return data;}
	
	
	
}


class Box2<T>{
	private T data;
	public void set(T data) {this.data = data;}
	public T get() {return data;}
	
}



public class GenericEx01 {
	public static void main(String[] args) {
		Box1 b1 = new Box1();
		b1.set(10);
		Integer it = (Integer)b1.get();  //다운캐스팅 사용
		b1.set("가가");
		String s = (String)b1.get(); //이 줄까지는 이상 무
		//Integer it1 = (Integer)b1.get(); 
		//System.out.println(it1.toString()); //에러발생
		
		Box2<String> b2 = new Box2<String>();
		b2.set("가가");
		String s2 = b2.get();
		System.out.println(s2.length());
		//b2.set(new Frame());
		
		
		
	}
}
