package ch08;

import java.io.OutputStream;

public class OutputSteamEx01 {
	public static void main(String[] args) {
		int i = 'A';
		//System.out.println(i);
		char c = 'b';
		char c1 = '��';
		try {
			//�ܼ�â�� ��½�Ʈ�� ���븦 �Ŵ´�.
			OutputStream os = System.out;
			os.write(i);
			os.write(c);
			os.write(c1); //print - write ���� ���
			
			os.flush(); //��Ʈ���� �����ִ� data�� ����.
			os.close(); //��Ʈ���� �ݴ´�.
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
