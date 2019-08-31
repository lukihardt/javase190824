package sopo.cn.oop;

public class Teacher extends Person2{
	
	public Teacher() {
		super();
	}

	public Teacher(String nameString, int age) {
		super(nameString, age);
		// TODO Auto-generated constructor stub
	}
	
	int salary;
	String schoolString;
	
	void teach(String t) {
		System.out.println("Teach " + t);
	}

	@Override
	public String toString() {
		return "Teacher [salary=" + salary + ", schoolString=" + schoolString + ", nameString=" + nameString + ", age="
				+ age + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
