package sopo.cn.oop2;

public class TestInit2 {
	public static void main(String[] args) {
		new InitDemo2();
		new InitDemo2();
		new InitDemo2();
		new InitDemo2();
		new InitDemo2();
	}
}

class InitDemo2 {
	static int a = 100;
	{
		System.out.println("������ͨ�ĳ�ʼ����");
	}
	static{
		System.out.println("���Ǿ�̬�ĳ�ʼ����");
	}
}
