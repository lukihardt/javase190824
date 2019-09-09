package sopo.cn.oop4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo3 {
	public static void main(String[] args) throws ParseException {
		Calendar calendar = Calendar.getInstance();
		long t1 = calendar.getTimeInMillis();
		System.out.println(t1);
		
		calendar.setTimeInMillis(t1);
		System.out.println(calendar);
		
		System.out.println("===   ============");
		Calendar calendar2 = Calendar.getInstance();
		Date d = calendar2.getTime();
		System.out.println(d);
		System.out.println("===============");
		Calendar calendar3 = Calendar.getInstance();
		Date d1 = new Date();
		calendar3.setTime(d1);
		System.out.println(calendar3);
		
		System.out.println("===============");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String string = "2019-1-9";
		Date date = sdf.parse(string);
		System.out.println(date);
		
		System.out.println(sdf.format(System.currentTimeMillis()));
		System.out.println(sdf.format(new Date()));
	}
}
