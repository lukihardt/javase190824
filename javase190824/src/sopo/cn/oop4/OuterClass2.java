package sopo.cn.oop4;

public class OuterClass2 {
//	private String sex;
	public static String name = "chenssy";

	static class InnerClass1 {
		public static String _name = "chenssy_static";

		public void prin() {
			System.out.println("Outer Class Name: " + name);
		}
	}

	public class InnerClass2 {
		public String _name2 = "chenssy_inner_name";

		public void prin2() {
			System.out.println("Outer Class Name: " + name + " at " + "_name2: " + _name2);
		}
	}

	/**
	 * 外围类方法
	 */
	public void display() {
		System.out.println("InnerClass1._name: " + InnerClass1._name);
		new InnerClass1().prin();

		OuterClass2.InnerClass2 outInnerClass2 = new OuterClass2().new InnerClass2();
		System.out.println("outInnerClass2._name2: " + outInnerClass2._name2);
		outInnerClass2.prin2();
	}
	
	public static void main(String[] args) {
		OuterClass2 outerClass2 = new OuterClass2();
		outerClass2.display();
	}
}
