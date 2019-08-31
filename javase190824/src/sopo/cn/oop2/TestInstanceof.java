package sopo.cn.oop2;

public class TestInstanceof {
	public static void main(String[] args) {
		People people = new People();
		Xiaoming xiaoming = new Xiaoming();
		System.out.println(people instanceof People);
		System.out.println(people instanceof Xiaoming);
		System.out.println(xiaoming instanceof People);
		System.out.println(xiaoming instanceof Xiaoming);
	}
}
