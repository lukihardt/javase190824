package sopo.cn.oop3;

public class Phone implements Usb{
	public void install() {
		System.out.println("安装手机驱动程序");
	}
	public void work() {
		System.out.println("从电脑拷贝数据到手机");
	}
}
