package ch03;

public class ArrayEx03 {
	public static void main(String[] args) {
		int arr[][] /*2���迭, []�� �ΰ��� 2���迭*/ = new int[3][2];
	//�迭���� for���� �����ϴµ� �̶� N���϶� for���� N���� ����
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=i+j;
				System.out.println("arr["+i+"]["+j+"] = " +arr[i][j]);
			}
		}
		
		int arr1[][] = {{0,1},{2,3,5},{4,5,6,7}};
		
		int arr2[][][]= new int[2][3][2]; //1���迭�� ũ��� 2, 2���迭�� ũ��� 3, 3���迭�� ũ��� 2
				
		
		int arr3[][]= { {0,1}, {2,3}, {4,5} };
		
		
		
	}
}
