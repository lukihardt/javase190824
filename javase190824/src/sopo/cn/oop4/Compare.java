package sopo.cn.oop4;

import java.util.Arrays;
import java.util.Objects;

import org.junit.jupiter.api.Test;

public class Compare {
//	char value;
//	String aString = new String();
//	char[] c = {'a','b','c','d'};

	String compareString = "abcd";

	char[] ch = {'2','1','3','9','5'};

	@Test
	public void main() {
		System.out.println(compareString.compareTo("abcd"));
		Arrays.sort(ch);
		System.out.println(ch);
		
		System.out.println("=================");
		System.out.println("a".hashCode());
		System.out.println(Objects.hashCode("a"));
		System.out.println(Objects.hash("a"));
	}

//	@Test
//	void say() {
//		System.out.println(c.length);
//	}
}
