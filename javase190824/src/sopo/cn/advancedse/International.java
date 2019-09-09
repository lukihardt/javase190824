package sopo.cn.advancedse;

import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.ResourceBundle;

public class International {
	public static void main(String[] args) {
		Locale localeEn = new Locale( "en", "US");
		Locale localeZh = new Locale( "zh", "CN");
		ResourceBundle rbEn = ResourceBundle.getBundle("sopo.cn.advancedse.content", localeEn);
		ResourceBundle rbZh = ResourceBundle.getBundle("sopo.cn.advancedse.content", localeZh);
		System.out.println("us-US: " + rbEn.getString("helloWorld"));
		System.out.println("us-US: " + String.format(rbEn.getString("time"), "08:00"));
		System.out.println("zh-CN: " + rbZh.getString("helloWorld"));
		System.out.println("zh-CN: " + String.format(rbZh.getString("time"), "08:00"));
		
		System.out.println("============");
		Locale locale = new Locale( "zh", "CN");
		NumberFormat format = NumberFormat.getCurrencyInstance(locale);
		double num = 123456.78;
		System.out.println("123456.78 Format:");
		System.out.println(String.format("%s : %s", locale.toString(), format.format(num)));
		
		System.out.println("============");
		Date date = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, new Locale( "en", "US"));
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM, new Locale( "zh", "CN"));
		System.out.println(df.format(date));
		System.out.println(df2.format(date));
		
		System.out.println("============");
		String pattern1 = " {0}你好, 你于{1}消费{2}元";
		String pattern2 = " At{1, time, short} On {1, date, long}, {0} paid {2, number, currency}.";
		Object[] params = {"Jack", new GregorianCalendar().getTime(), 8888};
		String message1 = MessageFormat.format( pattern1, params);
		MessageFormat mf = new MessageFormat( pattern2, Locale.US);
		String message2 = mf.format(params);
		System.out.println(message1);
		System.out.println(message2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}