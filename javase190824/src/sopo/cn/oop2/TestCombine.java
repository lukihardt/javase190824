package sopo.cn.oop2;

public class TestCombine {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Bird bird = new Bird(animal);
		bird.breath();
		bird.fly();
	}
}
