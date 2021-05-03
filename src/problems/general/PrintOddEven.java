package problems.general;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintOddEven {

	AtomicInteger counter = new AtomicInteger(1);
	volatile int max = 50;

	Lock lock = new ReentrantLock(true);
	Condition isOddDone = lock.newCondition();
	Condition isEvenDone = lock.newCondition();

	public static void main(String[] args) throws InterruptedException {

		PrintOddEven ob = new PrintOddEven();
		ob.callOdd();
		ob.callEven();

		//Thread.sleep(5000);

	}

	public void callOdd() {

		final Runnable odd = () -> {
			lock.lock();

			try {
				while (counter.get() < max) {

					while (counter.get() % 2 != 0) {
						isEvenDone.await();
					}
					System.out.println(Thread.currentThread() + "> " + counter.getAndIncrement());
					isOddDone.signalAll();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				lock.unlock();
			}

		};
		new Thread(odd).start();

	}

	public void callEven() {

		final Runnable even = () -> {
			lock.lock();
			try {
				while (counter.get() < 50) {

					while (counter.get() % 2 == 0) {
						isOddDone.await();
					}
					System.out.println(Thread.currentThread() + "> " + counter.getAndIncrement());
					isEvenDone.signalAll();

				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				lock.unlock();
			}

		};

		new Thread(even).start();

	}

}
