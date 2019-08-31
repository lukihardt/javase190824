package sopo.cn.oop3;

public interface Usb {
	public void install();
	public void work();
}

class Print implements Usb{

	@Override
	public void install() {
		// TODO Auto-generated method stub
		System.out.println("安装打印驱动程序");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("打印一份文件");
	}
	
}