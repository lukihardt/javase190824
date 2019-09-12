package sopo.cn.advancedse;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		PersonA personA1 = new PersonA(1);
		PersonA personA2 = new PersonA(2);
		PersonA personA3 = new PersonA(3);
		
		Set<PersonA> set = new TreeSet<>(new PersonA());
		set.add(personA1);
		set.add(personA2);
		set.add(personA3);
		
		System.out.println(set);
	}
}
