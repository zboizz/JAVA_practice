package ch08;

import java.io.FileReader;

public class FileReaderEx01 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("ch08/aaa.txt");
			
			int i;
			while((i=fr.read())!=-1) { //문서가 끝날때에는 -1의 값을 가진다, -1이 아닐때까지 출력
				System.out.print((char)i);
			}
			fr.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
