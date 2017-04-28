package Homework.Ch09;

public class RandomPlus {
	public static double EvenNum(double num1, double num2) {
		double sum = 0;
		int count = 0;
		while (true) {
			int tmp = (int) num1 + (int) (Math.random() * (num2 - num1));
			if (tmp != 0 && tmp % 2 == 0) {
				System.out.println("抽到2-32之间的一个偶数 ： " + tmp);
				sum += tmp;
				count++;
			}
			if (count == 6) {
				break;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("和为：" + EvenNum(2, 32));
	}
}


