package sopo.cn.advancedse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListDemo{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Tom");
		list.add("Bob");
		list.add("Marry");
		list.add(2, "Marry2");
		Iterator<String> it = list.iterator();
		System.out.println(list.indexOf("Bob"));
		System.out.println("start----------->");
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		System.out.println("the last round");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("------------->end");

		// Collection
		System.out.println("==============");
		Collection<String> collection = new ArrayList<String>();
		collection.add("Tom");
		collection.add("Bob");
		collection.add("Allen");
		collection.add("Dacy");
		collection.remove("Tom");
		
		Collection<String> c = new ArrayList<String>();
		c.add("Bob");
		c.add("Allen");
		collection.removeAll(c);
		System.out.println("collection.contains(\"Tom\"): " + collection.contains("Tom"));
		
		collection.isEmpty();

		Iterator<String> it2 = collection.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}

		collection.remove("");
		
		Set treeSet = new TreeSet();
		treeSet.add(1.2);
		treeSet.add(3.2);
		treeSet.add(2.1);
		treeSet.add(3.1);
		
	}
	
}
