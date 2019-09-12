package sopo.cn.advancedse;

public class SimpleGenericTest {
	public static void main(String[] args) {
		SimpleGeneric<Integer> simpleGenericInteger = new SimpleGeneric<Integer>(123456);
		SimpleGeneric<String> simpleGenericString = new SimpleGeneric<String>("string");
		
		System.out.println(simpleGenericInteger.getKey());
		System.out.println(simpleGenericString.getKey());
		
		SimpleGeneric<Integer> simpleGeneric1 = new SimpleGeneric<Integer>(1234);
		SimpleGeneric<Double> simpleGeneric2 = new SimpleGeneric<Double>(12.3);
		SimpleGeneric<String> simpleGeneric3 = new SimpleGeneric<String>("crossFire");
		SimpleGeneric<PersonA> simpleGeneric4 = new SimpleGeneric<PersonA>(new PersonA());
		SimpleGeneric<Boolean> simpleGeneric5 = new SimpleGeneric<Boolean>(false);
		
		System.out.println(simpleGeneric1.getKey());
		System.out.println(simpleGeneric2.getKey());
		System.out.println(simpleGeneric3.getKey());
		System.out.println(simpleGeneric4.getKey());
		System.out.println(simpleGeneric5.getKey());
		
	}
}
