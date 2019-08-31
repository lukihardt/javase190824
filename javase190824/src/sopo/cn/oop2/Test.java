package sopo.cn.oop2;

public class Test {
	public static void main(String[] args) {
		MyClass myClass1 = new MyClass();
		MyClass myClass2 = new MyClass();
		System.out.println(myClass1.i);
		System.out.println(MyClass.i2);
		
		System.out.println(myClass2.i);
		System.out.println(MyClass.i2);
		
//		myClass1.i = 123;
	}
}
