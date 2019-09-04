package sopo.cn.oop4;

import java.util.Arrays;

public class TestMain {
	public static void main(String[] args) {
		OuterClass out = new OuterClass();
		InnerClass innerClass = out.getInnerClass(11, "poter");
		System.out.println(innerClass.getNum());
		System.out.println(innerClass.getString());
		
		System.out.println("================================");
		
		for(Day2 day : Day2.values()) {
			System.out.println("name: " + day.name() + " " + day.getDesc() + " code: " + day.getCode());
		}
		
		int[] arr1 = {1, 3, 5, 7};
		int[] arr2 = new int[10];
		System.arraycopy(arr1, 0, arr2, 4, 4);
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("================================");
		
		long l = System.currentTimeMillis();
		System.out.println(l);
		
		System.out.println("================================");
		long start = System.currentTimeMillis();
		int a = 1;
		for (int i = 0; i < 1000000; i++) {
			a = a + i;
		}
		long end = System.currentTimeMillis();
		System.out.println(start - end);
		
		System.out.println("================================");
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("user.dir"));
		System.gc();
		System.exit(0);
	}
}
