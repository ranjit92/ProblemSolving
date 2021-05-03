package problems.general;

public class MyBlockingQueueWithWaitAndNotify<E> extends MyBlockingQueue<E> {

	public MyBlockingQueueWithWaitAndNotify(int size) {
		super(size);
	}

	public void put(E e) throws InterruptedException {
		synchronized (q) {
			while (q.size() == max) {
				q.wait();
			}
		}

		synchronized (q) {
			q.add(e);
			q.notifyAll();

		}

	}

	public synchronized E take() throws InterruptedException {
		synchronized (q) {
			while (q.isEmpty()) {
				q.wait();
			}
		}

		synchronized (q) {
			E ele = q.poll();
			q.notifyAll();
			return ele;
		}

	}

}
