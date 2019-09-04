package sopo.cn.oop4;

import java.util.Scanner;

public class ScannerTest2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入数据: ");
		
		if (s.hasNext()) {
			String string = s.nextLine();
			System.out.println("输入的数据为: ");
			System.out.println(string);
		}
		
		s.close();
	}
}
