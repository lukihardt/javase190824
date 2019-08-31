package sopo.cn.oop2;

public class SingletonLazy1{
	private static SingletonLazy1 singletonLazy1;
	private SingletonLazy1() {
	}
	
	public static SingletonLazy1 getInstance() {
		if (singletonLazy1 == null) {
			singletonLazy1 = new SingletonLazy1();
		}
		return singletonLazy1;
	}
}
