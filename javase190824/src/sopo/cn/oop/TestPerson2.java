package sopo.cn.oop;

public class TestPerson2{
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.nameString = "thana";
		teacher.age = 39;
		teacher.salary = 99999;
		teacher.schoolString = "unknown";
		
		System.out.println(teacher.toString());
		teacher.eat("apple");
		teacher.sleep("for a while");
		teacher.teach("hk");
	}
}
