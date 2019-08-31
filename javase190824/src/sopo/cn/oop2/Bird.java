package sopo.cn.oop2;

public class Bird {
	private Animal animal;
	public Bird(Animal a) {
		animal = a;
	}
	
	public void breath() {
		animal.breath();
	}
	
	public void fly() {
		System.out.println("ÎÒÔÚ·É...");
	}
}
