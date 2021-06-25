package problems.common.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLock {

	Lock locka = new ReentrantLock(true);
	Lock lockb = new ReentrantLock(true);

	Runnable runnable1 = () -> {

		locka.lock();

		System.out.println("Locking on resource A by" + Thread.currentThread().getName());

		lockb.lock();
		locka.unlock();
		lockb.unlock();

	};

	Runnable runnable2 = () -> {

		lockb.lock();

		System.out.println("Locking on resource B by" + Thread.currentThread().getName());

		locka.lock();

		lockb.unlock();
		locka.unlock();

	};

	public static void main(String[] args) {
		DeadLock dlock = new DeadLock();
		new Thread(dlock.runnable1).start();
		new Thread(dlock.runnable2).start();

	}

}
