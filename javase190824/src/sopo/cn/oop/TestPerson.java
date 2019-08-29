package sopo.cn.oop;

public class TestPerson {
	public static void main(String[] args) {
		Person zhangsanPerson = new Person();
		zhangsanPerson.nameString = "zhangsan";
		zhangsanPerson.age = 28;
		zhangsanPerson.sex = 'M';
		zhangsanPerson.height = 185;
		zhangsanPerson.getInfo();
		zhangsanPerson.sayHello();
	}
}
