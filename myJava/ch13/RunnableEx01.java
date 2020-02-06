package ch13;

class Runnable01 implements Runnable {
	
	String name;
	
	public Runnable01(String name)	{
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
	

public class RunnableEx01 {
	
	public static void main(String[] args) {
	Runnable01 r1 = new Runnable01("one");
	Runnable01 r2 = new Runnable01("two");
	Thread t1 = new Thread(r1);
	Thread t2 = new Thread(r2);
	t1.start();
	t2.start();
	}

}
