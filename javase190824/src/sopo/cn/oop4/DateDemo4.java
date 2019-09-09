package sopo.cn.oop4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo4 {

	public static void main(String[] args) {
		dayOfWeek("2018-2-18");

		getDistanceDay(40);

		getGapDays("1993/9/5", "2019/9/5");

		System.out.println("==================");

		// 获取当前日期是周几
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
	}

	/**
	 * 给出任意日期,返回星期几
	 * 
	 * @author Administrator
	 *
	 */
	public static void dayOfWeek(String date) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = Calendar.getInstance();
		try {
			Date d = sdf.parse(date);
			calendar.setTime(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int weekday = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("星期" + ((weekday - 1) == 0 ? "天" : (weekday - 1)));
	}

	/**
	 * 显示day天以后的日期
	 * 
	 * @param day
	 */
	public static void getDistanceDay(int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, day);
		// 获取day以后的日期
		Date date = calendar.getTime();
		// 格式化
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(sdf.format(date));
		;
	}

	/**
	 * 获得给定两个日期相差的天数
	 */
	public static long getGapDays(String date1, String date2) {
		String[] d1 = date1.split("/");
		String d2[] = date2.split("/");

		Calendar calendar1 = Calendar.getInstance();
		calendar1.set(Integer.parseInt(d1[0]), Integer.parseInt(d1[1]), Integer.parseInt(d1[2]), 0, 0, 0);

		Calendar calendar2 = Calendar.getInstance();
		calendar2.set(Integer.parseInt(d2[0]), Integer.parseInt(d2[1]), Integer.parseInt(d2[2]), 0, 0, 0);

		long gapmili = calendar2.getTimeInMillis() - calendar1.getTimeInMillis();
//		System.out.println(gapmili);
		long day = Math.abs(gapmili) / 1000 / 60 / 60 / 24;
		System.out.println("相差天数: " + day);
		return 0;
	}
}
