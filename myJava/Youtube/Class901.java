package Youtube;

public class Class901 {

	
	// ��ȯ��, �Լ���, �Ű�����
	public static int function(int a, int b, int c) {  //3���� �Ű�����, �Լ�=�޼ҵ�
		int min; //min ���� ���� ��
		if(a>b) {
			if(b>c) {
			min = c;
		}else {
			min=b;
		}
	}else {
		if(a>c) {
			min = c;
		}else {
			min=a;
		}
	}
		
		for(int i = min; i>0; i--) {
			if(a% i==0 && b%i==0 && c%i==0) {
				return i;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		System.out.println("(400, 300, 750)" + function(400,300,750));
	}
}
