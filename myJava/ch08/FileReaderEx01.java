package ch08;

import java.io.FileReader;

public class FileReaderEx01 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("ch08/aaa.txt");
			
			int i;
			while((i=fr.read())!=-1) { //������ ���������� -1�� ���� ������, -1�� �ƴҶ����� ���
				System.out.print((char)i);
			}
			fr.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
