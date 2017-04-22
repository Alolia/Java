package Net.Chapter09;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Format {

	public static void main(String[] args) {
		NumberFormat nf =new DecimalFormat("#,###.##");
		double value=1999.9999d;
		
		System.out.println(nf.format(value));
		
		nf=new DecimalFormat("0000.0000");
		value =99.991d;
		System.out.println(nf.format(value));
	}

}
