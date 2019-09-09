package sopo.cn.oop4;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.temporal.ChronoUnit;
import java.util.TimeZone;

import org.junit.jupiter.api.Test;

public class DateDemo5 {
	@Test
	public void test() {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);

		System.out.println(localDate.getYear());
		System.out.println(localDate.getMonthValue());
		System.out.println(localDate.getDayOfMonth());
		System.out.println(localDate.getDayOfYear());
		System.out.println(localDate.getDayOfWeek());

		System.out.println("===============");

		LocalDate newdate = LocalDate.of(2019, 9, 6);
		System.out.println(newdate.equals(LocalDate.now()));

		System.out.println("===============");

		// 判断今天是不是给定的生日日期
		LocalDate localDate2 = LocalDate.of(2018, 2, 18);
		MonthDay birthDay = MonthDay.of(localDate2.getMonthValue(), localDate2.getDayOfMonth());
		LocalDate localDate3 = LocalDate.now();
		if (birthDay.equals(MonthDay.from(localDate3))) {
			System.out.println("happy birthday");
		}

		//LocalTime Demo
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		System.out.println(" 两小时以后" + localTime.plusHours(2));
		
		//一个单元时间以后
		LocalDate localDate4 = LocalDate.now();
		System.out.println(localDate4.plus(1, ChronoUnit.YEARS));
		System.out.println(localDate4.plus(1, ChronoUnit.MONTHS));
		System.out.println(localDate4.plus(1, ChronoUnit.DAYS));
		//一个单元时间以前
		LocalDate localDate5 = LocalDate.now();
		System.out.println(localDate5.minus(1, ChronoUnit.YEARS));
		System.out.println(localDate5.minus(1, ChronoUnit.MONTHS));
		System.out.println(localDate5.minus(1, ChronoUnit.DAYS));
		
		System.out.println("===============");
		//Clock
		Clock clock = Clock.systemUTC();
		System.out.println(clock.millis());
		System.out.println(System.currentTimeMillis());
		
		System.out.println(Clock.systemDefaultZone());
		System.out.println(TimeZone.getDefault());
		
		//before, after
		LocalDate localDate6 = LocalDate.now();
		LocalDate localDate7 = localDate6.plus(1, ChronoUnit.DAYS);
		System.out.println(localDate6.isAfter(localDate7));
		System.out.println(localDate6.isBefore(localDate7));
	}
}
