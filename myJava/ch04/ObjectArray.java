package ch04;


	class ObjArray{
	int a;
	ObjArray(int a){
		this.a = a;
	}
}
public class ObjectArray {	
	 public static void main(String[] args) {
		 //객체 배열: 배열을 만든다고 해서 객체가 만들어지는 것은 아님
		 ObjArray arr[] = new ObjArray[5];
		 //arr[0].a=10;
		 String s = null;
		 // s.length();
		 for (int i = 0; i < arr.length; i++) {
			arr[i]= new ObjArray(i*10); //객체가 생성이 된다.
			System.out.println(arr[i].a);
		}
	 }
}
