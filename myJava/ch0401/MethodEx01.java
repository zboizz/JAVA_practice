package ch0401;

class Method01{
	//�޼ҵ� 4���� Ÿ��
	// 1. ���Ͼ��� �Ű����� ����.
	// 2. �����ְ� �Ű����� ����.
	// 3. ���Ͼ��� �Ű����� ����.
	// 4. �����ְ� �Ű����� ����.

	void prn1() {}			//1. ���Ͼ��� �Ű����� ����.
	
	int prn2() {            //'int'�� ����� �� ���� 'return a;' �� �������� �Ͽ����Ѵ�.
		int a = 10;			//2.���Ͼ��� �Ű����� ����.
		return a;
	}
	
	void prn3(int a, int b) {	      //3. ���Ͼ��� �Ű����� ����.
		
	}
	String prn4(int a, int b) {			//4. �����ְ� �Ű����� ����.
		String s="����";
		return s;
	}
	
	String[] prn5() {
		String s[] = new String[3];
		return s;
	}
}

public class MethodEx01 {

	public static void main(String[] args) {
			
		}
	
}





