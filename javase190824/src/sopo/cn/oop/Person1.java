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
		p.setFace("Ц��");
		System.out.println("����x��y��ֵ�ֱ���:" + x + "," + y);
		System.out.println("��������p��face��:" + p.face);
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
