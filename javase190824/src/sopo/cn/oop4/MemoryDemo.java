package sopo.cn.oop4;

public class MemoryDemo {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		long mem1, mem2;
		@SuppressWarnings("unused")
		Integer[] someints = new Integer[1000000];
		System.out.println("total memory is: " + runtime.totalMemory());
		System.out.println("inital free memory is: " + runtime.freeMemory());
		runtime.gc();
		System.out.println("===========================");
		System.out.println("free memory after garbage collection: " + runtime.freeMemory());
		
		mem1 = runtime.freeMemory();
		for (int i = 0; i < 100000; i++) {
			someints[i] = new Integer(i);
		}
		mem2 = runtime.freeMemory();
		System.out.println("free memory after allocation: " + runtime.freeMemory());
		System.out.println("memory used by allocation: " + (mem1 - mem2));
		
		System.out.println("===========================");
		System.out.println("free memory before collecting discarded integers: (1)" + runtime.freeMemory());
		for (int i = 0; i < 100000; i++) {
			someints[i] = null;
		}
		System.out.println("free memory before collecting discarded integers: (2)" + runtime.freeMemory());
		runtime.gc();
		mem2 = runtime.freeMemory();
		System.out.println("free memory after collecting discarded integers: " + mem2);
	}
}
