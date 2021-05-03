package problems.common;

public class JoinExample{

	public static void main(String[] args) throws InterruptedException{
		
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		Thread thread3 = new Thread(runnable);
		
		
		
		thread1.start();
		thread1.join();
		thread2.start();
//		thread2.join();
		thread3.start();
//		thread3.join();
	}
	
	static Runnable runnable = () ->{
		for(int i=0; i< 5; i++) {
			System.out.println(Thread.currentThread().getName() +" >> "+i);
		}
	}; 
}
