package ch05;

class Overriding01{
	//�޼ҵ� �������̵��϶� �θ�Ŭ���� �޼ҵ��� ���������ں��ٴ�
	//ũ�ų� ���ƾ� �Ѵ�.
	//���� �۴ٸ� ������ ������ �߻��� �ǰ� ���� ���ε� ������ �Ǵ°ɷ� �ľ��� ��
	public void aaa() {}
	protected void bbb() {}	
	protected void ccc() {}	
	
}

class Overriding02 extends Overriding01{
	//@Override
	//protected void bbb() {}
	@Override
	protected void bbb() {}
	@Override
	public void ccc() {}
	
}


public class OverridingEx01 {
public static void main(String[] args) {
	
}
}

