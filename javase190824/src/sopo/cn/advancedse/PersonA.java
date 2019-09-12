package sopo.cn.advancedse;

import java.util.Comparator;

public class PersonA implements Comparator<PersonA> {
	public int age;

	public PersonA(int i) {
		// TODO Auto-generated constructor stub
		age = i;
	}
	
	public PersonA() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(PersonA o1, PersonA o2) {
		if (o1.age > o2.age) {
			return 1;
		} else if (o2.age > o1.age) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "PersonA [age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonA other = (PersonA) obj;
		if (age != other.age)
			return false;
		return true;
	}
}
