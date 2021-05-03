package problems.common;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Semaphore {

	public static void main(String[] args) {
		java.util.concurrent.Semaphore sema = new java.util.concurrent.Semaphore(3);
		ExecutorService threadpool = Executors.newFixedThreadPool(50);
		threadpool.submit(new Task(sema));
		
		threadpool.shutdown();
	}

	static class Task implements Runnable {

		java.util.concurrent.Semaphore sema;

		public Task(java.util.concurrent.Semaphore sema) {
			this.sema = sema;
		}

		@Override
		public void run() {
			sema.acquireUninterruptibly();
			//Do Some processing
			System.out.println("Thread > "+ Thread.currentThread().getName());
			sema.release();
		}

	}
}
