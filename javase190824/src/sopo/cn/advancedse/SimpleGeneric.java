package sopo.cn.advancedse;

public class SimpleGeneric<T> {
	private T key;
	public SimpleGeneric(T key) {
		this.key = key;
	}
	public T getKey() {
		return key;
	}
	public void setKey(T key) {
		this.key = key;
	}
}
