package lld.cache;

public interface Storage<K,V> {

	public void add (K k ,V v);
	public void remove(K k);
	public V get(K k);
}
