package sopo.cn.oop;

public class MyDate {
	int year;
	int month;
	int day;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void printDate() {
		System.out.println(year + "-" + month + "-" + day);
	}

}
