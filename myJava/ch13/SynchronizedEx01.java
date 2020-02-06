package ch13;

public class SynchronizedEx01 implements Runnable{

	
	public synchronized void a(String who) {
		try {
			Thread.sleep(200);
			System.out.println(who + "b() 호출");
			b(who);
		} catch (Exception e) {
			
		}
	}
	public synchronized void b(String who)	{
		try {
			Thread.sleep(200);
			System.out.println(who + "a() 호출");
			a(who);
		} catch (Exception e) {
		
		}
	}	
	
	
	@Override
	public void run() {
		b(Thread.currentThread().getName());
	}

	
	
	
	
	
	public static void main(String[] args) {
		SynchronizedEx01 s1 = new SynchronizedEx01();
		
		Thread t1 = new Thread(s1,"첫번쨰");
		Thread t2 = new Thread(s1,"두번째");
		t1.start();
		t2.start();
	}
}
