package sopo.cn.oop4;

public class Key {
	private String k;
	public Key(String key) {
		k = key;
	}
	
	public boolean equals(Object object) {
		if (object instanceof Key) {
			Key key = (Key) object;
			return k.equals(key.k);
		}
		return false;
	}
	
	public int hashCode() {
		return k.hashCode();
	}
}
