package ch08;

import java.io.File;

public class FileEx02{
	public static void main(String[] args) {
		String dir = "c:/";
		File fdir = new File(dir);
		if(fdir.isDirectory()	) {
			System.out.printf("������ %s�� ���͸��� �Դϴ�", dir);
			String list[] =fdir.list();
			for (int i = 0; i < list.length; i++) {
				File f = new File(dir + list[i]);
				if(f.isDirectory())
					System.out.println("["+list[i]+"]");
				else
					System.out.println(list[i]);
			}
		}else {
			System.out.printf("������ %s�� ���͸��� �ƴմϴ�", dir);
		}
	}
}
