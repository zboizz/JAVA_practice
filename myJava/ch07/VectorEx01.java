package ch07;


import java.awt.Frame;
import java.util.Vector;

public class VectorEx01 {
	public static void main(String[] args) {
		Vector vec = new Vector(5); //벡터 사용할 때 제네릭 사용이 권고, 사용하지 않을 시 노란 줄 발생
								   //vector()--->용량 10개가 만들어짐, vector(5)--->5개 만들어짐
		System.out.println(vec.capacity());   //---->5
		System.out.println(vec.size());       //---->0
		
		//오버로딩
		vec.add("하하");
		vec.add(22);     //Integer로 변환
		vec.add(3.14);   //Double로 변환
		vec.add(true);   //Boolean으로 변환
		vec.add(new Frame()); //최상위 클래스 object
		vec.add(new String("자바"));
		
		System.out.println(vec.capacity());   //---->10
		System.out.println(vec.size());       //---->6
		System.out.println();
		
		
	    for (int i = 0; i < vec.size(); i++) {
	    		System.out.println(vec.get(i).getClass());			
		}
	}
}
