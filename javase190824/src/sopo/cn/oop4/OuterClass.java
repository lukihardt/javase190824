package sopo.cn.oop4;

public class OuterClass {
	public InnerClass getInnerClass(final int num, final String str2) {
		return new InnerClass(){
			int number = num + 3;
			public int getNum() {
				return number;
			}
			public String getString() {
				return str2;
			}
		};
	}
}

interface InnerClass{
	public int getNum();
	public String getString();
}
