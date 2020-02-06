package ch06;

public class StringEx0301 {
	public static void main(String[] args) {
		String t1 = "술은 그냥 따라두십시오. 얼른 갔다 와서 마시겠습니다."
					+"마치 잊어두고 온 물건 찾으러 나가는 사람 같았다." 
				    +"만용인지 의기인지는 아직 알 수 없으나 그 씩씩한 기상에" 
					+"제후들은 다시 한번 속으로 혀를 내둘렀다.";

		
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