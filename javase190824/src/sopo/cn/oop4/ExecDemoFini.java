package sopo.cn.oop4;

import java.util.concurrent.TimeUnit;

public class ExecDemoFini {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		Process process = null;
		
		try {
			process = runtime.exec("notepad");
			process.waitFor(4, TimeUnit.SECONDS);
			process.destroy();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error to open notepad");
			e.printStackTrace();
		}
		
		System.out.println("notepad returned: " + process.exitValue());
	}
}
