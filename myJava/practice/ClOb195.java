package practice;


public class ClOb195{
	String title;
	String author;
	
	void show() {System.out.println(title + " " + author);}
		
	
		public ClOb195() {
			this("","");
			System.out.println("������ ȣ���");
		}
		
		public ClOb195(String title) {
			this(title, "���ڹ̻�");
			
		}
		
		public ClOb195(String title, String author) {
			this.title = title;
			this.author = author;
		}

public static void main(String[] args) {

	ClOb195 littlePrince = new ClOb195("�����","�������丮");
	ClOb195 loveStory = new ClOb195("������");
	ClOb195 emptyBook = new ClOb195();
	loveStory.show();
	littlePrince.show();
	}
}









