package ch06;

public class StringEx02 {
	public static void main(String[] args) {
		String s1 = "Java Programming";
		System.out.println("���ڿ� ����" + s1.length());
		System.out.println("�빮�� ��� : " + s1.toUpperCase());
		System.out.println("�ҹ��� ��� : " + s1.toLowerCase());
		System.out.println("-----------------------");
		
		//s1.length() ���� length�� �޼ҵ��̱⿡ ()�� �ڵ���´�
		//������ �迭�ÿ� �����ϴ� arr.length�� length�� ����ν� �� ���� �Է��س���
		//int arr[] = new int[3] ���� 3�� ���� �ȴ�. �׷��⿡ �ڿ� ()�� �����ʴ´�.
		
		
		String s2 = s1.substring(5); //5��° ���ڿ����� ���
		String s3 = s1.substring(5,8); //5~8��° ���̿� �ִ� �������
		System.out.println(s2); //programming
		System.out.println(s3); //pro
		System.out.println("----------------");
		
		
		//8��° �ڸ��� �ִ� ����
		char c1 = s1.charAt(8);
		System.out.println(c1); //g ���
		System.out.println("----------------");
		
		//����. s1�� ¦���� index���� _�� ǥ���Ͻÿ�. (for, char)
		for (int i = 0; i < s1.length(); i++) {
			if(i%2 == 0) {
			System.out.print('_');
		}else {
			System.out.print(s1.charAt(i));
			}
		}
		System.out.println();
		System.out.println("----------------");
		
		
		//indexOf -> ���ڿ��� '��'�������� �˻��Ͽ� ù��° 'a'�� ��ġ�� ã��
		int idx1 = s1.indexOf('a'); 
		System.out.println(idx1); 
		//lastIndexOf -> ���ڿ��� '��'�������� �˻�
		int idx2 = s1.lastIndexOf('a'); 
		System.out.println(idx2); 
		int idx3 = s1.indexOf('k');
		System.out.println(idx3); 
		//-1 �� ��µ�-> ������ ���ڿ��� �������� �ʱ⿡
		
		int idx4 = s1.indexOf("Java");
		System.out.println(idx4);
		int idx5 = s1.indexOf('a',5);
		System.out.println(idx5);
		
		
		String s4 = s1.replace('a', 'q');
		System.out.println(s4);
		
		String s5 = "Java&Android&Spirng";
		String s6[] = s5.split("&");
		for (int i = 0; i < s6.length; i++) {
			System.out.println(s6[i]);
		}
	}
}
