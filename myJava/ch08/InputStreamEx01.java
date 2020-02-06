package ch08;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx01 {
	public static void main(String[] args) {
		InputStream is = System.in; //키보드에 연결된 스트림
		while(true) {
			try {
				//A -> 65의 값으로 전달되기때문에 int값이다.(read의)
				//read()=public abstract int read() throws IOException;
				int i = is.read(); //내부적으로 쓰레드 대기
				if(i==-1) break;   //ctrl+z
				System.out.print((char)i);
			} catch (IOException e) {				
				e.printStackTrace();
			}
			
		}//----while		
	}
}
