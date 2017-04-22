package Net.Chapter09;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MathTest {

	public static void main(String[] args) {
		//System.out.println(Math.sin(Math.PI/6));
		
		NumberFormat a =new DecimalFormat("00.00000000");
		double value =Math.sin(Math.PI/6);
		System.out.println(a.format(value));
		System.out.println(value);
	}

}
