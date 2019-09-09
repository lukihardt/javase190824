package sopo.cn.oop4;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import org.junit.jupiter.api.Test;

public class DateDemo6 {
	@Test
	public void test() {
		ZonedDateTime adtUTC = ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("UTC"));
		System.out.println(adtUTC);

		LocalDateTime ldt = adtUTC.toLocalDateTime();

		ZonedDateTime adtSh = ZonedDateTime.of(ldt, ZoneId.of(ZoneId.SHORT_IDS.get("CTT")));
		System.out.println(adtSh.plus(8, ChronoUnit.HOURS).toLocalDateTime());

		// YearMonth
		YearMonth yearMonth = YearMonth.now();
		System.out.println(yearMonth.lengthOfMonth());

		YearMonth yearMonth2 = YearMonth.of(2000, 2);
		System.out.println(yearMonth2.lengthOfMonth());

		// isLeapYear
		LocalDate localDate = LocalDate.of(2000, 1, 1);
		System.out.println(localDate.isLeapYear());

		System.out.println("===================");

		// Period
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2019, 2, 5);
		Period period = Period.between(date1, date2);
		System.out.println(period.getMonths());

		System.out.println("===================");

		// 验证了between功能不太完善
		/*
		 * 注意：在后期使用Period.between（）方法来获取，相差天数、相差月数的时候，
		 * 发现只能计算同月的天数、同年的月数，不能计算隔月的天数以及隔年的月数！！！相当的坑
		 */
		LocalDate localDateStart = LocalDate.of(2018, 2, 28);
		LocalDate localDateEnd = LocalDate.of(2018, 4, 2);
		Period period2 = Period.between(localDateStart, localDateEnd);
		long years = period2.getYears();
		long months = period2.getMonths();
		long days = period2.getDays();
		System.out.println("year=" + years + ",month=" + months + ",days=" + days);

		System.out.println("===================");
		Instant instant = Instant.now();
		System.out.println(instant);

		Date date = Date.from(instant);
		System.out.println(date);

		Instant instant2 = new Date().toInstant();
		System.out.println(instant2);

		System.out.println("===================");

		// LocateDate.parse
		String string = "20190504";
		LocalDate localDate2 = LocalDate.parse(string, DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(localDate2);

		//Attention:模式中HH必须大写, 字符串中空位数必须以零占位, 此例中不能写单个数字
		String string2 = "2019/2/1 5:02:18";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/M/d H:mm:ss");
		LocalDateTime localDate3 = LocalDateTime.parse(string2, dtf);
		System.out.println(localDate3);

		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime ldt2 = LocalDateTime.parse("2017-09-28 17:07:05", df);
		System.out.println("String类型的时间转成LocalDateTime：" + ldt2);
	}
}
