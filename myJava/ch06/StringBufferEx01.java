package ch06;





public class StringBufferEx01 {
	public static void main(String[] args) {

		String s1 = "Java ";
		s1 += "Programming";
		System.out.println(s1);
		
		StringBuffer sb = new StringBuffer("Java ");
		//StringBuffer ���� new StringBuffer() ���
		sb.append("programming");
		System.out.println(sb/*.toString() �����Ǿ� ����*/);
		sb.replace(0, 4, "Android");
		System.out.println(sb);		
		sb.deleteCharAt(0);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
	}
}
