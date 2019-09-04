package sopo.cn.oop3;

public class Parcel5 {
	public Destionation destination(String str) {
		class PDestination implements Destionation{
			private String label;
			private PDestination(String whereTo) {
				label = whereTo;
			}
			public void pri() {
				System.out.println(label);
			}
		}
		return new PDestination(str);
	}
	
	public static void main(String[] args) {
		Parcel5 parcel5 = new Parcel5();
		Destionation d = parcel5.destination("chenssy at Parcel5");
		d.pri();
	}
}
