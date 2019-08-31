package sopo.cn.oop2;

public class TestMain {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("sopo.cn.oop2.Test");
		TestTest test = new TestTest();
		System.out.println("test.a:" + test.a + ", test.b:" +TestTest.b);
		
		final Test01 test01= new Test01();
		test01.x4 = 1;
	}
}

class TestTest {
	int a;
	static int b;
	{
		System.out.println("普通的初始化块");
		b = 11;
		a = 22;
	}
	
	static {
		System.out.println("静态的初始化块");
//		a = 11;
		b = 22;
	}
	
	public TestTest() {
		a = 55;
		b = 66;
		System.out.println("Test的构造容器");
	}
}
