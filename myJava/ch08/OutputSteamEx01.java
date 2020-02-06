package ch08;

import java.io.OutputStream;

public class OutputSteamEx01 {
	public static void main(String[] args) {
		int i = 'A';
		//System.out.println(i);
		char c = 'b';
		char c1 = '갑';
		try {
			//콘솔창에 출력스트림 빨대를 꼽는다.
			OutputStream os = System.out;
			os.write(i);
			os.write(c);
			os.write(c1); //print - write 같은 기능
			
			os.flush(); //스트림에 남아있는 data를 비운다.
			os.close(); //스트림을 닫는다.
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
