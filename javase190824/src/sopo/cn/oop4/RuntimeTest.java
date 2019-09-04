package sopo.cn.oop4;

public class RuntimeTest {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		System.out.println("处理器的数量: "+runtime.availableProcessors());
	}
}
