package sopo.cn.oop;

class C {
	void f(int x, double y, People p) {
		x = x + 1;
		y = y + 1;
		p.setFace("Ц��");
		System.out.println("����x��y��ֵ�ֱ���:" + x + "," + y);
		System.out.println("��������p��face��:" + p.face);
	}
}
