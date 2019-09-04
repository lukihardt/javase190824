package sopo.cn.oop4;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		System.out.println("请输入数字(输入非数字退出): ");
		Scanner scanner = new Scanner(System.in);
		
		double d, sum = 0;
		int i = 0;
		
		while(scanner.hasNextDouble()) {
			d = scanner.nextDouble();
			sum += d;
			i++;
		}
		
		System.out.println("sum: " + sum);
		System.out.println("average: " + sum/i);
		
		scanner.close();
	}
}
