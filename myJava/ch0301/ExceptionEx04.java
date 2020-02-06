package ch0301;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionEx04 {
	public static void main(String[] args) {
		//강제적인 예외 처리
		
		//FileReader fr = new FileReader("ch03/aaa.txt"); 뒷부분 빨간 줄, 'try,catch를 사용할 것인가' 선택
		
		try {
			//FileReader 생성자는 FileNotFoundException이 일어날 가능성이 있는 메소드
			//public FileReader(String fileName) throws FileNotFoundException
			//FileNotFoundException: 파일이 없다
			
			FileReader fr = new FileReader("ch0301/aaa.txt");
			int i;
			while((i=fr.read())!=-1){				
			// public int read() throws IOException	
			//IOException: 상위 클래스, 순서상 아래에 있어야함
			//오류수정을 통해서 FileNotFoundException 보다 밑에 넣도록한다. (A1)
				System.out.print((char)i);
			}
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		
		} catch (IOException e) { // --->A1
		
			e.printStackTrace();
		}
	}
}
