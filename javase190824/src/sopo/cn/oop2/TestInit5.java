package sopo.cn.oop2;

public class TestInit5 {
	public static void main(String[] args) {
		new InitDemo5();
	}
}

class Grand{
	public Grand() {
		System.out.println("����үү��Ĺ�����");
	}
	
	String a = fun("үү�����ͨ���Եĳ�ʼ��");
	
	public static String fun(String info) {
		System.out.println(info);
		return info;
	}
	
	static {
		System.out.println("үү��ľ�̬�����");
	}
	{
		System.out.println("үү�����ͨ�����");
	}
	static String d = fun("үү��ľ�̬���Գ�ʼ��");
}

class Father extends Grand{
	public Father() {
		System.out.println("���Ǹ���Ĺ�����");
	}
	
	String a = method("�������ͨ���Եĳ�ʼ��");
	
	public static String method(String info) {
		System.out.println(info);
		return info;
	}
	
	static {
		System.out.println("����ľ�̬�����");
	}
	
	{
		System.out.println("�������ͨ�����");
	}
	
	static String d = method("����ľ�̬���Եĳ�ʼ��");
}

class InitDemo5 extends Father{
	public InitDemo5() {
		System.out.println("��������Ĺ�����");
	}
	
	String a = msg("�������ͨ���Եĳ�ʼ��");
	
	public static String msg(String info) {
		System.out.println(info);
		return info;
	}
	
	static {
		System.out.println("����ľ�̬�����");
	}
	
	{
		System.out.println("�������ͨ�����");
	}
	
	static String d = msg("����ľ�̬���Եĳ�ʼ��"); 
}


















