package sopo.cn.oop2;

public class TestInit4 {
	public static void main(String[] args) {
		new InitDemo4();
	}
}

class InitDemo4{
	public InitDemo4() {
		System.out.println("���ǹ�����");
	}
	
	String a = msg("��ͨ���Գ�ʼ��1");
	
	public static String msg(String string) {
		System.out.println(string);
		return string;
	}
	
	static {
		System.out.println("��̬��ʼ����2");
	}
	
	static String b = msg("��̬���Գ�ʼ��1");
	
	{
		System.out.println("������ͨ��ʼ����1");
	}
	
	String c = msg("��ͨ���Գ�ʼ��2");
	
	{
		System.out.println("������ͨ��ʼ����2");
	}
	
	static String d = msg("��̬���Գ�ʼ��2");
	
	static{
		System.out.println("��̬��ʼ����1");
	}
}
