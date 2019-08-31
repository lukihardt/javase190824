package sopo.cn.oop2;

public class Test01 {
	final int x1 = 18;
	final int x2;
	final int x3;
	int x4;
	{
		x2 = 20;
	}
	public Test01() {
		x3 = 21;
	}
	
	
	
	public static void main(String[] args) {
		testMethod();
	}
	
	public static void testMethod() {
		final Test01 test01= new Test01();
		test01.x4 = 1;
		test01.x4 = 2;
	}
}
