package ch0301;

public class ExceptionEx06 {

	public static void main(String[] args) {
			try {
				exe3();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

	public static void exe1() throws Exception{}
	public static void exe2() throws Exception{
		exe1();
	}
	public static void exe3() throws Exception{
		exe2();
	}
}
