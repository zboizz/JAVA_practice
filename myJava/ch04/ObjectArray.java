package ch04;


	class ObjArray{
	int a;
	ObjArray(int a){
		this.a = a;
	}
}
public class ObjectArray {	
	 public static void main(String[] args) {
		 //��ü �迭: �迭�� ����ٰ� �ؼ� ��ü�� ��������� ���� �ƴ�
		 ObjArray arr[] = new ObjArray[5];
		 //arr[0].a=10;
		 String s = null;
		 // s.length();
		 for (int i = 0; i < arr.length; i++) {
			arr[i]= new ObjArray(i*10); //��ü�� ������ �ȴ�.
			System.out.println(arr[i].a);
		}
	 }
}
