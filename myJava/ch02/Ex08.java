package ch02;

public class Ex08 {

		public static void main(String[] args) {
			
			//byte < short < int < long : 묵시적인 형변환
			int i = 22;
			long I = i;
		
			//명시적인 형변환
			short s = 200;
			byte b = (byte)s;
			System.out.println(b);
			
			//float < double
			float f = 3.14f;
			double d = f; //묵시적인 형변환
			double d1 = 3.14;
			float f1 = (float)d1;
			
			System.out.println(f1);
			
					
		}
}




