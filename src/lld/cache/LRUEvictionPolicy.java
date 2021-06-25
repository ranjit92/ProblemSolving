package lld.cache;

import java.util.HashMap;
import java.util.Map;

public class LRUEvictionPolicy<K> implements EvictionPolicy<K> {

	private DoublyLinkedList<K> dll;
	private Map<K, Node<K>> mapper;
	
	
	
	
	public LRUEvictionPolicy() {
		this.dll = new DoublyLinkedList<>();
		this.mapper = new HashMap<>();
	}

	@Override
	public void keyAccessed(K k) {
		if(mapper.containsKey(k)) {
			dll.detached(mapper.get(k));
			dll.addElementAtLast(k);
		}
		else {
			Node<K> newNode = dll.addElementAtLast(k);
			mapper.put(k, newNode);
		}
	}

	@Override
	public K evictKey() {
		Node<K> firstNode = dll.getFirstNode();
		if(firstNode != null) {
			dll.detached(firstNode);
			return firstNode.element;
		}
		return null;
	}

}
