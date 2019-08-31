package sopo.cn.oop3;

public abstract class Animal {
	private int a;
	public abstract void bark();
	
	public void say() {
		System.out.println("i'm the common method of the Animal.Class, 此抽象类中的私有成员变量a=" + a);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}
