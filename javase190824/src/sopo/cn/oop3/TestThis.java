package sopo.cn.oop3;

public class TestThis {
	public TestThis geTestThis() {
		return TestThis.this;
	}
	
	public TestThis getTestThis() {
		return new TestThis();
	}
	
	public static void main(String[] args) {
		System.out.println();
		TestThis testThis = new TestThis();
		System.out.println(testThis.geTestThis());
		System.out.println(testThis.getTestThis());
	}
}
