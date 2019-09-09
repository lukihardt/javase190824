package sopo.cn.oop4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.Test;

public class DateDemo2 {
	@Test
	public void test() {
//		System.out.println(new Date().getDate());
//		System.out.println(new Date().getDay());
		Calendar calendar = Calendar.getInstance();
		calendar.set(2015, 2 - 1, 18);
		System.out.println(calendar);
		calendar.set(Calendar.DATE, 5);
		System.out.println(calendar);
		calendar.set(Calendar.YEAR, 1993);
		System.out.println(calendar);

		System.out.println("=================");
		Calendar calendar2 = Calendar.getInstance();
		calendar2.set(1995, 1 - 1, 1);
		System.out.println(calendar2);
		calendar2.add(Calendar.DATE, -10);
		System.out.println(calendar2);
		System.out.println("###########");
		Calendar calendar3 = Calendar.getInstance();
		calendar3.set(1995, 12 - 1, 27);
		calendar3.add(Calendar.DATE, 10);
		System.out.println(calendar3);
		int year = calendar3.get(Calendar.YEAR);
		// 获得月份
		int month = calendar3.get(Calendar.MONTH) + 1;
		// 获得日期
		int date = calendar3.get(Calendar.DAY_OF_MONTH);
		// 获得小时
		int hour = calendar3.get(Calendar.HOUR_OF_DAY);
		// 获得分钟
		int minute = calendar3.get(Calendar.MINUTE);
		// 获得秒
		int second = calendar3.get(Calendar.SECOND);

		System.out.println("###########");
		System.out.println("" + year + month + date + hour + minute + second);
		
		System.out.println("=================");
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc);
		System.out.println(gc.isLeapYear(1800));
		System.out.println("=================");
		SimpleDateFormat sf = new SimpleDateFormat();
		System.out.println(sf.format(new Date()));
	}
}
