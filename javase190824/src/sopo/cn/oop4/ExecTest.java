package sopo.cn.oop4;

import java.io.IOException;

public class ExecTest {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
//		Process process = null;
		try {
			runtime.exec("notepad");
			runtime.exec("calc");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
