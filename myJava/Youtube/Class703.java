package Youtube;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Class703 {
	public static void main(String[] args) {
		
		File file = new File("Input.txt"); 
		// 'input.txt'�̶�� ������ �����ͼ� file�̶�� ������ ó���� �Ѵ�.
		
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt()) //sc�� ���� �о���� �ִ� ���Ͽ��� ������ ���� ������ �ִ°�
			{
				System.out.println(sc.nextInt() * 100); // ������ �ִٸ� �̰��� ��µ�
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("���� �߻�");
		} 
		
	}
}
