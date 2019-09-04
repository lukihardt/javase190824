package sopo.cn.oop4;

import java.util.Arrays;

public class EnumDemo {
	public static void main(String[] args) {
		Day[] days2 = Day.values();
		System.out.println(Arrays.toString(days2));
		Day day1 = Day.valueOf("MONDAY");
		System.out.println(day1);

		Day[] days = new Day[] { Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY, Day.SATURDAY,
				Day.SUNDAY };
		for (int i = 0; i < days.length; i++) {
			System.out.println(days[i].ordinal());
		}
		for (int i = 0; i < days.length; i++) {
			System.out.println(days[i]);
		}

		System.out.println("=================================");

		System.out.println(days[0].compareTo(days[1]));
		System.out.println(days[0].compareTo(days[2]));
		System.out.println(days[6].compareTo(days[0]));

		System.out.println("=================================");

		Class<?> clazz = days[0].getDeclaringClass();
		System.out.println(clazz);

		System.out.println("=================================");

		System.out.println("days[0].name(): " + days[0].name());
		System.out.println("days[1].name(): " + days[1].name());

		System.out.println("=================================");

		System.out.println("days[0].toString(): " + days[0].toString());
		System.out.println("days[1].toString(): " + days[1].toString());
		
		System.out.println("=================================");
		
		Day d = Enum.valueOf(Day.class, days[0].name());
		Day d2 = Day.valueOf(Day.class, days[0].name());
		System.out.println(d);
		System.out.println(d2);
	}
}
