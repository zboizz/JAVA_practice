package practice;

import java.util.Scanner;

import Youtube.Student;

//import Youtube.Student;

public class Main {
	public static void main(String[] args) {

//		Student s1 = new Student("홍길동", 20, 175, 70, "201701", 1, 4.5);
//		s1.show();
//		Student s2 = new Student("이순신", 10, 173, 50, "201705", 2, 3.5);
//		s2.show();
//		Student s3 = new Student("김파랑", 14, 183, 90, "201705", 2, 1.5);
//		s3.show();
//		
//		Student[] ss = new Student[100];
//		for (int i = 0; i < 100; i++) {
//			ss[i] = new Student("민수", 20, 175, 70, i+"", 1, 4.5);
//			ss[i].show();
//		}
//		
//		
//		
//		//Student t1 = new Student("john", 25, 180, 120, "ABC", 3000, 5);
//		//t1.show();
	
		Scanner sc = new Scanner(System.in);
		System.out.println("총 몇명의 학생이 존재하는가?");
		int number = sc.nextInt();
		Student[] ss = new Student[number];
		for (int i = 0; i < number; i++) {
			String name;
			int age;
			int height;
			int weight;
			String studentID;
			int grade;
			double gPA;
			System.out.println("학생의 이름");
			name = sc.next();
			System.out.println("학생의 나이");
			age = sc.nextInt();
			System.out.println("학생의 키");
			height = sc.nextInt();
			System.out.println("학생의 몸무게 ");
			weight = sc.nextInt();
			System.out.println("학생의 학번");
			studentID = sc.next();
			System.out.println("학생의 성적");
			grade = sc.nextInt();
			System.out.println("학생의 gpa");
			gPA = sc.nextDouble();
			
			ss[i] = new Student(name, age, height, weight, studentID, grade, gPA);
		}
		for (int i = 0; i < number; i++) {
			ss[i].show();
			
		}
		
		
	
	}
}
