package practice;
//super ���
// 1. ������ super()����
// 2. �θ��� �ʵ� �� �޼ҵ� ȣ��� 



class A03{	//Ŭ���� ����
	int a = 10;
	
	
	public A03 () { //������ ����, �����ڰ� �⺻���� �ؾ��ϴ� ���ҵ��� ����.
		super(); //�����Ǿ� ����
	}
		void prn() {
			System.out.println("a :" + a);	
			}
}




class B03 extends A03{
	public B03() {
	}
	@Override
	void prn() {
		int b = super.a + 10; //�θ��� ������ ����� ��쿡�� �տ� super�� ���δ�.
		super.prn(); //�������̵��� ��쿡�� �θ� �޼ҵ� ȣ��� �ݵ�� super ����
	}
}





public class Ex03 {
	public static void main(String[] args) {
		
	}
}
