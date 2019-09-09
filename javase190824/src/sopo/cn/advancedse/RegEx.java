package sopo.cn.advancedse;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
	public static void main(String[] args) {
		String string = "example@foxmail.com";
		String regEx = "[a-zA-Z_]{1,}[0-9]{0,}@(([a-zA-Z0-9]-*){1,}\\.){1,3}[a-zA-Z]{1,}";
		Pattern pattern = Pattern.compile(regEx);
		Matcher matcher = pattern.matcher(string);
		boolean res = matcher.matches();
		System.out.println(res);
	}
}
