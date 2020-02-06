package ch08;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileCopyEx01 {	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("�������� : ");
			String sFile = sc.nextLine();
			
			System.out.println("�������� : ");
			String cFile = sc.nextLine();
			
			FileReader fr = new FileReader("ch08/"+sFile);
			FileWriter fw = new FileWriter("ch08/"+cFile);
			
			int c;
			while((c=fr.read())!=-1) {
				fw.write(c);
			}
			fw.close();
			fr.close();
			System.out.println("Copy End...");			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
