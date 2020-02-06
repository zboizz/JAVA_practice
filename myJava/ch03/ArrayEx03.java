package ch03;

public class ArrayEx03 {
	public static void main(String[] args) {
		int arr[][] /*2차배열, []가 두개라서 2차배열*/ = new int[3][2];
	//배열에는 for문이 존재하는데 이때 N차일때 for문은 N개로 구성
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=i+j;
				System.out.println("arr["+i+"]["+j+"] = " +arr[i][j]);
			}
		}
		
		int arr1[][] = {{0,1},{2,3,5},{4,5,6,7}};
		
		int arr2[][][]= new int[2][3][2]; //1차배열의 크기는 2, 2차배열의 크기는 3, 3차배열의 크기는 2
				
		
		int arr3[][]= { {0,1}, {2,3}, {4,5} };
		
		
		
	}
}
