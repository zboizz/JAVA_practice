package ch0301;

public class ExceptionEx07 {
	
	int a = 100;
	
	public void m(int b) throws Exception{
		if(b==0){
			throw new Exception("a�� 0���� ������ �ȵǿ�.");
		}else {
			System.out.println(a+"/"+b+"="+a/b);
		}
	}

	public static void main(String[] args) {
		ExceptionEx07 et = new ExceptionEx07();
		try {
			et.m(10);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
