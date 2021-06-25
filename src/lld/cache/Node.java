package lld.cache;

public class Node<K> {

	Node next;
	Node prev;
	K element;
	
	public Node(K element) {
		this.next = null;
		this.prev = null;
		this.element = element;
	}
	
}
