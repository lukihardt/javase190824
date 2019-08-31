package sopo.cn.oop3;

public class Test01 {
	public static void main(String[] args) {
		new Izual();
		System.out.println("================");
		Dog dog = new Dog();
		dog.setA(11);
		dog.say();
		dog.bark();
		Usb usb = new Usb() {
			
			@Override
			public void work() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void install() {
				// TODO Auto-generated method stub
				
			}
		};
		
		Computer computer = new Computer();
		computer.plugin(usb);
	}
}
