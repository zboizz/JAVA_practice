package ch08;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WriterEx01 {
	public static void main(String[] args) {
		OutputStream os = System.out;
		Writer writer = new OutputStreamWriter(os);
		
		int i = 'A';
		char c = 'b';
		char c1 = 'À»';
		
		try {
			writer.write(i);
			writer.write(c);
			writer.write(c1);
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
