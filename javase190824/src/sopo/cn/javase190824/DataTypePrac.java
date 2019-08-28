package sopo.cn.javase190824;

public class DataTypePrac {

	public static void main(String[] args) {
		//声明字符串变量
		String str = "interest string";
		System.out.println(str);
		str = "new string";
		System.out.println(str);
		char[] chs = {0, 1, 2};
		System.out.println(chs);
		System.out.println("------------------------");
		int i = 10;
		long l = i;
		System.out.println(l);
		
		PreClass prc = new PreClass();
		System.out.println(prc instanceof AfterClass);
		System.out.println("------------------------");
		System.out.println("短路示例:");
		if(!( 1 > 2 && ++i > 1)) {
			System.out.println("i:" + i);
		}
		System.out.println("------------------------");
		int fui = -18;
		System.out.println(fui >> 10);
		System.out.println("------------------------");
		System.out.println(fui);
		System.out.println(~fui);
	}
}
