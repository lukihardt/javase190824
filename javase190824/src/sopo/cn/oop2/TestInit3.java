package sopo.cn.oop2;

public class TestInit3 {
	public static void main(String[] args) {
		new InitDemo3();
	}
}

class InitDemo3{
	{
		System.out.println("我是普通的初始化块1");
	}
	static {
		System.out.println("我是静态的初始化块1");
	}
	{
		System.out.println("我是普通的初始化块2");
	}
	{
		System.out.println("我是普通的初始化块3");
	}
	static {
		System.out.println("我是静态的初始化块2");
	}
	static {
		System.out.println("我是静态的初始化块3");
	}
}
