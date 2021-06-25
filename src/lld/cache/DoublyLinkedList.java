package lld.cache;

public class DoublyLinkedList<K> {

	private Node<K> head;
	private Node<K> tail;

	public DoublyLinkedList() {
		head = new Node<>(null);
		tail = new Node<>(null);

		head.next = tail;
		tail.prev = head;
	}

	public void detached(Node<K> node) {
		if (node != null) {
			node.prev.next = node.next;
			node.next.prev = node.prev;
		}
	}

	private void addNodeAtLast(Node<K> node) {

		if (node != null) {

			// DoublyListNode tailprev = tail.prev;
			tail.prev.next = node;
			node.prev = tail.prev;
			node.next = tail;
			tail.prev = node;

		}

	}

	public Node<K> addElementAtLast(K key) {

		if (key == null) {
			throw new RuntimeException("Null Element");
		}
		Node<K> node = new Node(key);
		addNodeAtLast(node);
		return node;
	}
	
	
	public boolean isItemPresent() {
		return head.next != tail;
	}

	public Node<K> getFirstNode(){

		if(!isItemPresent()) {
			throw new RuntimeException("Null Element");
		}
		return head.next;
	}

	public Node<K> getLastNode() {

		if(!isItemPresent()) {
			throw new RuntimeException("Null Element");
		}
		return tail.prev;
	}

}
