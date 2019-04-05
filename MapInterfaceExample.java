package com.amitebers.map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class MapInterfaceExample {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(32222221, "Amitabh");
		map.put(111114, "Amit");
		map.put(24444444, "Amitesh");
		map.put(23333333, "Jitesh");
		
		map.put(4, "Amrit");
		//map.put(null, "Amrita");
		//map.put(67, null);
		//map.put(null, "Smith");
		//map.put(89, null);
		
		System.out.println(map.entrySet());
		
		System.out.println("-----------------------");
		
		Map<Integer, String> result =map.entrySet().stream()
	                .sorted(Map.Entry.comparingByKey())
	                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
	                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		
		System.out.println(result);
		
		System.out.println("-----------------------");
		
		System.out.println(map.entrySet());
		
		Map<Integer, String> result2 = map.entrySet().stream()
	                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
	                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
	                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		
		System.out.println(result2);
		
		System.out.println("-----------------------");
		
		System.out.println(map.size());
		
		System.out.println(map.containsKey(3));
		
		System.out.println(map.containsValue("Amrita"));
		
		System.out.println(map.get(4));
		
		System.out.println(map.get(89));
		
		System.out.println(map.hashCode());
		
		System.out.println(map.isEmpty());
		
		System.out.println(map.remove(4));
		
		System.out.println(map.containsKey(4));
		
		System.out.println(map.get(4));
		
		System.out.println("-----------------------");
		
		Collection<String> c = map.values();
		
		for(String s: c) {
		
			System.out.println(s);
		}
		
		System.out.println("-----------------------");
		
		Set<Integer> s = map.keySet();
		System.out.println( map.keySet());
		for(Integer i: s) {
			System.out.println(i+" "+map.get(i));
		}
		
		System.out.println("-----------------------");
		
		
		Map<Integer,String> map1 = new HashMap<>();
		
		Comparator<Map.Entry<Integer, String>>  com = 	Map.Entry.comparingByKey();
		
		System.out.println("-----------------------");
		
		map1.putAll(map);
		
		System.out.println(map1.get(89));
		
		System.out.println(map.equals(map1));
		
		System.out.println("-----------------------");
		
		Set<Map.Entry<Integer, String>> s2 = map.entrySet();
		
		Set<Map.Entry<Integer, String>> s3 = map1.entrySet();
		
		System.out.println(s3.equals(s2));
		
		Iterator it = s2.iterator();
		
		while(it.hasNext()) {
			Map.Entry<Integer, String> m2= (Entry<Integer, String>) it.next();
			System.out.println(m2.getKey()+" "+m2.getValue()+" "+m2.hashCode()+" "+m2.setValue("happy hour")+" "+m2.getValue());
			System.out.println();
		}
		System.out.println(s3.equals(s2));
		
		map.clear();
		
		System.out.println(map.size());
		
		/*clear()
		Removes all of the mappings from this map (optional operation).
		
		boolean 	containsKey(Object key)
		Returns true if this map contains a mapping for the specified key.
		
		boolean 	containsValue(Object value)
		Returns true if this map maps one or more keys to the specified value.
		
		Set<Map.Entry<K,V>> 	entrySet()
		Returns a Set view of the mappings contained in this map.
		
		boolean 	equals(Object o)
		Compares the specified object with this map for equality.
		
		V 	get(Object key)
		Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
		
		int 	hashCode()
		Returns the hash code value for this map.
		
		boolean 	isEmpty()
		Returns true if this map contains no key-value mappings.
		
		Set<K> 	keySet()
		Returns a Set view of the keys contained in this map.
		
		V 	put(K key, V value)
		Associates the specified value with the specified key in this map (optional operation).
		
		void 	putAll(Map<? extends K,? extends V> m)
		Copies all of the mappings from the specified map to this map (optional operation).
		
		V 	remove(Object key)
		Removes the mapping for a key from this map if it is present (optional operation).
		
		int 	size()
		Returns the number of key-value mappings in this map.
		
		Collection<V> 	values()
		Returns a Collection view of the values contained in this map.*/

	}

}
