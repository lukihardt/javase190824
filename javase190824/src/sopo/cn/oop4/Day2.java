package sopo.cn.oop4;

public enum Day2 {
	MONDAY("����һ", 1), TUESDAY("���ڶ�", 2), WEDNESDAY("������", 3),
	THRUSDAY("������", 4),FRIDAY("������",5),SATURDAY("������",6),SUNDAY("������",7);

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
