package ch0301;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionEx04 {
	public static void main(String[] args) {
		//�������� ���� ó��
		
		//FileReader fr = new FileReader("ch03/aaa.txt"); �޺κ� ���� ��, 'try,catch�� ����� ���ΰ�' ����
		
		try {
			//FileReader �����ڴ� FileNotFoundException�� �Ͼ ���ɼ��� �ִ� �޼ҵ�
			//public FileReader(String fileName) throws FileNotFoundException
			//FileNotFoundException: ������ ����
			
			FileReader fr = new FileReader("ch0301/aaa.txt");
			int i;
			while((i=fr.read())!=-1){				
			// public int read() throws IOException	
			//IOException: ���� Ŭ����, ������ �Ʒ��� �־����
			//���������� ���ؼ� FileNotFoundException ���� �ؿ� �ֵ����Ѵ�. (A1)
				System.out.print((char)i);
			}
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		
		} catch (IOException e) { // --->A1
		
			e.printStackTrace();
		}
	}
}
