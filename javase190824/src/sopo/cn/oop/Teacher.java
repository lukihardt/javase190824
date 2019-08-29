package sopo.cn.oop;

public class Teacher extends Person2{
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
