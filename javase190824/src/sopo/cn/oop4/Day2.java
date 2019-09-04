package sopo.cn.oop4;

public enum Day2 {
	MONDAY("星期一", 1), TUESDAY("星期二", 2), WEDNESDAY("星期三", 3),
	THRUSDAY("星期四", 4),FRIDAY("星期五",5),SATURDAY("星期六",6),SUNDAY("星期七",7);

	private String desc;
	private Integer code;

	public String getDesc() {
		return desc;
	}

	public Integer getCode() {
		return code;
	}

	private Day2(String desc, int i) {
		this.desc = desc;
		code = i;
	}
}
