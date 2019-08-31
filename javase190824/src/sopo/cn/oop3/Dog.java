package sopo.cn.oop3;

public class Dog extends Animal {

	@Override
	public void bark() {
		System.out.println("汪汪~汪汪~");
		System.out.println("我是子类，不能直接调用父类的私有变量a");
		System.out.println("我是子类，只能通过super()方法调用父类的私有变量, a:" + super.getA());
	}

}
