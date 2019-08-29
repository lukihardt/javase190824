package sopo.cn.oop;

public class TestPoint {
	public static void main(String[] args) {
		Point point = new Point();
		point.x = 3;
		point.y = 2;
		
		System.out.println("before move, x is " + point.x + " y is " + point.y);
		point.movePoint(5, 6);
		System.out.println("after move, x is " + point.x + " y is " + point.y);
	}
}
