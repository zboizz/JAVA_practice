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
		Integer it = (Integer)b1.get();  //�ٿ�ĳ���� ���
		b1.set("����");
		String s = (String)b1.get(); //�� �ٱ����� �̻� ��
		//Integer it1 = (Integer)b1.get(); 
		//System.out.println(it1.toString()); //�����߻�
		
		Box2<String> b2 = new Box2<String>();
		b2.set("����");
		String s2 = b2.get();
		System.out.println(s2.length());
		//b2.set(new Frame());
		
		
		
	}
}
