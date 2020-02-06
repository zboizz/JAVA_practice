package practice;

public class ArrayPr01 {
	public static void main(String[] args) {
		double score[][] = {{3.3,3.4},{3.5,3.6},{3.7,3.8},{3.9,4.0}};
		
		double sum=0;
		for (int year = 0; year < score.length; year++) 
			for (int term = 0; term < score[year].length; term++) 
				sum+=score[year][term];
				
				int n = score.length;
				int m = score[0].length;
				System.out.println("4학년 전체 평균은"+ sum/(n*m));
			}
		}
	

