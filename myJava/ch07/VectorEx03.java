package ch07;

import java.util.Vector;

public class VectorEx03 {
	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<Integer>(4,3); //�⺻ �뷮 4, ������ 3
		System.out.println("�뷮 : " + vec.capacity());
		System.out.println("��� : " + vec.size());
		
		System.out.println("��Ұ� ����ִ��� ���� : " + vec.isEmpty());   //���⼱ true
		
		for (int i = 0; i < 10; i++) {
			vec.add(i*10);	
			System.out.print(vec.get(i)+" ");
		}System.out.println();
		
		System.out.println("�뷮 : " + vec.capacity());
		System.out.println("��� : " + vec.size());
		System.out.println("ù��° ��� : " + vec.firstElement());
		System.out.println("������ ��� : " + vec.lastElement());
		System.out.println("�ι�° ��� : " + vec.get(1)); //0���� �����ϱ⿡ �ι�°�� 1
		System.out.println("��Ұ� ����ִ��� ���� : " + vec.isEmpty());   //���⼱ false
		 
		vec.remove(2); //3��° ��Ҹ� ����
		for (int i = 0; i < vec.size(); i++) {
			System.out.print(vec.get(i)+" ");
		}System.out.println();
		
		if(vec.contains(30)) {
			System.out.println("30�� �ֳ׿�");
		}
		System.out.println(vec.indexOf(40));  //����� index�� ����, 5�� ���
		System.out.println(vec.indexOf(140)); //����� index�� ����, ��� -1�� ���
		
		System.out.println("�뷮 : " + vec.capacity());  //--->10
		System.out.println("��� : " + vec.size());      //--->9
		
		vec.trimToSize();
		System.out.println("�뷮 : " + vec.capacity()); //--->9
		System.out.println("��� : " + vec.size());     //--->9
		
		//��� ��Ҹ� �����ϰ��� �Ѵٸ�
		vec.removeAllElements();
		System.out.println(vec.isEmpty()); //--->true
	}
}
