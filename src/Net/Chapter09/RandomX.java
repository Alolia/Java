package Net.Chapter09;

import java.util.Random;

public class RandomX {

	public static void main(String[] args) {
		Random a = new Random();
		System.out.println("�����-- "+a.nextInt());
		System.out.println("���һ������0С��10����-- "+a.nextInt(10));
		System.out.println("���һ����������--  "+a.nextBoolean());
		System.out.println("���һ��˫������--  "+a.nextDouble());
		System.out.println("���һ����������--  "+a.nextFloat());
	}

}
