package ch03;

public class ForEachEx01 {
	public static void main(String[] args) {
		//for-each: �迭�̳� �ڷᱸ�� Ŭ����(Collection) �� ���Ҹ� ���������� ����
		int arr[] = {1,2,3};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println("sum : " + sum);
		
		sum=0;
		for (int i : arr) {
			sum+=i;
		}
		System.out.println("sum : " + sum);
		//
		String str[] = {"���̸�", "�ճ���", "������", "����", "����", "����", "����"};
		for (String s : str) {
			System.out.println(s);
		}
	}
}
