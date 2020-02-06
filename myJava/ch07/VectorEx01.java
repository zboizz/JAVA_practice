package ch07;


import java.awt.Frame;
import java.util.Vector;

public class VectorEx01 {
	public static void main(String[] args) {
		Vector vec = new Vector(5); //���� ����� �� ���׸� ����� �ǰ�, ������� ���� �� ��� �� �߻�
								   //vector()--->�뷮 10���� �������, vector(5)--->5�� �������
		System.out.println(vec.capacity());   //---->5
		System.out.println(vec.size());       //---->0
		
		//�����ε�
		vec.add("����");
		vec.add(22);     //Integer�� ��ȯ
		vec.add(3.14);   //Double�� ��ȯ
		vec.add(true);   //Boolean���� ��ȯ
		vec.add(new Frame()); //�ֻ��� Ŭ���� object
		vec.add(new String("�ڹ�"));
		
		System.out.println(vec.capacity());   //---->10
		System.out.println(vec.size());       //---->6
		System.out.println();
		
		
	    for (int i = 0; i < vec.size(); i++) {
	    		System.out.println(vec.get(i).getClass());			
		}
	}
}
