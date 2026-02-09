package day07;

import java.util.HashMap;
import java.util.Map;

public class MulGen<K,V> {
	Map<K,V> map = new HashMap<>();
	K key;
	V val;
	public MulGen() {
		
	}
	public MulGen(K key,V val) {
		this.key = key;
		this.val = val;
		map.put(key, val);
		
	}
	public V getValueByKey(K k) {
		return map.get(k);
	}
	void put(K key,V val) {
		this.key = key;
	    this.val = val;
		map.put(key, val);
	}
	V getValue() {
		return val;
	}
	K getKey() {
		return key;
	}
	// Method lvl generics
	// <K,V> is important coz the incoming data in parameter should match this near left of boolean
	public static <K, V> boolean compare(MulGen<K, V> p1, MulGen<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
               p1.getValue().equals(p2.getValue());
    }
	
	//bounded type parameter
	
	

}
