package ch08;

import java.io.FileWriter;

public class FileWriterEx01 {

	public static void main(String[] args) {
		String str = "Dream as if you'll live forever,\n"
				+ "Live as if you'll die today - ¡¶¿”Ω∫µÚ";
		try {
			FileWriter fw = new FileWriter("ch08/ccc.txt");
			fw.write(str);
			fw.flush();
			fw.close();
			System.out.println("End......");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
