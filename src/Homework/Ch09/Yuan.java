package Homework.Ch09;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Yuan {

	public static void main(String[] args) {
		System.out.print("请输入圆的半径=");
		Scanner input =new Scanner(System.in);
		int r =input.nextInt();
		
		NumberFormat s =new DecimalFormat("#.00000");
		double value =Math.PI*(Math.pow(r, 2));
		System.out.println("圆的面积为= "+ s.format(value));
	}

}
