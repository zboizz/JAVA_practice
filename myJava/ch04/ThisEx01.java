package ch04;


//This: �� �ڽ��� ��Ī�ϴ� �����
class This01{
	//��ü�� �Ӽ��� ������ �ִ� �ʵ�
	int a;
	int b;
	
	void prn(int a /*�μ� �Ǵ� �Ű�����*/) {
		int b = 0; //����(local) ����
		System.out.println(a+b);
		//���������� ������ �ʵ��� ��쿡 ����ϱ� ���ؼ��� �ݵ�� �ʵ� �տ� this�� �´�
		System.out.println(this.a+this.b);
	}

		void prn2() {
			//������ Ŭ�������� �ٸ� �޼ҵ� ȣ���� ����
			/*this. �Ϲ������� �����Ǿ� ����*/prn(22);
		}
		
}

public class ThisEx01 {

	public static void main(String[] args) {
		
	}
}
