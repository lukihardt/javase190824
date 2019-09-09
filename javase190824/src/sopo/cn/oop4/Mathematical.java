package sopo.cn.oop4;

import java.math.BigDecimal;

public class Mathematical {
	public static void main(String[] args) {
		System.out.println(Math.E);
		System.out.println(Math.PI);

		System.out.println(Math.ceil(Math.PI));
		System.out.println(Math.floor(Math.PI));
		System.out.println(Math.round(Math.PI));

		System.out.println("==================");
		System.out.println(Math.max(3.14, 0.618));
		System.out.println(Math.min(3.14, 0.618));

		System.out.println("==================");
		System.out.println(Math.pow(2, 30));

		System.out.println(Math.random());

		System.out.println("==================");
		System.out.println("==================");
		System.out.println(0.2 + 0.1);
		System.out.println(0.3 - 0.1);
		System.out.println(0.2 * 0.1);
		System.out.println(0.3 / 0.1);

		BigDecimal bigI = new BigDecimal(2);
		BigDecimal bigD = new BigDecimal(2.3);
		BigDecimal bigS = new BigDecimal("2.3");
		System.out.println(bigI);
		System.out.println(bigD);
		System.out.println(bigS);

		System.out.println("==================");
		System.out.println("==================");
		BigDecimal bigDecimal1 = BigDecimal.valueOf(2.3);
		BigDecimal bigDecimal2 = new BigDecimal(Double.toString(2.3));
		System.out.println("bigDecimal1: " + bigDecimal1);
		System.out.println("bigDecimal2: " + bigDecimal2);
	}
}