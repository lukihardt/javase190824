package sopo.cn.oop;

public class Student {
	public String display() {
		return "Student [nameString=" + nameString + ", age=" + age + "]";
	}

	String nameString;
	int age;

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(String nameString, int age) {
		super();
		this.nameString = nameString;
		this.age = age;
	}

	public Student() {
		super();
	}

}
