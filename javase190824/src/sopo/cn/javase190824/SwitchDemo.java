package sopo.cn.javase190824;

public class SwitchDemo {
	public static void main(String[] args) {
		stringTest();
		breakTest();
		defautTest();
	}

	private static void stringTest() {
		String string = new String("hello");
		switch (string) {
		case "hello":
			System.out.println("It's OK!");
			break;
		default:
			System.out.println("ERROR!");
			break;
		}
	}

	private static void breakTest() {
		char ch = 'A';
		switch (ch) {
		case 'B':
			System.out.println("case one");
		case 'A':
			System.out.println("case two");
		case 'C':
			System.out.println("case three");
		default:
			break;
		}
	}

	private static void defautTest() {
		char ch = 'A';
		switch (ch) {
		case 'B':
			System.out.println("case one");
			break;
		case 'A':
			System.out.println("case two");
			break;
		case 'C':
			System.out.println("case three");
			break;
		}
	}
}
