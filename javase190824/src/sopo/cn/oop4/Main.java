package sopo.cn.oop4;

import org.junit.jupiter.api.Test;

public class Main {
	@Test
	public void main() {
		// TODO Auto-generated constructor stub
		String str1 = "hello world";
		String str2 = new String("hello world");
		String str3 = "hello world";
		String str4 = new String("hello world");

		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str2 == str4);
		
		String string = "";
		for (int i = 0; i < 10; i++) {
			string += "HelloWrold";
		}
		System.out.println(string);
		
		StringBuilder stringBuilder = new StringBuilder();
		for( int i = 0; i < 1000; i++) {
			stringBuilder.append("StringBuilder");
		}
		System.out.println(stringBuilder);
		
		StringBuffer stringBuffer = new StringBuffer();
		for( int i = 0; i < 1000; i++) {
			stringBuffer.append("Buff!");
		}
		System.out.println(stringBuffer);
	}
}
