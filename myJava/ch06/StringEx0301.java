package ch06;

public class StringEx0301 {
	public static void main(String[] args) {
		String t1 = "���� �׳� ����νʽÿ�. �� ���� �ͼ� ���ðڽ��ϴ�."
					+"��ġ �ؾ�ΰ� �� ���� ã���� ������ ��� ���Ҵ�." 
				    +"�������� �Ǳ������� ���� �� �� ������ �� ������ ���" 
					+"���ĵ��� �ٽ� �ѹ� ������ ���� ���ѷ���.";

		
		for (int i = 0; i < t1.length(); i++) {
			if(t1.charAt(i)==' ')
				System.out.print(t1.indexOf(" ",i)+",");
		}System.out.println();
		
		for (int i = 0; i < t1.length(); i++) {
			char c = t1.charAt(i);
			if(c ==' ') {
				System.out.print(i+",");
		//		if(c!=' ') continue;
		//		System.out.print(i+ ",");
			}
			
		}System.out.println();
		int idx = -1;
		do {
			idx = t1.indexOf(' ',idx+1);
			if(idx!=-1)System.out.print(idx+",");
		}while(idx>=0);
		System.out.println("");
		
		//=================================================   lastIndexOf
		for (int i=t1.length()-1; i>=0; i--) {
			if(t1.charAt(i)==' ')
				System.out.print(t1.lastIndexOf(" ",i)+",");
		}System.out.println();
		
		for (int i=t1.length()-1;  i>=0; i--) {
			char c1 = t1.charAt(i);
			if(c1==' ') {
				System.out.print(i+ ",");
			}					
		}System.out.println();
		
		idx = t1.length();
		do {
			idx= t1.lastIndexOf(' ',idx-1);
		if(idx!=-1) System.out.print(idx + ",");
		} while (idx>=0);
	
	}

}