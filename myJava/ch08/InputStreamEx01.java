package ch08;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx01 {
	public static void main(String[] args) {
		InputStream is = System.in; //Ű���忡 ����� ��Ʈ��
		while(true) {
			try {
				//A -> 65�� ������ ���޵Ǳ⶧���� int���̴�.(read��)
				//read()=public abstract int read() throws IOException;
				int i = is.read(); //���������� ������ ���
				if(i==-1) break;   //ctrl+z
				System.out.print((char)i);
			} catch (IOException e) {				
				e.printStackTrace();
			}
			
		}//----while		
	}
}
