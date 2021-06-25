import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockAndConditions {

	Lock lock = new ReentrantLock(true);
	Condition queueFull = lock.newCondition();
	Condition queueimpty = lock.newCondition();
	
	Queue<Integer> queue = new ArrayBlockingQueue<>(10);
	int capacity = 10;
	
	
	public void put(int count) {
		
		try {
			while(queue.size() == capacity) {
				queueFull.wait();
			}
			
			queue.add(e)
			queueimpty.notifyAll();
		}
		catch(Exception e){
			
		}
	}
	
	
	
	
	
}
