package sopo.cn.oop4;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // �Ӽ��̽�������
        // next��ʽ�����ַ���
        System.out.println("next��ʽ���գ�");
        // �ж��Ƿ�������
        if (s.hasNext()) {
            String str1 = s.next();
            System.out.println("���������Ϊ��" + str1);
        }
        s.close();
    }
}
