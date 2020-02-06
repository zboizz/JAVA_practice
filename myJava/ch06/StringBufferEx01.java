package ch06;





public class StringBufferEx01 {
	public static void main(String[] args) {

		String s1 = "Java ";
		s1 += "Programming";
		System.out.println(s1);
		
		StringBuffer sb = new StringBuffer("Java ");
		//StringBuffer 사용시 new StringBuffer() 사용
		sb.append("programming");
		System.out.println(sb/*.toString() 생략되어 있음*/);
		sb.replace(0, 4, "Android");
		System.out.println(sb);		
		sb.deleteCharAt(0);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
	}
}
