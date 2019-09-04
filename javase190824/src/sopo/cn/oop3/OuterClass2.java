package sopo.cn.oop3;

public class OuterClass2 {
	private String string;
	
	public void display() {
		System.out.println("OuterClass...");
	}
	
	public class InnerClass{
		public void innerDisplay() {
			string = "andy";
			System.out.println(string);
			display();
		}
	}
	
	public InnerClass getInnerClass() {
		return new InnerClass();
	}
	
	public static void main(String[] args) {
		OuterClass2 outerClass2 = new OuterClass2();
		OuterClass2.InnerClass o2InnerClass = outerClass2.getInnerClass();
		o2InnerClass.innerDisplay();
	}
}
