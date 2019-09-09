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

		// ��ȡ��ǰ�������ܼ�
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
	}

	/**
	 * ������������,�������ڼ�
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
		System.out.println("����" + ((weekday - 1) == 0 ? "��" : (weekday - 1)));
	}

	/**
	 * ��ʾday���Ժ������
	 * 
	 * @param day
	 */
	public static void getDistanceDay(int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, day);
		// ��ȡday�Ժ������
		Date date = calendar.getTime();
		// ��ʽ��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(sdf.format(date));
		;
	}

	/**
	 * ��ø�������������������
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
		System.out.println("�������: " + day);
		return 0;
	}
}
