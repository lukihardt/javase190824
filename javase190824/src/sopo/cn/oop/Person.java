package sopo.cn.oop;

public class Person {
	String nameString;
	int age;
	char sex;
	int height;
	
	public void getInfo() {
		System.out.println("name is " + nameString + ", age is " + age + ", sex is " + sex + ", height is " + height);
	}
	
	public void sayHello() {
		System.out.println("hello everybody");
	}
	
	public Person(String nameString, int age, char sex, int height) {
		super();
		this.nameString = nameString;
		this.age = age;
		this.sex = sex;
		this.height = height;
	}

	public Person() {
		super();
	}
}
