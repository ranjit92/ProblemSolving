package problems.common.concurrency;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Semaphore {

	static java.util.concurrent.Semaphore sema = new java.util.concurrent.Semaphore(3);
	public static void main(String[] args) {
		
		ExecutorService threadpool = Executors.newFixedThreadPool(50);
		
		for(int i=0; i<100; i++) {
			threadpool.submit(new Task());	
		}
		threadpool.shutdown();
	}

	static class Task implements Runnable {
		@Override
		public void run() {
			sema.acquireUninterruptibly();
			//Do Some processing
			System.out.println("Thread > "+ Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			sema.release();
		}

	}
}
