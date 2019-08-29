package sopo.cn.javase190824;

import java.util.Arrays;
import sopo.cn.differentpackage.PrivateClass;

public class Test {
	public static void main(String[] args) {
		String str = "thinking in java";

		for (; str.length() > 0; str = str.substring(1)) {
			System.out.println(str);
		}

		/**
		 * 5��������ֱ����
		 */
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		RightTriangle();
		isoscelesTriangle();
		// �׳�
		factorial();
		// �žų˷���
		multipication();
//		outer��ǩ
//		breakdemo();
		// continue��ǩ:
		continuedemo();
		// arrDemo
		arr();
		printDemo();
		arr2();
		// ���ֵ��Сֵ�㷨
		maxMin();
		// ð������
		bubbleSort();
		// ѡ������
		//selectSort();
		
	}

	public static void RightTriangle() {
		// ����������
		for (int i = 0; i < 5; i++) {
			// ����ÿ�еĿո���
			for (int j = i; j < 4; j++) {
				System.out.print(" ");
			}
			// ����ÿ�е�*�ĸ���
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();// �������
		}
	}

	/**
	 * ��ӡ����������
	 */

	public static void isoscelesTriangle() {
		// ����������
		for (int i = 0; i < 5; i++) {
			// ����ÿ�еĿո���
			for (int j = i; j < 4; j++) {
				System.out.print(" ");
			}
			// ���*
			for (int k = 0; k < i * 2 + 1; k++) {
				System.out.print("*");
			}
			// ����
			System.out.println("");
		}
	}

	// �ö���ѭ����䣺�׳����1��+2��+����+10��
	public static void factorial() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			int mul = 1;
			for (int j = 1; j <= i; j++) {
				mul = mul * j;
			}
			sum += mul;
		}
		System.out.println(sum);
	}

	// �ö���ѭ����䣺��ӡ�žų˷���
	public static void multipication() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}
			System.out.println("");
		}
	}

	// outer��ǩ

	public static void breakdemo() {
		outer: for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= 100; j++) {
				System.out.print(i + "*" + j + "\t");
				if (i == 18 && j == 18) {
					break outer;
				}
			}
			System.out.println("");
		}
	}

	public static void continuedemo() {
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= 100; j++) {
				if (i == 18 && j == 18) {
					continue;
				}
				System.out.print(i + "*" + j + "\t");

			}
			System.out.println("");
		}
	}

	public static void arr() {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[] { 6, 7, 8, 9, 10 };
		int[] arr3 = new int[5];
		arr3[0] = 11;
		arr3[1] = 11;
		arr3[2] = 11;
		arr3[3] = 11;
		arr3[4] = 11;
		System.out.println(arr.toString());
		System.out.println(arr2);
		System.out.println(arr3);
		System.out.println(Arrays.toString(arr3));
	}

	// �������
	public static void printDemo() {
		// �����ַ��͵�����
		char[] arr = { 'A', 'B', 'C', 'D', 'E' };
		for (int i = 0; i < arr.length; i++) { // ���������εĲ���
			for (int j = i; j < arr.length; j++) { // ��ӡ�ո�
				System.out.print(" ");
			}
			for (int k = 0; k <= i * 2; k++) {
				System.out.print(arr[i]);
			}
			System.out.println();
		}
	}

	public static void arr2() {
		int[][] arr2 = new int[2][2];
		arr2[0][0] = 1;
		arr2[0][1] = 1;
		arr2[1][0] = 1;
		arr2[1][1] = 1;

		int[][] arr22 = new int[3][1];
		arr22[0][0] = 1;
		System.out.println(arr22[2][0]);
		System.out.println(arr22[1].length);

		System.out.println("------------------------");

		// �����֪��ô��,��θ�ֵ
		//int[][] arr23 = new int[4][];
	}

	public static void maxMin() {
		int[] arr = { 90, 10, 22, 45, 11, 6, 50, 30, 59, 31 };

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			max = max > arr[i] ? max : arr[i];
		}
		System.out.println(max);

		int min = arr[0];
		for (int j = 0; j < arr.length; j++) {
			min = min < arr[j] ? min : arr[j];
		}
		System.out.println(min);
	}

	public static void bubbleSort() {
		// int arr[] = { 3, 6, 4, 2, 11, 10, 5 };
		// int arr[] = { 1, 2, 3, 4, 5, 6, 7};
		int arr[] = { 7, 6, 5, 4, 3, 2, 1 };
		// length = 7;
		// 6, 4, 3, 2

		outer: for (int i = arr.length; i > 0; i--) {
			int count = 0;
			for (int j = 0; j < i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					count++;
				}
			}
			if (count == 0) {
				break outer;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void selectSort(int arr[]) {
		//int arr[] = { 1, 2, 3, 7, 8, 9, 5, 5};
		// ��һ��ѭ���ҳ���СֵΪ13,�±�Ϊ5
		// arr.length = 8
		int mark = 0;
		for (int i = 0; i < arr.length; i++) {
			int min = arr[i];
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					mark = j;
				}
			}
			if(mark > i) {
				arr[mark] = arr[i];
				arr[i] = min;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	PrivateClass pc = new PrivateClass();
}

//���Կ���github�ܷ��޸����ύ�ļ�
