package ch0301;


public class ExceptionEx02 {
	public static void main(String[] args) {
		try { //���ܰ� �Ͼ ���ɼ��� �ִ� �ڵ� ����
			
			int arr[] = new int[3];				
			
			arr[0] = 1;
			arr[1] = 2;
			arr[2] = 3;
			arr[3] = 4;
						
		} catch (Exception e) { //try���� ���ܰ� �Ͼ�� ����Ǵ� ����
			System.out.println("�迭�����Դϴ�.");
			e.printStackTrace(); //���ܰ� �Ͼ�� ��� ��θ� �����ش�.
		}finally {//���ܿ� ������� ������ ����Ǵ� ����
			System.out.println("finally");
		}
	}
}