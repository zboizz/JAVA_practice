package practice;

import java.util.ArrayList;

public class LengthSize01 {
	public static void main(String[] args) {
		
		int[] lengthtest1 = new int[7];
		System.out.println(lengthtest1.length);
		
		String lengthtest2 = "lengthSizeTest";
		System.out.println(lengthtest2.length());
		
		ArrayList<Object> sizeTest = new ArrayList<Object>();
		sizeTest.add("1");
		sizeTest.add("2");
		System.out.println(sizeTest.size());
	}
}
