package ch07;

import java.util.Vector;

public class VectorEx02 {
	public static void main(String[] args) {
		
		
		Vector vec1 = new Vector();
		//Vector<String> vec = new Vector<String>();
		vec1. add("����");
		String s =(String)vec1.get(0);
		
		Vector<String> vec2 = new Vector<String>();
		vec2.add("ȣȣ");
		String s2 = vec2.get(0);
		
		//////////////////////////////////////////
		
		//�迭�� �ִ� ���� Vector ����
		String str[] = {"�븣����","������","��������","����ũ","ĳ����"};
		Vector<String> vec = new Vector<String>(); //vector<String>���� �����߱⿡ add(String)���� ��
		for (int i = 0; i < str.length; i++) {			
			vec.add(str[i]); //add-boolean, addElemnet-void �ΰ� ���� / add�� �� ��ȣ
			String s1 = vec.get(i);    //vec.get() = vec.elementAt()  /get�� �� ��ȣ
			System.out.println(s1);
		}
		
	}
}
