package sopo.cn.oop3;

public class Dog extends Animal {

	@Override
	public void bark() {
		System.out.println("����~����~");
		System.out.println("�������࣬����ֱ�ӵ��ø����˽�б���a");
		System.out.println("�������ֻ࣬��ͨ��super()�������ø����˽�б���, a:" + super.getA());
	}

}
