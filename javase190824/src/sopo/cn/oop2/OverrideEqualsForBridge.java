package sopo.cn.oop2;

public class OverrideEqualsForBridge {
	public int age = 3;
	public boolean equals(Object obj) {
		if( this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof OverrideEqualsForBridge)) {
			return false;
		}
		OverrideEqualsForBridge other = (OverrideEqualsForBridge) obj;
		if (other.age != 3) {
			return false;
		}
		return true;
	}
}
