package sopo.cn.oop;

class C {
	void f(int x, double y, People p) {
		x = x + 1;
		y = y + 1;
		p.setFace("笑脸");
		System.out.println("参数x和y的值分别是:" + x + "," + y);
		System.out.println("参数对象p的face是:" + p.face);
	}
}
