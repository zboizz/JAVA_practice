package ch08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class LineNumEx01 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("ch08/LineNumEx01.java");
			BufferedReader br = new BufferedReader(fr);
			
			//������ ����: true�� �س����� �ڵ� flush ����� ����ȴ�.
			FileWriter fw = new FileWriter("ch08/LineNumEx01.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			String s = "";
			int i = 1;
			while(true) {
				s = br.readLine();
				if(s==null) break;
				if(i<10) s= " "+ i + " : " + s;
				else s = i + " : " + s;
				//System.out.println(s);
				
				bw.write(s);
				bw.newLine();
				//bw.flush();				
			
				i++;
			}
				bw.close();
				br.close();
				System.out.println("����");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
