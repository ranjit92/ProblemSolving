package lld.cache;

public interface EvictionPolicy<K> {
	public void keyAccessed(K k);
	public K evictKey();
}
