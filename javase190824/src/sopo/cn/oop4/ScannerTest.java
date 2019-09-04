package sopo.cn.oop4;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // 从键盘接收数据
        // next方式接收字符串
        System.out.println("next方式接收：");
        // 判断是否还有输入
        if (s.hasNext()) {
            String str1 = s.next();
            System.out.println("输入的数据为：" + str1);
        }
        s.close();
    }
}
