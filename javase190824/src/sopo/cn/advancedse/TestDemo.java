package sopo.cn.advancedse;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TestDemo {
	@Test
	public void test() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		//showKeyValue1(123)
		SimpleGeneric<Integer> gInteger = new SimpleGeneric<Integer>(1234);
		SimpleGeneric<Number> gNumber = new SimpleGeneric<Number>(5678);
		showKeyValue1(gInteger);
		showKeyValue1(gNumber);

		Object object = genericMethod(TestDemo.class);
		System.out.println(object);
		Object object2 = genericMethod(Class.forName("sopo.cn.advancedse.TestDemo"));
		System.out.println(object2);

		// 实例化一个泛型类GenerateTest
		GenerateTest<GenericFruit> generateTest = new GenerateTest<GenericFruit>();

		GenericFruit genericFruit = new GenericFruit();
		generateTest.show_0(genericFruit);

		Apple apple = new Apple();
		generateTest.show_0(apple);

		printMsg(123, "aaa", "cf", "fs", "pp", 0.218);
		
		//
		//SimpleGeneric<String> simpleGeneric = new SimpleGeneric<String>("hellojava");
		SimpleGeneric<Integer> simpleGeneric2 = new SimpleGeneric<Integer>(123);
		SimpleGeneric<Float> simpleGeneric3 = new SimpleGeneric<Float>(2.1F);
		SimpleGeneric<Double> simpleGeneric4 = new SimpleGeneric<Double>(3.14);
		
		//showKeyValue2(simpleGeneric);//String doesn't extends Number
		System.out.println("==========================================");
		showKeyValue2(simpleGeneric2);
		showKeyValue2(simpleGeneric3);
		showKeyValue2(simpleGeneric4);
		
		//
		System.out.println("@@@@@@@@@@@@@@@@");
		System.out.println(showKeyValue3(simpleGeneric3));
		
		// can't
		//List<String>[] ls = new ArrayList<String>[10];
		
		// can
		List<?>[] ls = new ArrayList<?>[10];
		System.out.println(ls.toString());
		
		// Not really allowed.    
		//List<String>[] lsa = new List<String>[10];
	
		// allowed
		List<?>[] lsa = new List<?>[10];
		Object o = lsa;
		Object[] oa = (Object[])o;
		List<Integer> li = new ArrayList<Integer>();
		li.add(new Integer(2));
		oa[1] = li;
		Integer i = (Integer)lsa[1].get(0);
		System.out.println(i);
		
		/////////////////////////////////////////////////////////////////////////////////////////////
	}

	public void showKeyValue1(SimpleGeneric<?> obj) {
		System.out.println(obj.getKey());
	}

	public <T> T genericMethod(Class<T> tClass) throws InstantiationException, IllegalAccessException {
		T instance = tClass.newInstance();
		return instance;
	}

	public <T> void printMsg(Object... a) {
		System.out.println("=========");
		for (Object t : a) {
			System.out.println(t);
		}
	}
	
////Potential heap pollution via varargs parameter a
//	public <T> void printMsg(T... a) {
//		System.out.println("========="); 
//		for (T t : a) {
//			System.out.println(t);
//		}
//	}

	public void showKeyValue2(SimpleGeneric<? extends Number> obj) {
		System.out.println(obj.getKey());
	}
	
	public <T extends Number> T showKeyValue3(SimpleGeneric<T> container) {
		return container.getKey();
	} 
	
}
