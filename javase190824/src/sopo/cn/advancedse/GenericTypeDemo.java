package sopo.cn.advancedse;

import java.util.ArrayList;
import java.util.List;

public class GenericTypeDemo {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
//		List arrayList = new ArrayList();
//		arrayList.add("aaaa");
//		arrayList.add(100);
//		arrayList.add(10.2);
		
		List<String> stringArrayList = new ArrayList<String>();
		List<Integer> integerArrayList = new ArrayList<Integer>();
		
		Class classStringArrayList = stringArrayList.getClass();
		Class integerArrayListList = integerArrayList.getClass();
		
		if (classStringArrayList.equals(integerArrayListList)) {
			System.out.println("泛型测试:类型相同");
		}
	}
}
