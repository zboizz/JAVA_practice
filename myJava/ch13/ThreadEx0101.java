package ch13;

class Thread0101 extends Thread{
	
	String name;
	
	public Thread0101(String name)	{
		this.name=name;
	}
	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(name +":" +i );
				Thread.sleep(500);
			}
		} catch (Exception e) {
			
		}
	}
	
}

public class ThreadEx0101 {
public static void main(String[] args) {
	Thread0101 t1 = new Thread0101("첫번째");
	Thread0101 t2 = new Thread0101("두번째");
	t1.start();
	t2.start();
 	}
}
