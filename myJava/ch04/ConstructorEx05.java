package ch04;

class Constructor05{
	//������ �����ε�
	//super �θ�Ŭ���� ��Ī �����
	//this �� �ڽ��� ��Ī�ϴ� �����
	
	
	Constructor05(){
		//�� �ڽ��� ��ü�� ����� ������ ȣ��. �ݵ�� ù��° ���ο� �;���
		this(100,"�ڹ�");
	}
	Constructor05(int i){
		this(i,"�ڹ�");
	}
	Constructor05(String s){
		this(100,s);
	}	
	
	//����: �� �����Ǿ� �ִ� ������
	Constructor05(int i, String s){
		//super(); �� ����, �����Ǿ� ����
		super();
		//�� �����Ǿ� �ִ� �ڵ尡 �ִ�
	}	
	
}


public class ConstructorEx05 {
	
	public static void main(String[] args) {
		
	}
}
