package sopo.cn.oop2;

public class TestInit4 {
	public static void main(String[] args) {
		new InitDemo4();
	}
}

class InitDemo4{
	public InitDemo4() {
		System.out.println("我是构造器");
	}
	
	String a = msg("普通属性初始化1");
	
	public static String msg(String string) {
		System.out.println(string);
		return string;
	}
	
	static {
		System.out.println("静态初始化块2");
	}
	
	static String b = msg("静态属性初始化1");
	
	{
		System.out.println("我是普通初始化块1");
	}
	
	String c = msg("普通属性初始化2");
	
	{
		System.out.println("我是普通初始化块2");
	}
	
	static String d = msg("静态属性初始化2");
	
	static{
		System.out.println("静态初始化块1");
	}
}
