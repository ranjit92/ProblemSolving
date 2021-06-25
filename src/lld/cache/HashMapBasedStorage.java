package lld.cache;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasedStorage<K, V> implements Storage<K, V>{
	private final int capacity;
	private Map<K,V> map;
	
	
	public HashMapBasedStorage(int capacity) {
		this.capacity = capacity;
		this.map = new HashMap<>();
	}
	
	
	
	@Override
	public void add(K k, V v){
		if(map.size() < capacity) {
			map.put(k, v);
		}
		else {
			throw new RuntimeException("Storage is full");
		}
	}

	@Override
	public void remove(K k) {
		if(map.containsKey(k)) {
			map.remove(k);
		}
		else {
			throw new RuntimeException("Key not present");
		}
	}

	@Override
	public V get(K k) {
		if(map.containsKey(k)) {
			return map.get(k);
		}
		else {
			throw new RuntimeException("Key not present");
		}
		
	}

}
