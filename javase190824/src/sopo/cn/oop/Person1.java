package sopo.cn.oop;

class People1 {
	String face;

	void setFace(String s) {
		face = s;
	}
}

class C1 {
	void f(int x, double y, People p) {
		x = x + 1;
		y = y + 1;
		p.setFace("笑脸");
		System.out.println("参数x和y的值分别是:" + x + "," + y);
		System.out.println("参数对象p的face是:" + p.face);
	}
}

public class Person1 {
	static int value = 33;

	public static void main(String[] args) throws Exception {
		new Person1().printValue();
	}

	private void printValue() {
		int value = 3;
		System.out.println(value);
//		System.out.println(this.value);
	}
}
