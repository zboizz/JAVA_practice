package Youtube;



public class Class1401 {

	public static void main(String[] args) {

		int N =5;
		int[][] array = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				array[i][j] = (int)(Math.random()*10);
				//한면이 50인 배열이 생성
				//각각 1씩 증가하는 i,j의 값이 들어감
				//[0][0],[0][1],[0][2].....[0][49]
				//[49][0],[49][1],[49][2]......[49][49]
				//Math.random 을 통하여 (0~9)랜덤한 수 생성
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

