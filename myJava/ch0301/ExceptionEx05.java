package ch0301;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionEx05 {

	public static void main(String[] args) {
		
			try {
				FileReader fr = myRead("aaa.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	public static FileReader myRead(String name) throws FileNotFoundException 
			{
		FileReader fr = new FileReader(name);
		return fr;
	}
}
