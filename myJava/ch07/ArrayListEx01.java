package ch07;

import java.util.ArrayList;

public class ArrayListEx01 {
	public static void main(String[] args) {
		//ArrayList vs Vector: ����ȭ ����
		//����ȭ��: ��Ʈ��ũ�󿡼� 
		ArrayList<String> list = new ArrayList<>(); //ArrayList<>�� Ÿ���� <String>����
		//1.7���� ����: �纯�� <>�� �����ʾƵ� �Ǵ� ��, ���� ������ �־ ��
		//���׸��� 5.0���� ������
		
		list.add("Java");
		list.add("JSP");
		list.add("Database");
		list.add("Android");
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.println(s);			
		}System.out.println();
		
		for (String s : list) { //s�� list�� ���� ��
			System.out.println(s);
		}
			
		}
	}

