package sopo.cn.oop;

import java.sql.Date;

public class MainDemo {
	public static void main(String args[]) {
		int m = 100;
		double n = 100.88;
		People zhang = new People();
		zhang.setFace("很严肃的样子");
		C a = new C();
		a.f(m, n, zhang);
		System.out.println("main方法中m和n的值仍然分别是:" + m + "," + n);
		System.out.println("main方法中对象zhang的face是:" + zhang.face);
		
		System.out.println();
		System.out.println("======================================");
		System.out.println();
		
		//对象数组
		Student[] students = new Student[5];
		students[0] = new Student("石磊", 19);
		students[1] = new Student("肖远", 18);
		students[2] = new Student("胡一飞", 17);
		students[3] = new Student("张扬", 16);
		students[4] = new Student("杨天", 15);
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].display());;
		}
		
		Date date = Date.valueOf("2019-08-29");
		System.out.println(date);
		
		System.out.println();
		System.out.println("======================================");
		System.out.println();
		
		P p = new P();
		p.setId("999");
		p.setAge(20);
		p.setAddressString("cn.sd");
		p.setCarBandString("bmw");
		p.setOccupyString("ali");
		p.setTelString("110");
		System.out.println(p.toString());
		
	}
}
