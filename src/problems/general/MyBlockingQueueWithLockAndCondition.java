package problems.general;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueueWithLockAndCondition<E>  extends MyBlockingQueue<E>{
	
	private Lock lock = new ReentrantLock(true); 
	private Condition notEmpty = lock.newCondition();
	private Condition notFull = lock.newCondition();
	
	public MyBlockingQueueWithLockAndCondition(int size) {
		super(size);
	}
	
	public void put(E e) throws InterruptedException {
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
	
	public E take() throws InterruptedException {
		lock.lock();
		try {
			while(q.isEmpty()) {
				notEmpty.await();
			}
			
			E ele = q.poll();
			notFull.signalAll();
			return ele;
		}
		finally {
			lock.unlock();
		}
	}
}
