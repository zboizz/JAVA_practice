package ch07;

import java.util.Vector;

public class VectorEx02 {
	public static void main(String[] args) {
		
		
		Vector vec1 = new Vector();
		//Vector<String> vec = new Vector<String>();
		vec1. add("하하");
		String s =(String)vec1.get(0);
		
		Vector<String> vec2 = new Vector<String>();
		vec2.add("호호");
		String s2 = vec2.get(0);
		
		//////////////////////////////////////////
		
		//배열에 있는 값을 Vector 저장
		String str[] = {"노르웨이","스위스","뉴질랜드","덴마크","캐나다"};
		Vector<String> vec = new Vector<String>(); //vector<String>으로 저장했기에 add(String)으로 뜸
		for (int i = 0; i < str.length; i++) {			
			vec.add(str[i]); //add-boolean, addElemnet-void 두개 가능 / add를 더 선호
			String s1 = vec.get(i);    //vec.get() = vec.elementAt()  /get을 더 선호
			System.out.println(s1);
		}
		
	}
}
