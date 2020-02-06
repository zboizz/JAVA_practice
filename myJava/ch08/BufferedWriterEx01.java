package ch08;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class BufferedWriterEx01 {
	public static void main(String[] args) {
		String str = "오늘은 비가 내립니다.";
		//콘솔창에 버퍼의 기능이 있는 빨대를 연결했다.
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	try {
		bw.write(str, 0 , str.length());
		bw.newLine();
		bw.write(str);
		bw.newLine();
		bw.flush();
		bw.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
}
