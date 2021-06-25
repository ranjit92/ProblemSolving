package problems.common.concurrency;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExample {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService es = Executors.newFixedThreadPool(4);
		CountDownLatch cd = new CountDownLatch(3);

		es.submit(new DependentTask(cd));
		es.submit(new DependentTask(cd));
		es.submit(new DependentTask(cd));

		cd.await();
		es.shutdown();
		System.out.println("After all dependent task complets");
	}

}

class DependentTask implements Runnable {

	CountDownLatch cd;

	public DependentTask(CountDownLatch cd) {
		this.cd = cd;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		cd.countDown();
	}

}
