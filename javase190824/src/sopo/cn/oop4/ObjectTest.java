package sopo.cn.oop4;

import java.util.Objects;

public class ObjectTest implements Cloneable{
	String aString = "textString";
	public static void main(String[] args) {
//		Object o1 = new Object();
//		Object o2 = o1.clone();
		ObjectTest o1 = new ObjectTest();
		System.out.println(o1);
		try {
			ObjectTest clone = (ObjectTest) o1.clone();
			System.out.println(clone);
			System.out.println("==========");
			System.out.println(o1.aString == clone.aString);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// System.out.println(o1)��ʵ���ǵ�����toString����
		System.out.println(o1.toString());
		
		System.out.println("=========================");
		System.out.println(Objects.toString(new Key("a")));
		
//		Key key = null;
//		System.out.println(Objects.requireNonNull(key, "�����Ϣ��"));
	}
}
