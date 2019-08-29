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
		 * 5行六列正直角形
		 */
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		RightTriangle();
		isoscelesTriangle();
		// 阶乘
		factorial();
		// 九九乘法表
		multipication();
//		outer标签
//		breakdemo();
		// continue标签:
		continuedemo();
		// arrDemo
		arr();
		printDemo();
		arr2();
		// 最大值最小值算法
		maxMin();
		// 冒泡排序
		bubbleSort();
		// 选择排序
		//selectSort();
		
	}

	public static void RightTriangle() {
		// 外层控制行数
		for (int i = 0; i < 5; i++) {
			// 控制每行的空格数
			for (int j = i; j < 4; j++) {
				System.out.print(" ");
			}
			// 控制每行的*的个数
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();// 输出换行
		}
	}

	/**
	 * 打印等腰三角形
	 */

	public static void isoscelesTriangle() {
		// 外层控制行数
		for (int i = 0; i < 5; i++) {
			// 控制每行的空格数
			for (int j = i; j < 4; j++) {
				System.out.print(" ");
			}
			// 输出*
			for (int k = 0; k < i * 2 + 1; k++) {
				System.out.print("*");
			}
			// 换行
			System.out.println("");
		}
	}

	// 用多重循环语句：阶乘求和1！+2！+……+10！
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

	// 用多重循环语句：打印九九乘法表
	public static void multipication() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}
			System.out.println("");
		}
	}

	// outer标签

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

	// 程序入口
	public static void printDemo() {
		// 定义字符型的数组
		char[] arr = { 'A', 'B', 'C', 'D', 'E' };
		for (int i = 0; i < arr.length; i++) { // 控制三角形的层数
			for (int j = i; j < arr.length; j++) { // 打印空格
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

		// 这个不知怎么用,如何赋值
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
		// 第一遍循环找出最小值为13,下标为5
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

//测试看看github能否修改已提交文件
