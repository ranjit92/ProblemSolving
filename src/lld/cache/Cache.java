package lld.cache;

public class Cache<K,V> {

	private EvictionPolicy<K> evictionPolicy;
	private Storage<K,V> storage;
	
	public Cache(EvictionPolicy<K> evictionPolicy, Storage<K,V> storage) {
		this.evictionPolicy = evictionPolicy;
		this.storage = storage;
	}
	
	public void put(K k, V v) {
		
		try {
			storage.add(k, v);
			evictionPolicy.keyAccessed(k);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			K key = evictionPolicy.evictKey();
			storage.remove(key);
			put(k,v);
		}
	}
	
	public V get(K k) {
		
		V value = storage.get(k);
		evictionPolicy.keyAccessed(k);
		if(value == null) {
			System.out.println("Key not found");
		}
		return value;
	}
	
	
	
}
