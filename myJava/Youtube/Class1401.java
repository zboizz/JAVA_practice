package Youtube;



public class Class1401 {

	public static void main(String[] args) {

		int N =5;
		int[][] array = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				array[i][j] = (int)(Math.random()*10);
				//�Ѹ��� 50�� �迭�� ����
				//���� 1�� �����ϴ� i,j�� ���� ��
				//[0][0],[0][1],[0][2].....[0][49]
				//[49][0],[49][1],[49][2]......[49][49]
				//Math.random �� ���Ͽ� (0~9)������ �� ����
				}
		}
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(array[i][j] + " ");
				}
				System.out.println();
				
			}
		}		
	}

