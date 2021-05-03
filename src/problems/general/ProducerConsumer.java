package problems.general;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {
	private static volatile int c = 0;
	public static void main(String[] args) throws InterruptedException {
		
//		BlockingQueue<Integer> bq = new ArrayBlockingQueue<>(10);
		
//		use own Blocking queue implementation.
//		MyBlockingQueue<Integer> mbq = new MyBlockingQueueWithLockAndCondition<>(10);
		MyBlockingQueue<Integer> mbq = new MyBlockingQueueWithWaitAndNotify<>(10);
		
		final Runnable producer = () ->{
			while(true) {
				try {
					mbq.put(++c);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		new Thread(producer).start();
		new Thread(producer).start();
		
		final Runnable consumer = () ->{
			while(true) {
				try {
					System.out.println(mbq.take());
					//Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		new Thread(consumer).start();
		new Thread(consumer).start();
	}
}
