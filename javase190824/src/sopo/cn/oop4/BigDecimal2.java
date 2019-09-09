package sopo.cn.oop4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimal2 {
	public static void main(String[] args) {
		BigDecimal b1 = new BigDecimal("4.5");
		BigDecimal b2 = new BigDecimal("1.5");
		
		System.out.println("a + b: " + b1.add(b2));
		System.out.println("a - b: " + b1.subtract(b2));
		System.out.println("a * b: " + b1.multiply(b2));
		System.out.println("a / b: " + b1.divide(b2));
		
		BigDecimal b3 = new BigDecimal("10");
		BigDecimal b4 = new BigDecimal("3");
		RoundingMode roundingMode = RoundingMode.HALF_UP;
		System.out.println(b3.divide(b4, 3, roundingMode));
		
		System.out.println("==================");
		BigDecimal b5 = new BigDecimal("4.5555");
		System.out.println(b5.setScale(3, RoundingMode.HALF_DOWN));
	}
}
