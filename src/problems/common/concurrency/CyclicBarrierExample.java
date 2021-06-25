package problems.common.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierExample {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(4);
		CyclicBarrier cd = new CyclicBarrier(3);

		es.submit(new Task(cd));
		es.submit(new Task(cd));
		es.submit(new Task(cd));
		System.out.println("I am not waiting");
	}
}

class Task implements Runnable {

	CyclicBarrier barrier;

	public Task(CyclicBarrier barrier) {
		this.barrier = barrier;
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
				barrier.await();
			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}
			System.out.println("All three parties arrive at barrier :"+Thread.currentThread().getName());
		}
		
		
	}

}
