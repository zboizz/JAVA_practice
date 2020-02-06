package ch13;

class Thread01 extends Thread{
	
	String name;
	
	public Thread01(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(name  +" : " + i);
				Thread.sleep(500);//0.5초동안 잠시 졸아라.
			}
		} catch (Exception e) {}
	}
}
public class ThreadEx01{	
	public static void main(String[] args) {
		Thread01 t1 = new Thread01("첫번째");
		Thread01 t2 = new Thread01("두번째");
		t1.start();
		t2.start();
	}
}
