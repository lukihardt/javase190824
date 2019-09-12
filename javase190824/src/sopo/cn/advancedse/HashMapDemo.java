package sopo.cn.advancedse;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("key1", "value1");
		hashMap.put("key2", "value2");
		hashMap.put("key3", "value3");
		hashMap.put("key4", "value4");
		hashMap.put("key5", "value5");

		Collection<Object> value = hashMap.values();
		for (Object object : value) {
			System.out.println(object);
		}

		hashMap.remove("key1");
		Object str1 = hashMap.get("key1");
		Object str2 = hashMap.get("key2");
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		
		hashMap.put("key1", "oldValue1");
		//第二次遍历
		Collection<Object> value2 = hashMap.values();
		for (Object object : value2) {
			System.out.println(object);
		}
		
		Set<Map.Entry<String, Object >> entries = hashMap.entrySet();
		for (Map.Entry<String, Object> entry : entries) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		
		System.out.println(hashMap);
	}
}
