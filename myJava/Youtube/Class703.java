package Youtube;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Class703 {
	public static void main(String[] args) {
		
		File file = new File("Input.txt"); 
		// 'input.txt'이라는 파일을 가져와서 file이라는 변수가 처리를 한다.
		
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt()) //sc가 현재 읽어오고 있는 파일에서 다음과 같은 정수가 있는가
			{
				System.out.println(sc.nextInt() * 100); // 정수가 있다면 이것이 출력됨
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("오류 발생");
		} 
		
	}
}
