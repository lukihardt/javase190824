package sopo.cn.oop2;

public class TestSub {
	public static void main(String[] args) {
		Base base = new Sub();
		base.say();
		
		if(base instanceof Sub) {
			((Sub) base).read();
		}
	}
}
