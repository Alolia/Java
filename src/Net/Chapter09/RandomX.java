package Net.Chapter09;

import java.util.Random;

public class RandomX {

	public static void main(String[] args) {
		Random a = new Random();
		System.out.println("随机数-- "+a.nextInt());
		System.out.println("随机一个大于0小于10的数-- "+a.nextInt(10));
		System.out.println("随机一个布尔型数--  "+a.nextBoolean());
		System.out.println("随机一个双精度数--  "+a.nextDouble());
		System.out.println("随机一个浮点型数--  "+a.nextFloat());
	}

}
