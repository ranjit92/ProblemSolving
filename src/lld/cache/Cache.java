package lld.cache;

public class Cache<Key, Value> {

	private EvictionPolicy<Key> evictionPolicy;
	private Storage<Key, Value> storage;
	
	public Cache(EvictionPolicy<Key> evictionPolicy, Storage<Key, Value> storage) {
		this.evictionPolicy = evictionPolicy;
		this.storage = storage;
	}
	
	public void put(Key k, Value v) {
		
		try {
			storage.add(k, v);
			evictionPolicy.keyAccessed(k);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			Key key = evictionPolicy.evictKey();
			storage.remove(key);
			put(k,v);
		}
	}
	
	public Value get(Key k) {
		
		Value value = storage.get(k);
		evictionPolicy.keyAccessed(k);
		if(value == null) {
			System.out.println("Key not found");
		}
		return value;
	}
	
	
	
}
