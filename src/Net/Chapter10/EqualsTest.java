package Net.Chapter10;

public class EqualsTest {
	private Long longvalue;
	private Integer intvalue;
	private Character chanvalue;
	private Float floatvalue;
	private Double doublevalue;
	
	
	public Long getLongvalue() {
		return longvalue;
	}


	public void setLongvalue(Long longvalue) {
		this.longvalue = longvalue;
	}


	public Integer getIntvalue() {
		return intvalue;
	}


	public void setIntvalue(Integer intvalue) {
		this.intvalue = intvalue;
	}


	public Character getChanvalue() {
		return chanvalue;
	}


	public void setChanvalue(Character chanvalue) {
		this.chanvalue = chanvalue;
	}


	public Float getFloatvalue() {
		return floatvalue;
	}


	public void setFloatvalue(Float floatvalue) {
		this.floatvalue = floatvalue;
	}


	public Double getDoublevalue() {
		return doublevalue;
	}


	public void setDoublevalue(Double doublevalue) {
		this.doublevalue = doublevalue;
	}


	public static void main(String[] args) {
		EqualsTest test1 =new EqualsTest();
		EqualsTest test2 =new EqualsTest();
		
		System.out.println(test1);
		System.out.println(test2);
		
		EqualsTest test3 =new EqualsTest();
		EqualsTest test4 =test3;
		System.out.println(test3);
		System.out.println(test4);
		
		if (test1 ==test2){
			System.out.println("test1=test2");
		}else{
			System.out.println("test1!=test2");
		}
		
		if (test3 ==test4){
			System.out.println("test3=test4");
		}else{
			System.out.println("test3!=test4");
		}
	}
	

}
