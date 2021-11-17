package problems.common.concurrency;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueueWithLockAndCondition<Arko>  extends MyBlockingQueue<Arko>{
	
	private Lock lock = new ReentrantLock(true); 
	private Condition notEmpty = lock.newCondition();
	private Condition notFull = lock.newCondition();
	
	public MyBlockingQueueWithLockAndCondition(int size) {
		super(size);
	}
	
	public void put(Arko e) throws InterruptedException {
		lock.lock();
		try {
			while(q.size() == max) {
				notFull.await();
			}
			q.add(e);
			notEmpty.signalAll();
		}
		finally {
			lock.unlock();
		}
	}
	
	public Arko take() throws InterruptedException {
		lock.lock();
		try {
			while(q.isEmpty()) {
				notEmpty.await();
			}
			
			Arko ele = q.poll();
			notFull.signalAll();
			return ele;
		}
		finally {
			lock.unlock();
		}
	}
}
