package ch13;

class Thread02{
	
	String name;
	
	public Thread02(String name) {
		this.name = name;
	}
	
	
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(name  +" : " + i);
				Thread.sleep(500);//0.5초동안 잠시 졸아라.
			}
		} catch (Exception e) {}
	}

public void start() {
	run();
	}
}

public class ThreadEx02{	
	public static void main(String[] args) {
		Thread02 t1 = new Thread02("First");
		Thread02 t2 = new Thread02("Second");
		t1.start();
		t2.start();
	}
}
