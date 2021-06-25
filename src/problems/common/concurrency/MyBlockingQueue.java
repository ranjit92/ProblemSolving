package problems.common.concurrency;

import java.util.LinkedList;
import java.util.Queue;

public abstract class MyBlockingQueue<E> {
	protected final int max;
	protected final Queue<E> q;
	
	public MyBlockingQueue(int size){
		this.max = size;
		this.q = new LinkedList<>();
	}

	public abstract void put(E e) throws InterruptedException;
	
	public abstract E take() throws InterruptedException;
}
