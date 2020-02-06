package ch07;

import java.util.Vector;

public class VectorEx03 {
	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<Integer>(4,3); //기본 용량 4, 증가량 3
		System.out.println("용량 : " + vec.capacity());
		System.out.println("요소 : " + vec.size());
		
		System.out.println("요소값 비워있는지 여부 : " + vec.isEmpty());   //여기선 true
		
		for (int i = 0; i < 10; i++) {
			vec.add(i*10);	
			System.out.print(vec.get(i)+" ");
		}System.out.println();
		
		System.out.println("용량 : " + vec.capacity());
		System.out.println("요소 : " + vec.size());
		System.out.println("첫번째 요소 : " + vec.firstElement());
		System.out.println("마지막 요소 : " + vec.lastElement());
		System.out.println("두번째 요소 : " + vec.get(1)); //0부터 시작하기에 두번째는 1
		System.out.println("요소값 비워있는지 여부 : " + vec.isEmpty());   //여기선 false
		 
		vec.remove(2); //3번째 요소를 제거
		for (int i = 0; i < vec.size(); i++) {
			System.out.print(vec.get(i)+" ");
		}System.out.println();
		
		if(vec.contains(30)) {
			System.out.println("30이 있네요");
		}
		System.out.println(vec.indexOf(40));  //요소의 index값 리턴, 5값 출력
		System.out.println(vec.indexOf(140)); //요소의 index값 리턴, 없어서 -1값 출력
		
		System.out.println("용량 : " + vec.capacity());  //--->10
		System.out.println("요소 : " + vec.size());      //--->9
		
		vec.trimToSize();
		System.out.println("용량 : " + vec.capacity()); //--->9
		System.out.println("요소 : " + vec.size());     //--->9
		
		//모든 요소를 제거하고자 한다면
		vec.removeAllElements();
		System.out.println(vec.isEmpty()); //--->true
	}
}
