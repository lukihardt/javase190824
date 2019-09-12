package sopo.cn.advancedse;

import java.util.Random;

public class FruitGenerator implements Generator<String>{

	private String[] fruits = new String[]{"Apple", "orange", "pear", "banana"};
	
	@Override
	public String next() {
		// TODO Auto-generated method stub
		Random random = new Random();
		return fruits[random.nextInt(4)];
	}

}
