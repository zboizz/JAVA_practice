package ch02;

public class Ex08 {

		public static void main(String[] args) {
			
			//byte < short < int < long : �������� ����ȯ
			int i = 22;
			long I = i;
		
			//������� ����ȯ
			short s = 200;
			byte b = (byte)s;
			System.out.println(b);
			
			//float < double
			float f = 3.14f;
			double d = f; //�������� ����ȯ
			double d1 = 3.14;
			float f1 = (float)d1;
			
			System.out.println(f1);
			
					
		}
}




