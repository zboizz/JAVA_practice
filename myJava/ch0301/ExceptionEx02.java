package ch0301;


public class ExceptionEx02 {
	public static void main(String[] args) {
		try { //예외가 일어날 가능성이 있는 코드 영역
			
			int arr[] = new int[3];				
			
			arr[0] = 1;
			arr[1] = 2;
			arr[2] = 3;
			arr[3] = 4;
						
		} catch (Exception e) { //try에서 예외가 일어나면 실행되는 영역
			System.out.println("배열예외입니다.");
			e.printStackTrace(); //예외가 일어나는 모든 경로를 보여준다.
		}finally {//예외와 관계없이 무조건 실행되는 영역
			System.out.println("finally");
		}
	}
}