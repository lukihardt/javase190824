package sopo.cn.oop4;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String, Value> map1 = new HashMap<String, Value>();
		String s1 = new String("key");
		String s2 = new String("key");
		Value value = new Value(2);
		map1.put(s1, value);
		System.out.println("s1.equals(s2): " + s1.equals(s2));
		System.out.println("map1.get(s1): " + map1.get(s1));
		System.out.println("map1.get(s1): " + map1.get(s2));
		
		System.out.println("=============================");
		
		Map<Key, Value> map2 = new HashMap<Key, Value>();
		Key k1 = new Key("A");
		Key k2 = new Key("A");
		map2.put(k1, value);
		System.out.println(k1.equals(k2));
		System.out.println(map2.get(k1));
		System.out.println(map2.get(k2));
		
	}
}
