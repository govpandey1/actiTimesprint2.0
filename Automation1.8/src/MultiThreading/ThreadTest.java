package MultiThreading;


public class ThreadTest extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++) {
		System.out.println("my Thread"+i);
		}
	}
	

	public static void main(String[] args) {
		

	}

}
