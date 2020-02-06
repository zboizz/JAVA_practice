package practice;

public class ClOb189 {
	String title;
	String author;
	
	public ClOb189(String t) {
		title = t;
		author = "작자미상";
	}
	public ClOb189(String t, String a) {
		title = t; 
		author = a;
	}
	public static void main(String[] args) {
		ClOb189 littePrince = new ClOb189("어린왕자","생텍쥐페리");
		ClOb189 loveStory = new ClOb189("춘향전");
		System.out.println(littePrince.title + " " + littePrince.author);
		System.out.println(loveStory.title+ " " + loveStory.author);
	}
}
