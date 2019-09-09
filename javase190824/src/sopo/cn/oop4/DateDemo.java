package sopo.cn.oop4;

import java.util.Date;

public class DateDemo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());
		Date date2 = new Date(2015-1900, 2-1, 18);
		System.out.println(date2);
		System.out.println(date2.getYear() + 1900);
		System.out.println(date2.getMonth() + 1);
		
		System.out.println("====================");
		while (true) {
			System.out.println(new Date());
		}
	}
}
