package sopo.cn.javase190824;

import java.util.Arrays;
import java.util.Random;

/*双色球需求：红球选六个，蓝球选一个 
红球6个：1–33 
篮球1个：1–16
红球数组：1,2,3， …… 33 用随机数（Random） 
篮球数组：1,2,3， …… 16 random(16)+1
中奖数组：6个红一个蓝*/
public class DoubleColorBall {
	public static void main(String[] args) {
//		int[] red = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
//				28, 29, 30, 31, 32, 33};

		int[] sysRedBall = generateSixRed();
		int[] userRedBall = generateSixRed();
		int count = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (sysRedBall[i] == userRedBall[j]) {
					count++;
				}
			}
		}
		System.out.println("红球相同的个数:" + count);
		
		System.out.println("=================================");
		System.out.println("=================================");
		System.out.println("=================================");
		System.out.println("=================================");

		int sysBlueBall = generateOneBlue();
		int userBlueBall = generateOneBlue();
		if (sysBlueBall == userBlueBall) {
			System.out.println("蓝球相同");
		}else {
			System.out.println("蓝球不同");
		}
		
	}

	public static int[] generateSixRed() {
		int[] redBallPool = new int[33];
		int i = 0;
		// flag
		boolean isSame = false;
		while (i < redBallPool.length) {
			// 生成随机数1-33
			int generateR = new Random().nextInt(33) + 1;
			for (int j = 0; j < redBallPool.length; j++) {
				// 将sysRedBall[0-32]全都与generateR比较,一旦发现重复,isSame=true,结束掉for循环
				if (redBallPool[j] == generateR) {
					isSame = true;
					break;
				} else {
					isSame = false;
				}
			}
			if (!isSame) {
				redBallPool[i] = generateR;
				i++;
			}
		}
		System.out.println(Arrays.toString(redBallPool));

		// 取其前6个为结果
		int[] resultRedBall = Arrays.copyOfRange(redBallPool, 0, 6);
		System.out.println(Arrays.toString(resultRedBall));
		System.out.println("---------------------------------");

		return resultRedBall;
	}

	public static int generateOneBlue() {
		int[] blueBallPool = new int[16];
		int i = 0;
		// flag
		boolean isSame = false;
		while (i < blueBallPool.length) {
			// 生成随机数1-33
			int generateR = new Random().nextInt(16) + 1;
			for (int j = 0; j < blueBallPool.length; j++) {
				// 将sysRedBall[0-32]全都与generateR比较,一旦发现重复,isSame=true,结束掉for循环
				if (blueBallPool[j] == generateR) {
					isSame = true;
					break;
				} else {
					isSame = false;
				}
			}
			if (!isSame) {
				blueBallPool[i] = generateR;
				i++;
			}
		}
		System.out.println(Arrays.toString(blueBallPool));

		int resultBlueBall = blueBallPool[0];
		System.out.println(resultBlueBall);
		System.out.println("---------------------------------");
		
		return resultBlueBall;
	}
}
