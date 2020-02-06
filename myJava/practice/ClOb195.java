package practice;


public class ClOb195{
	String title;
	String author;
	
	void show() {System.out.println(title + " " + author);}
		
	
		public ClOb195() {
			this("","");
			System.out.println("생성자 호출됨");
		}
		
		public ClOb195(String title) {
			this(title, "작자미상");
			
		}
		
		public ClOb195(String title, String author) {
			this.title = title;
			this.author = author;
		}

public static void main(String[] args) {

	ClOb195 littlePrince = new ClOb195("어린왕자","생떽쥐페리");
	ClOb195 loveStory = new ClOb195("춘향전");
	ClOb195 emptyBook = new ClOb195();
	loveStory.show();
	littlePrince.show();
	}
}









