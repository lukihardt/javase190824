package sopo.cn.oop;

import java.sql.Date;

public class MainDemo {
	public static void main(String args[]) {
		int m = 100;
		double n = 100.88;
		People zhang = new People();
		zhang.setFace("�����������");
		C a = new C();
		a.f(m, n, zhang);
		System.out.println("main������m��n��ֵ��Ȼ�ֱ���:" + m + "," + n);
		System.out.println("main�����ж���zhang��face��:" + zhang.face);
		
		System.out.println();
		System.out.println("======================================");
		System.out.println();
		
		//��������
		Student[] students = new Student[5];
		students[0] = new Student("ʯ��", 19);
		students[1] = new Student("ФԶ", 18);
		students[2] = new Student("��һ��", 17);
		students[3] = new Student("����", 16);
		students[4] = new Student("����", 15);
		
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
