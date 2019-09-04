package sopo.cn.oop3;

public class OuterClass {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	
	public void display() {
		System.out.println("this is OuterClass");
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static void test(){
		
	}
	
	class InnerClass{
		public InnerClass() {
			name = "chenssy";
			age = 23;
		}
		
		public void display() {
			System.out.println("name: " + getName() + "; age: " + getAge());
		}
		
		public OuterClass getOuterClass() {
			return OuterClass.this;
		}
		
//		public static void test(){
//			
//		}
	}
}
