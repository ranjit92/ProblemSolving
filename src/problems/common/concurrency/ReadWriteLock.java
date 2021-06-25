package problems.common.concurrency;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLock {
	
	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	
	private ReentrantReadWriteLock.ReadLock readlock = lock.readLock();
	private ReentrantReadWriteLock.WriteLock writelock = lock.writeLock();
	
	
	public void readResource() {
		readlock.lock();
		try {
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			readlock.unlock();
		}
	}
	public void writeResource() {
		writelock.lock();
		try {
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			writelock.unlock();
		}
	}
	public static void main(String[] args) {
		ReadWriteLock obj = new ReadWriteLock();
		
		new Thread(() -> obj.readResource()).start();
		new Thread(() -> obj.readResource()).start();
		new Thread(() -> obj.writeResource()).start();
		new Thread(() -> obj.writeResource()).start();
	}
	
	

}
