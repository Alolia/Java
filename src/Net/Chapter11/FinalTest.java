package Net.Chapter11;

public class FinalTest {

	private static String value = "123";
	
	public static void main(String[] args) {
		FinalDemo finalDemo =new FinalDemo();
		finalDemo.setDemoValue("123");
		System.out.println(finalDemo.getDemoValue());
		System.out.println(finalDemo);
		
		FinalDemoChild child = new FinalDemoChild();
		child.setDemoValue("456");
		System.out.println(child);
		
	}

}

class FinalDemo{
	private String demoValue;
	public void setDemoValue(String demoValue){
		this.demoValue = demoValue;
	}
	public String getDemoValue(){
		return demoValue;
	}
	public String /*final*/ toString(){      //���Final�򱨴��޷����̳С�
		return getClass().getName()+ "[demoValue :"+ getDemoValue()+"]";
	}
}



class FinalDemoChild extends FinalDemo{
	public String toString(){
		return getClass().getName()+"???"+getDemoValue()+"???";
	}
}







