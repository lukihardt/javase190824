package sopo.cn.oop4;

import java.util.Scanner;

public class ScannerTest2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("����������: ");
		
		if (s.hasNext()) {
			String string = s.nextLine();
			System.out.println("���������Ϊ: ");
			System.out.println(string);
		}
		
		s.close();
	}
}
