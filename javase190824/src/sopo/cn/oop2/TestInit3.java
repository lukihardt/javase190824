package sopo.cn.oop2;

public class TestInit3 {
	public static void main(String[] args) {
		new InitDemo3();
	}
}

class InitDemo3{
	{
		System.out.println("������ͨ�ĳ�ʼ����1");
	}
	static {
		System.out.println("���Ǿ�̬�ĳ�ʼ����1");
	}
	{
		System.out.println("������ͨ�ĳ�ʼ����2");
	}
	{
		System.out.println("������ͨ�ĳ�ʼ����3");
	}
	static {
		System.out.println("���Ǿ�̬�ĳ�ʼ����2");
	}
	static {
		System.out.println("���Ǿ�̬�ĳ�ʼ����3");
	}
}
