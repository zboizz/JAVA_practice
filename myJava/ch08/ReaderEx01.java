package ch08;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReaderEx01 {

	public static void main(String[] args) {
		InputStream is = System.in;
		//byte������ ���� data ���ڴ����� ó��
		Reader reader = new InputStreamReader(is);
		
		while(true) {
			try {
				int i = reader.read();
				if(i==-1) break;
				System.out.println((char)i);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
