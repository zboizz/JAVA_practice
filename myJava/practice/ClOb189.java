package practice;

public class ClOb189 {
	String title;
	String author;
	
	public ClOb189(String t) {
		title = t;
		author = "���ڹ̻�";
	}
	public ClOb189(String t, String a) {
		title = t; 
		author = a;
	}
	public static void main(String[] args) {
		ClOb189 littePrince = new ClOb189("�����","�������丮");
		ClOb189 loveStory = new ClOb189("������");
		System.out.println(littePrince.title + " " + littePrince.author);
		System.out.println(loveStory.title+ " " + loveStory.author);
	}
}
