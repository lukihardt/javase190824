package sopo.cn.oop3;

public class Izual extends Robot{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("i run on the net");
	}

	@Override
	public void compute() {
		// TODO Auto-generated method stub
		System.out.println("i compute ultrafast");
	}

	@Override
	public void chat() {
		// TODO Auto-generated method stub
		System.out.println("just a method,i can speak all the language");
	}
	
	public Izual(){
		run();
		compute();
		chat();
	}

}
