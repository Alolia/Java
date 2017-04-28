package Net.Chapter09;

import java.math.BigDecimal;

public class BigDecimalDemo {
	static final int location =10;
	
	public BigDecimal add(double value1,double value2){
		BigDecimal a =new BigDecimal(Double.toString(value1));
		BigDecimal b =new BigDecimal(Double.toString(value2));
		return a.add(b);
	}
	
	public BigDecimal sub(double value1,double value2){
		BigDecimal a =new BigDecimal(Double.toString(value1));
		BigDecimal b =new BigDecimal(Double.toString(value2));
		return a.subtract(b);
	}

	public BigDecimal mul(double value1,double value2){
		BigDecimal a =new BigDecimal(Double.toString(value1));
		BigDecimal b =new BigDecimal(Double.toString(value2));
		return a.multiply(b);
	}
	
	public BigDecimal div(double value1,double value2){
		return div(value1,value2,location);
	}

	private BigDecimal div(double value1, double value2, int c) {
		
		BigDecimal a =new BigDecimal(Double.toString(value1));
		BigDecimal b =new BigDecimal(Double.toString(value2));
		return a.divide(b,c,BigDecimal.ROUND_HALF_UP);
	}
	
	public static void main(String[] args) {
		BigDecimalDemo c =new BigDecimalDemo();
		System.out.println("�������= "+c.add(-45, 12));
		System.out.println("�������= "+c.sub(-45, 12));
		System.out.println("�������= "+c.mul(-45, 12));
		System.out.println("�������= "+c.div(-84, 5));
		System.out.println("���������������С����6λ= "+c.div(-45, 12,6));
	}
	
}
