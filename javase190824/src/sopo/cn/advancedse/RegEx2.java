package sopo.cn.advancedse;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx2 {
	public static void main(String[] args) {
		String string = "baike.xsoftlab.net";
		String RegEx = "baike*";
		Pattern pattern = Pattern.compile(RegEx);
		Matcher matcher = pattern.matcher(string);
		boolean res = matcher.find();
		System.out.println(res);
	}
}
