package sopo.cn.oop2;

public class TestInit5 {
	public static void main(String[] args) {
		new InitDemo5();
	}
}

class Grand{
	public Grand() {
		System.out.println("我是爷爷类的构造器");
	}
	
	String a = fun("爷爷类的普通属性的初始化");
	
	public static String fun(String info) {
		System.out.println(info);
		return info;
	}
	
	static {
		System.out.println("爷爷类的静态代码块");
	}
	{
		System.out.println("爷爷类的普通代码块");
	}
	static String d = fun("爷爷类的静态属性初始化");
}

class Father extends Grand{
	public Father() {
		System.out.println("我是父类的构造器");
	}
	
	String a = method("父类的普通属性的初始化");
	
	public static String method(String info) {
		System.out.println(info);
		return info;
	}
	
	static {
		System.out.println("父类的静态代码块");
	}
	
	{
		System.out.println("父类的普通代码块");
	}
	
	static String d = method("父类的静态属性的初始化");
}

class InitDemo5 extends Father{
	public InitDemo5() {
		System.out.println("我是子类的构造器");
	}
	
	String a = msg("子类的普通属性的初始化");
	
	public static String msg(String info) {
		System.out.println(info);
		return info;
	}
	
	static {
		System.out.println("子类的静态代码块");
	}
	
	{
		System.out.println("子类的普通代码块");
	}
	
	static String d = msg("子类的静态属性的初始化"); 
}


















